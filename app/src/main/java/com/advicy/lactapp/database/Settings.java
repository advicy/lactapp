package com.advicy.lactapp.database;
import java.util.*;

public class Settings {

    Profile profile;
    Sound sound;
    Notifications notifications;

    public Settings(String name, int age, char femaleMale, int key,
                    int soundMain, int soundVoice, int soundMusic,
                    boolean pushNotifications, int remindTrainingTime) {

        profile = new Profile(name,age,femaleMale,key);
        sound = new Sound(soundMain,soundVoice,soundMusic);
        notifications = new Notifications(pushNotifications,remindTrainingTime);
    }


}
