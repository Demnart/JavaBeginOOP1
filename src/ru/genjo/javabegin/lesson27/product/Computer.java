package ru.genjo.javabegin.lesson27.product;


public class Computer extends ElectronicProduct {
    public Computer() {
        super();
    }

    public Computer(String name) {
        super(name);
    }

    @Override
    public void on() {
        super.on();
    }

    @Override
    public void off() {
        super.off();
    }

    @Override
    public void loadOS() {
        super.loadOS();
    }
}
