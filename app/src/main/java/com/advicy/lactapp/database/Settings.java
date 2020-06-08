package com.advicy.lactapp.database;
import java.util.*;

public class Settings {

    public Profile profileSetting;
    public Sound soundSetting;
    public Notifications notifiSetting;
    private int key;

    public Settings(){
        profileSetting = new Profile();
        soundSetting = new Sound();
        notifiSetting = new Notifications();
    };
    /*Settings(Profile profilesetting){
        this.profileSetting = profilesetting;
        soundSetting = new Sound();
        notifiSetting = new Notifications();
    }
    Settings(Sound soundSetting){
        profileSetting = new Profile();
        this.soundSetting = soundSetting;
        notifiSetting = new Notifications();
    }
    Settings(Notifications notifiSetting){
        profileSetting = new Profile();
        soundSetting = new Sound();
        this.notifiSetting = notifiSetting;
    }
    Settings(Profile profilesetting, Sound soundSetting){
        this.profileSetting = profilesetting;
        this.soundSetting = soundSetting;
        notifiSetting = new Notifications();
    }
    Settings(Profile profileseting, Notifications notifisetting){
        this.profileSetting = profileseting;
        soundSetting = new Sound();
        this.notifiSetting = notifisetting;
    }
    Settings(Sound soundsetting, Notifications notifisetting){
        profileSetting = new Profile();
        this.soundSetting = soundsetting;
        this.notifiSetting = notifisetting;
    }
    */

    //Methods for the profile
    public String getProfileName(){return profileSetting.getName();}
    public void setProfileName(String name){
        this.profileSetting.setName(name);
    }

    public int getProfileAge(){return profileSetting.getAge();}
    public void setProfileAge(int age){
        this.profileSetting.setAge(age);
    }

    public char getProfileGender(){return profileSetting.getGender();}
    public void setProfileGender(char gender){
        this.profileSetting.setGender(gender);
    }

    public int getProfileKey(){return profileSetting.getKey();}
    public void setProfileKey(int key){
        this.profileSetting.setKey(key);
    }

    public void setProfileSetting(String name, int age, char gender, int key) {
        this.profileSetting.setName(name);
        this.profileSetting.setAge(age);
        this.profileSetting.setGender(gender);
        this.profileSetting.setKey(key);
    }

    //Methods for the sound
    public int getSoundSettingsoundMain(){return this.soundSetting.getsoundMain();}
    public void setSoundSettingsoundMain(int soundMain){
        this.soundSetting.setsoundMain(soundMain);
    }
    public int getSoundSettingsoundVoice(){return this.soundSetting.getsoundVoice();}
    public void setSoundSettingsoundVoice(int soundVoice){
        this.soundSetting.setsoundVoice(soundVoice);
    }
    public int getSoundSettingsoundMusic(){return this.soundSetting.getsoundMusic();}
    public void setSoundSettingsoundMusic(int soundMusic){
        this.soundSetting.setsoundMusic(soundMusic);
    }
    public void setSoundSettings(int soundMain, int soundVoice, int soundMusic){
        this.soundSetting.setsoundMain(soundMain);
        this.soundSetting.setsoundVoice(soundVoice);
        this.soundSetting.setsoundMusic(soundMusic);
    }

    //Methods for the notifications
    public boolean getNotificationsSettingpushNotifications(){return this.notifiSetting.getpushNotifications();}
    public void setNotificationsSettingpushNotifications(boolean pushNotifications) {
        this.notifiSetting.setpushNotifications(pushNotifications);
    }

    public int getremindTrainingTime(){return this.notifiSetting.getRemindTrainingTime();}
    public void setremindTrainingTime(int remindTrainingTime){
        this.notifiSetting.setRemindTrainingTime(remindTrainingTime);
    }

    //public boolean searchName(String name){}

}
