package ru.genjo.javabegin.Lesson20;

public class Cat extends Feline { // Наша кошка наследуется от кошачих но при этом имеет доступ к главному классу животное и может
    // спокойно наследовать все его основные характеристики
    @Override
    void sleep() {
        super.sleep();
    }
}
