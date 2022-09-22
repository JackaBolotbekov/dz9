package com.company;

public abstract class Animal {
    private String name;
    private int age;
    private Shelter shelter;
    private Color color ;



    public Animal(String name, int age, Shelter shelter, Color color) {
        this.name = name;
        this.age = age;
        this.shelter = shelter;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public Color getColor() {
        return color;
    }
    public String printInfo(){
        return ("Имя: " + getName() + ", Возраст: " + getAge() + ", Приют: " + getShelter().getShelter()
                + ", Цвет: " + getColor()) ;
    }
}
