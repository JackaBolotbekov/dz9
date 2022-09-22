package com.company;

public class Dog extends Animal{
private int winRound;

    public int getWinRound() {
        return winRound;
    }

    public Dog(String name, int age, Shelter shelter, Color color, int winRound) {
        super(name, age, shelter, color);
        this.winRound = winRound;
    }


    public final void Dog( int winRound){
        this.winRound = winRound;
    }
    public String printInfo(){
        return super.printInfo() + ", Количество Побед: " + getWinRound();
    }
}
