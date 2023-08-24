package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Bienvenue sur FIzzBuzz, veuillez saisir un chiffre : ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.execute(number);
        System.out.println(result);
    }
}
