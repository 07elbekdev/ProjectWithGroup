package main;

import animal.*;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        Methot();
    }

    public static void Methot() {
        Scanner in = new Scanner(System.in);
        Cat cat = new Cat("dage", 10, "black", PreedOfAnimals.Boxers);
        Cow cow = new Cow("dadas", 1, "jfa", PreedOfAnimals.Border);
        Dog dog = new Dog("dadaw", 5, "dajkd", PreedOfAnimals.Collie);
        Duck duck = new Duck("dakjfk", 4, "dak", PreedOfAnimals.German);
        Goat goat = new Goat("dad", 10, "da", PreedOfAnimals.Mastiff);
        Horse horse = new Horse("daf", 6, "dad", PreedOfAnimals.Shepherds);
        Parrot parrot = new Parrot("dak", 5, "da", PreedOfAnimals.German);
        Pork pork = new Pork("dnaksnd", 4, "dasl", PreedOfAnimals.Boxers);
        Rabbit rabbit = new Rabbit("da", 4, "da", PreedOfAnimals.Border);
        Sheep sheep = new Sheep("da", 7, "da", PreedOfAnimals.Boxers);
        System.out.println("Choose");
        int vbor = in.nextInt();
        while (true) {
            if (vbor == 1) {
                System.out.println("Choose age");
                int w = in.nextInt();
                if (w == cat.getAge()) {
                    System.out.println(cat);
                }
                if (w == cow.getAge()) {
                    System.out.println(cow);
                }
                if (w == dog.getAge()) {
                    System.out.println(dog);
                }
                if (w == duck.getAge()) {
                    System.out.println(duck);
                }
                if (w == goat.getAge()) {
                    System.out.println(goat);
                }
                if (w == horse.getAge()) {
                    System.out.println(horse);
                }
                if (w == parrot.getAge()) {
                    System.out.println(parrot);
                }
                if (w == pork.getAge()) {
                    System.out.println(pork);
                }
                if (w == rabbit.getAge()) {
                    System.out.println(rabbit);
                }
                if (w == sheep.getAge()) {
                    System.out.println(sheep);
                }
            }
            if (vbor == 2) {
                System.out.println("22");
                String name = in.nextLine();
                if (name.equals(cat.getName())) {
                    System.out.println(cat.toString());
                }
                if (name.equals(cow.getName())) {
                    System.out.println(cow.toString());
                }
                if (name.equals(dog.getName())) {
                    System.out.println(dog.toString());
                }
                if (name.equals(duck.getName())) {
                    System.out.println(duck.toString());
                }
                if (name.equals(goat.getName())) {
                    System.out.println(goat.toString());
                }
                if (name.equals(horse.getName())) {
                    System.out.println(horse.toString());
                }
                if (name.equals(parrot.getName())) {
                    System.out.println(parrot.toString());
                }
                if (name.equals(pork.getName())) {
                    System.out.println(pork.toString());
                }
                if (name.equals(rabbit.getName())) {
                    System.out.println(rabbit.toString());
                }
                if (name.equals(sheep.getName())) {
                    System.out.println(sheep.toString());
                }
            }
            if (vbor == 3) {
                System.out.println("33");
                System.out.println("1)Boxers\n2)Mastifff\n3)German\n4)Shepherds\n5)Border\n6)Collie");
                int enums = in.nextInt();
            }
            if (vbor == 3) {
                System.out.println("break");
                break;
            }
        }
    }
}

//    Boxers,
//    Mastiff,
//    German,
//    Shepherds,
//    Border,
//    Collie