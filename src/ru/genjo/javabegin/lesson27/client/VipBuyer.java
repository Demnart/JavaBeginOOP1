package ru.genjo.javabegin.lesson27.client;

public class VipBuyer extends AbstractVisitor {
    private  double discount;

    @Override
    public void buy() {
        if (!checkDiscount()) {
            super.buy();
        } else {

        }

    }

    private boolean checkDiscount() {
        return discount>0;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void returnGoods() {
        super.returnGoods();
    }
}
