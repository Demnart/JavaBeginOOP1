package ru.genjo.javabegin.lesson27.product;

import ru.genjo.javabegin.lesson20hw.interfaces.IElectronicGoods;

public  class ElectronicProduct extends AbstractGoods implements IElectronicGoods {

    public ElectronicProduct() {
        super();
    }

    public ElectronicProduct(String name) {
        super(name);
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    public void loadOS() {

    }
}
