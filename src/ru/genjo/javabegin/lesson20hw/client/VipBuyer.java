package ru.genjo.javabegin.lesson20hw.client;

public class VipBuyer extends Buyers {
    private  double discount;

    @Override
    public void buy() {
        if (checkDiscount()) {
            super.buy();
        } else {
            //Код
        }
    }

    @Override
    public void purchaseReturn() {
        super.purchaseReturn();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    private boolean checkDiscount () {
        return discount > 0;
    }
}
