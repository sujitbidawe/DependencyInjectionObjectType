package com.bl.di;

public class Student {

    private int id;
    private MathCheat mathCheat;

    public void cheating(){
        mathCheat.mathCheat();
        System.out.println("my id is " + id + ", do whatever you want.");
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }
}
