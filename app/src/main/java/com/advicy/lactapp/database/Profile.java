package com.advicy.lactapp.database;
import java.util.*;

public class Profile {

    private String name;
    private int age;
    private char femaleMale;
    private int key;

    public Profile(String name, int age, char femaleMale, int key){
        this.name = name;
        this.age = age;
        this.femaleMale = femaleMale;
        this.key = key;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public char getFemaleMale(){
        return femaleMale;
    }
    public void setFemaleMale(char femaleMale){
        this.femaleMale = femaleMale;
    }
    public int getKey(){
        return key;
    }
    public void setKey(int key){
        this.key = key;
    }

}
