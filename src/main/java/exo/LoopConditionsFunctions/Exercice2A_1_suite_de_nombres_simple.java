package exo.LoopConditionsFunctions;

public class Exercice2A_1_suite_de_nombres_simple {

    public static void countToHundredWhile(int integer){
        int i = 0;
        while (i < integer) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void countToHundredFor(int integer){
        for ( int i = 0; i < integer; i++) {
            System.out.print(i + " ");
        }
    }

    public static void onlyEvenNumbersFromLoop(int integer){

        for (int i =0; i < integer; i++){
            if ( i%2 == 0 )
            {
                System.out.print(i + " ");
            }
        }
    }
}
