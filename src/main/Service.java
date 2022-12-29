package main;

import java.util.Scanner;

public class Service {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String result = a + b;
        System.out.println(result);
    }
}