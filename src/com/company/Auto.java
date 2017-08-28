package com.company;

public class Auto {

    String name;
    int max;
    int horses;
    String sostojanie;
    int cena;

    public Auto(String name, int max, int horses, String sostojanie, int cena) {
        this.name = name;
        this.max = max;
        this.horses = horses;
        this.sostojanie = sostojanie;
        this.cena = cena;

        System.out.println("Название: " + name + ". Макс. скорость: " + max + ". Лошадок: " + horses + ". Состояние: " + sostojanie + ". Цена (в евро): " + cena + ".");

    }
}

