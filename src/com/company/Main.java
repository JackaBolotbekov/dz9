package com.company;

public class Main {
    public static void main(String[] args){
        Shelter shelter1 = new Shelter("Добрые Руки");
        Shelter shelter2 = new Shelter("Доброе Сердце");
        Shelter shelter3 = new Shelter("Выбери Меня");
      Dog dog = new Dog("Кангал",3,shelter1,Color.WHITE,10);
      FightDog fightDog = new FightDog("Рекс", 5, shelter2,Color.BLACK,15,25);
      FightDog fightDog1 = new FightDog("Рукфиз", 10, shelter3,29,Color.BROWN,7);
        System.out.println(dog.printInfo());
        System.out.println(fightDog.printInfo());
        System.out.println(fightDog1.printInfo());
    }
}
