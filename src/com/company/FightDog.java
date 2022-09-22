package com.company;

public final class FightDog extends Dog{

private int number;

    public int getNumber() {
        return number;
    }
    public FightDog(String name, int age, Shelter shelter, Color color, int winRound, int number ) {
        super(name, age, shelter, color, winRound);
        this.number = number;
    }
    public FightDog(String name, int age, Shelter shelter, int winRound,  Color color, int number ) {
        super(name, age, shelter, color, winRound);
        this.number = number;
    }
    public String printInfo(){
        return super.printInfo() + ", Номерация Собаки: " + getNumber() ;
    }


}
