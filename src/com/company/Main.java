package com.company;

public class Main {

    public static void main(String[] args) {

        Lamborgini lamborgini = new Lamborgini("Lamborgini Diablo Coatl",385, 645, "новое", 6000000);
        System.out.println(lamborgini.hod() + "; " + lamborgini.dveri());
        Ferrari ferrari = new Ferrari("Ferrari F50", 325, 520, "б/у", 3000000);
        System.out.println(ferrari.hod() + "; " + ferrari.dveri());
        Toyota toyota = new Toyota("Toyota Corolla", 240, 132, "новое", 20000);
        System.out.println(toyota.hod() + "; " + toyota.dveri());
    }
}
