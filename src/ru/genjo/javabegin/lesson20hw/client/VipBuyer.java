package ru.genjo.javabegin.lesson20hw.client;

public class VipBuyer extends BaseBuyer {
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
