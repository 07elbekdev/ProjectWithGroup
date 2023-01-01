package main;

import animal.BreedOfAnimals;
import animal.Cat;
import animal.Dog;
import animal.Duck;

import java.util.*;

public class Service {
    void search() {
        Scanner a = new Scanner(System.in);
        System.out.println("1) Find by name : ");
        System.out.println("2) Find by color : ");
        System.out.println("3) Find by breed : ");
        System.out.println("4) Find by age : ");
        System.err.println("5) Exit : ");
        int k = a.nextInt();
        System.out.println("Find by name : ");
        ArrayList<Cat> arrayList = new ArrayList<>();
        arrayList.add(new Cat("Junior", 14, "white"));
        String na = a.next();
        if (Objects.equals(na, BreedOfAnimals.Boxers)) {
            arrayList.forEach(System.out::println);
        }
    }
}