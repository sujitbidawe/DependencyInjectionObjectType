package com.bl.di;

public class Student {

    private ICheat cheat;

    public void cheating(){
        cheat.cheat();
    }

    public void setCheat(ICheat cheat) {
        this.cheat = cheat;
    }
}
