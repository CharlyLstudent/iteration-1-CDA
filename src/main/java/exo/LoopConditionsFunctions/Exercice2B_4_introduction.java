package exo.LoopConditionsFunctions;

import java.util.ArrayList;

public class Exercice2B_4_introduction {
    public static void describe(){
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Jean");
        liste.add("Ahmed");
        liste.add("Lea");
        liste.add("Bianca");

        for( int i = 0; i< liste.size(); i++){
            System.out.println( liste.get(i)+ " : " + liste.get(i).length());
        }
    }

    public static void describeWithWhile(){
        ArrayList<String> liste = new ArrayList<>();
        liste.add("Jean");
        liste.add("Ahmed");
        liste.add("Lea");
        liste.add("Bianca");

        for( String listeElement : liste){
            System.out.println(listeElement + " : " + listeElement.length());
        }
    }

}
