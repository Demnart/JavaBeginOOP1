package ru.genjo.javabegin.lesson27.client;

import ru.genjo.javabegin.lesson20hw.interfaces.IVisitors;

public abstract class BaseBuyer implements IVisitors {
    private String name;

    @Override
    public void buy() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void returnGoods() {


    }
}
