package com.company;

public class Lamborgini extends Auto implements Inter {


    public Lamborgini(String name, int max, int horses, String sostojanie, int cena) {
        super(name, max, horses, sostojanie, cena);
    }

    @Override
    public String hod() {
        return "Быстрый";
    }

    @Override
    public String dveri() {
        return "2 двери\n";
    }
}
