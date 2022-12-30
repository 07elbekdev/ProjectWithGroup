package main;

import animal.BreedOfAnimals;

import java.util.*;

public class Service {
    void search(){
        Scanner a = new Scanner(System.in);
        System.out.println("1) FInd by name : ");
        System.out.println("2) Find by color : ");
        System.out.println("3) Find by breed : ");
        System.out.println("4) Find by age : ");
        System.err.println("5) Exit : ");
        String b = a.nextLine();
        int k = a.nextInt();
        if (k==1){
            System.out.println();
        }
        Map<String,BreedOfAnimals> array = new HashMap();
        array.put("Mastiff", BreedOfAnimals.Mastiff);
        array.put("Border", BreedOfAnimals.Border);
        System.out.println(array);
        }
    }