package ru.genjo.javabegin.lesson15;

import ru.genjo.javabegin.lesson15.obj.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Phone phone1 = new Phone(1024, "Samsung", "GSM");
        System.out.println("type: " + phone1.getType());
        System.out.println("ram: " + phone1.getRam());
    }
}
