package com.company;

public class Ferrari extends Auto implements Inter {


    public Ferrari(String name, int max, int horses, String sostojanie, int cena) {
        super(name, max, horses, sostojanie, cena);
    }

    @Override
    public String hod() {
        return "Средне-быстрый";
    }

    @Override
    public String dveri() {
        return "2 двери\n";
    }
}
