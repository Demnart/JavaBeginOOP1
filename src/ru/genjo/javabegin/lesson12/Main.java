package ru.genjo.javabegin.lesson12;

import ru.genjo.javabegin.lesson12.obj.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.setName("Ferrary");
        car.setColor("Red");
        car.setHeight(150);

        System.out.println("Our car: " +car.getName() + " "+car.getColor() +" " + car.getHeight() );

    }
}
