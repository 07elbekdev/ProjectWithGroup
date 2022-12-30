package main;

import animal.BreedOfAnimals;
import animal.Dog;

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
        if (k == 1) {
            System.out.println("Find by name : ");
            String some = a.next();
            Map<Integer, String> array = new HashMap();
            if (Objects.equals(some, BreedOfAnimals.Boxers)) {
                System.out.println(BreedOfAnimals.Boxers.toString());
            }
        }
    }
}