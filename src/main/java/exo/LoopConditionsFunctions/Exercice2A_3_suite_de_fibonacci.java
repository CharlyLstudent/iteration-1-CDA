package exo.LoopConditionsFunctions;

import java.util.ArrayList;

public class Exercice2A_3_suite_de_fibonacci {
    public static ArrayList<Integer> fibo(int fibonacci) {
        ArrayList<Integer> nombres = new ArrayList<>();
        int init1 = 0;
        int init2 = 1;
        int result = 0;
        for (int i = 1; i < fibonacci; i++) {
            result = init1 + init2;
            init1 = init2;
            init2 = result;
            nombres.add(result);
        }
        return nombres;
    }

    public static ArrayList<Integer> approximation_fibo(double epsilon) {
        double nombreDor = (1 + Math.sqrt(5)) / 2;
        int fibonacciSize = 10;
        ArrayList<Integer> nombres = new ArrayList<>();
        ArrayList<Integer> finalResult = new ArrayList<>();
        nombres.add(1);
        int init1 = 0;
        int init2 = 1;
        int result = 0;
        for (int i = 1; i < fibonacciSize; i++) {
            result = init1 + init2;
            init1 = init2;
            init2 = result;
            nombres.add(result);
        }

        for (int j = 1; j < nombres.size(); j++) {
            if (Math.abs(((double) nombres.get(j) / nombres.get(j - 1)) - nombreDor) <= epsilon) {
                finalResult.add(nombres.get(j - 1));
                finalResult.add(nombres.get(j));
                j = nombres.size(); // exit the loop
            }

        }
        return finalResult;
    }
}
