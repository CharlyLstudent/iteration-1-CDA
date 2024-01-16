package org.example;

import exo.LoopConditionsFunctions.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Count to 100 with While Loop");
        Exercice2A_1_suite_de_nombres_simple.countToHundredWhile(100);

        System.out.println("----------------------------");

        System.out.println("Count to 100 with For Loop");
        Exercice2A_1_suite_de_nombres_simple.countToHundredFor(100);

        System.out.println("----------------------------");

        System.out.println("Only Even numbers from For Loop");
        Exercice2A_1_suite_de_nombres_simple.onlyEvenNumbersFromLoop(100);

        System.out.println("----------------------------");

        System.out.println("Smallest superior square of n : ");
        System.out.println(Exercice2A_2_suite_de_nombres.returnSmallestSquareSuperior(43));

        System.out.println("----------------------------");

        System.out.println("Smallest superior square of n V2 : ");
        System.out.println(Exercice2A_2_suite_de_nombres.returnSmallestSquareV2(43));

        System.out.println("----------------------------");

        System.out.println("Biggest inferior square of n : ");
        System.out.println(Exercice2A_2_suite_de_nombres.returnBiggestSquareInferior(30));

        System.out.println("----------------------------");

        System.out.println("Biggest inferior square of n : ");
        System.out.println(Exercice2A_3_suite_de_fibonacci.fibo(10));

        System.out.println("----------------------------");

        System.out.println("Approximation Fibonacci");
        System.out.println(Exercice2A_3_suite_de_fibonacci.approximation_fibo(0.01));

        System.out.println("----------------------------");

        System.out.println("display number of caracters in a string from arraylist");
        Exercice2B_4_introduction.describe();

        System.out.println("----------------------------");

        System.out.println("display number of caracters in a string from arraylist with while loop");
        Exercice2B_4_introduction.describeWithWhile();

        System.out.println("----------------------------");
        System.out.println("Decrypt the hidden message");
        Exercice2B_5_parchemin.decrypt();
    }

}