package com.advicy.lactapp.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

public class DatabaseHelper extends SQLiteOpenHelper{
    public static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Database";
    private static final String TABLE_NAMES = "names";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_AGE = "age";
    private static final String KEY_GENDER = "gender";

    public DatabaseHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        String CREATE_PROFILES_NAME = "CREATE TABLE " + TABLE_NAMES + "("
            + KEY_ID + "KEY," + KEY_NAME + " NAME," + KEY_AGE + "TEXT" +
            KEY_GENDER + "TEXT" + ")";
        db.execSQL(CREATE_PROFILES_NAME);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAMES);
        onCreate(db);
    }

    void addProfile(Profile profile) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME,profile.getName());
        values.put(KEY_AGE,profile.getAge());
        values.put(KEY_GENDER,(byte)profile.getFemaleMale());

        db.insert(TABLE_NAMES,null,values);
        db.close();
    }

    Profile getProfile(int id){
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAMES, new String[] { KEY_ID,
                        KEY_NAME, KEY_AGE, KEY_GENDER}, KEY_ID + "=?",
                new String[] { String.valueOf(id) }, null, null, null, null);
        if(cursor!=null) cursor.moveToFirst();

        Profile profile = new Profile(cursor.getString(1),Integer.parseInt(cursor.getString(2)),(char)(Integer.parseInt(cursor.getString(3))),Integer.parseInt(cursor.getString(0)));
        return profile;

    }

    public List<Profile> getAllProfiles() {
        List<Profile> profileList = new ArrayList<Profile>();
        String selectQuery = "SELECT * FROM " + TABLE_NAMES;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery,null);

        if(cursor.moveToFirst()) {
            do{
                Profile profile = new Profile();
                profile.setKey((Integer.parseInt(cursor.getString(0))));
                profile.setName(cursor.getString(1));
                profile.setAge(Integer.parseInt(cursor.getString(2)));
                profile.setFemaleMale((char)Integer.parseInt(cursor.getString(3)));
                profileList.add(profile);
            }while(cursor.moveToNext());
        }
        return profileList;
    }

    public int updateProfile(Profile profile){
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_NAME,profile.getName());
        values.put(KEY_AGE,profile.getAge());
        values.put(KEY_GENDER,(byte) profile.getFemaleMale());

        return db.update(TABLE_NAMES, values, KEY_ID + " = ?",
                new String[] { String.valueOf(profile.getKey()) });
    }

    public void deleteProfile(Profile profile) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_NAMES, KEY_ID + " = ?",
                new String[] { String.valueOf(profile.getKey()) });
        db.close();
    }

    public int getProfileCount(){
        String countQuery = "SELECT * FROM " + TABLE_NAMES;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        return cursor.getCount();
    }




}


