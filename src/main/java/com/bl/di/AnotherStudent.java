package com.bl.di;

public class AnotherStudent {

    private ICheat cheat;

    public void setCheat(ICheat cheat) {
        this.cheat = cheat;
    }

    public void startCheating(){
        cheat.cheat();
    }
}
