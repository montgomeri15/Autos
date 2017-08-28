package com.company;

public class Toyota extends Auto implements Inter {


    public Toyota(String name, int max, int horses, String sostojanie, int cena) {
        super(name, max, horses, sostojanie, cena);
    }

    @Override
    public String hod() {
        return "Средний";
    }

    @Override
    public String dveri() {
        return "4 двери\n";
    }
}
