package com.company;


public class Main {

    public static void main(String[] args) {
        Programmer prog = new Programmer("Nurti","Programmer","Peaksoft");
        System.out.println(prog);
        prog.learn();
        prog.eat();
        prog.walk();
        prog.coding();
        Dancer dancer = new Dancer("Nuris","Dancer","Peaksoft");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancerMethod();
        Singer singer = new Singer("SDSDasdsa","Singer","Peaksoft");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.sigerMethod();
    }
}
