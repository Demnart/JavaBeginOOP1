package ru.genjo.javabegin.lesson25;

/**
 * Created by Артем on 11.11.2016.
 * JavaBeginOOP1
 */
public class Animal {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    void sleep() {
        System.out.println("Sleeep");
    }
}
