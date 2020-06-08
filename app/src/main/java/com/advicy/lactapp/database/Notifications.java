package com.advicy.lactapp.database;

public class Notifications {
    private boolean pushNotifications;
    private int remindTrainingTime;
    Notifications(){};
    Notifications(boolean pushNotifications, int remindTrainingTime) {
        this.pushNotifications = pushNotifications;
        this.remindTrainingTime = remindTrainingTime;
    }

    protected boolean getpushNotifications(){return pushNotifications;}
    protected void setpushNotifications(boolean pushNotifications){
        this.pushNotifications = pushNotifications;
        return;
    }
    protected int getRemindTrainingTime(){return remindTrainingTime;}
    protected void setRemindTrainingTime(int remindTrainingTime){
        this.remindTrainingTime = remindTrainingTime;
        return;
    }

}
