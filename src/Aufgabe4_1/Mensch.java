package Aufgabe4_1;

public class Mensch {
    private String name;
    private double groesse;
    private int alter;


    Mensch(String name,double groesse,int alter){
        this.name = name;
        this.groesse = groesse;
        this.alter = alter;

    }
    void Print(){
        System.out.println(name);
        System.out.println(groesse);
        System.out.println(alter);

    }
}
