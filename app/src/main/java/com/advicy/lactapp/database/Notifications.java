package com.advicy.lactapp.database;

public class Notifications {

    private boolean pushNotifications;
    private int remindTrainingTime;

    public Notifications(boolean pushNotifications, int remindTrainingTime){
        this.pushNotifications = pushNotifications;
        this.remindTrainingTime = remindTrainingTime;
    }

    public boolean getPushNotifications(){
        return pushNotifications;
    }
    public void setPushNotifications(boolean pushNotifications){
        this.pushNotifications = pushNotifications;
    }
    public int getRemindTrainingTime(){
        return remindTrainingTime;
    }
    public void setRemindTrainingTime(int remindTrainingTime){
        this.remindTrainingTime = remindTrainingTime;
    }
}
