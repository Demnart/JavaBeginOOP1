package ru.genjo.javabegin.lesson27.client;

import ru.genjo.javabegin.lesson27.interfaces.IGoods;

public class Buyer extends AbstractVisitor {

    @Override
    public void buy(IGoods goods) {
        super.buy(goods);
    }

    @Override
    public void returnGoods(IGoods goods) {
        super.returnGoods(goods);
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
