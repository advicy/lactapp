package com.advicy.lactapp.database;

public class Sound {

    private int soundMain;
    private int soundVoice;
    private int soundMusic;

    public Sound(int soundMain, int soundVoice, int soundMusic){
        this.soundMain = soundMain;
        this.soundVoice = soundVoice;
        this.soundMusic = soundMusic;
    }

    public int getSoundMain() {
        return soundMain;
    }
    public void setSoundMain(int soundMain){
        this.soundMain = soundMain;
    }
    public int getSoundVoice(){
        return soundVoice;
    }
    public void setSoundVoice(int soundVoice){
        this.soundVoice = soundVoice;
    }
    public int getSoundMusic(){
        return soundMusic;
    }
    public void setSoundMusic(int soundMusic){
        this.soundMusic = soundMusic;
    }
}
