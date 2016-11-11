package ru.genjo.javabegin.lesson20hw.product;

public abstract class ElectronicProduct extends BaseGoods {

    private String modelName;


    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }


    void on() {

    }

    void off() {

    }

    void loadOS() {

    }
}
