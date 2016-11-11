package ru.genjo.javabegin.lesson27.client;

import ru.genjo.javabegin.lesson27.interfaces.IGoods;
import ru.genjo.javabegin.lesson27.interfaces.IVisitors;

public abstract class AbstractVisitor implements IVisitors {
    private String name;


    @Override
    public void buy(IGoods goods) {
        System.out.println(goods.getName());

    }

    @Override
    public void returnGoods(IGoods goods) {

    }

    @Override
    public String getName() {
        return null;
    }
}
