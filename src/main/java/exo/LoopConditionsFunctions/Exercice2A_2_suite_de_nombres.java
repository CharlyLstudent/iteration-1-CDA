package exo.LoopConditionsFunctions;

public class Exercice2A_2_suite_de_nombres {
    public static int returnSmallestSquareSuperior(int n) {
        int tempSquare = 0;
        for (int i = 0; i < n; i++) {
            tempSquare = i * i;
            if (tempSquare > n) {
                System.out.println("im I, my value is : " + i);
                n = tempSquare;
                break;
            }
        }
        return n;
    }

    public static int returnSmallestSquareV2(int n) {
        int tempCalculateSquare = 0;
        int i = 0;
        do {
            i++;
            tempCalculateSquare = i * i;
        } while (tempCalculateSquare < n);
        n = tempCalculateSquare;
        return n;

    }

    public static int returnBiggestSquareInferior(int n) {
        int tempCalculateSquare = 0;
        int i = 0;
        do {
            i++;
            tempCalculateSquare = i * i;
        } while (tempCalculateSquare < n);

        n = (i-1) * (i-1);
        return n;
    }
}
