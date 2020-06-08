package com.advicy.lactapp.database;

public class Sound {

    private int soundMain;
    private int soundVoice;
    private int soundMusic;
    Sound(){};
    Sound(int soundMain, int soundVoice, int soundMusic) {
        this.soundMain = soundMain;
        this.soundVoice = soundVoice;
        this.soundMusic = soundMusic;
    }
    protected int getsoundMain(){return soundMain};
    protected void setsoundMain(int soundMain){
        this.soundMain = soundMain;
        return;
    }
    protected int getsoundVoice(){return soundVoice;}
    protected void setsoundVoice(int soundVoice){
        this.soundVoice = soundVoice;
        return;
    }
    protected int getsoundMusic(){return soundMusic;}
    protected void setsoundMusic(int soundMusic){
        this.soundMusic = soundMusic;
        return;
    }

}
