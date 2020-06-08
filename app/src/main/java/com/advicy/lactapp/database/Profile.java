package com.advicy.lactapp.database;
import java.util.*;

public class Profile {

    private String name;
    private int age;
    private char femaleMale;
    private int key;
    Profile(){};
    Profile(String name, int age, char femaleMale, int key) {
        this.name = name;
        this.age = age;
        this.femaleMale = femaleMale;
        this.key = key;
    }

    protected String getName() {return name;}
    protected void setName(String name){
        this.name = name;
        return;
    }
    protected int getAge() {return age;}
    protected void setAge(int age){
        this.age = age;
        return;
    }
    protected char getGender() {return femaleMale;}
    protected void setGender(char femaleMale) {
        this.femaleMale = femaleMale;
        return;
    }
    protected int getKey() {return key;}
    protected void setKey(int key) {
        this.key = key;
        return;
    }



}
