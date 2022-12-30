package main;

import animal.BreedOfAnimals;

import java.util.Objects;
import java.util.Scanner;

public class Service {
    void search(){
        Scanner a = new Scanner(System.in);
        String b = a.nextLine();
        if (Objects.equals(b,BreedOfAnimals.Boxers)) {
            System.out.println(BreedOfAnimals.Boxers.name());
        }
    }
}