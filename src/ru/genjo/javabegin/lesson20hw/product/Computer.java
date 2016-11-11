package ru.genjo.javabegin.lesson20hw.product;

import ru.genjo.javabegin.lesson20hw.department.BaseDepartment;

public class Computer extends ElectronicProduct {

    @Override
    void on() {
        super.on();
    }

    @Override
    void off() {
        super.off();
    }

    @Override
    void loadOS() {
        super.loadOS();
    }

    @Override
    public String getModelName() {
        return super.getModelName();
    }

    @Override
    public void setModelName(String modelName) {
        super.setModelName(modelName);
    }

    @Override
    public void setCompany(String company) {
        super.setCompany(company);
    }

    @Override
    public void setDepartment(BaseDepartment department) {
        super.setDepartment(department);
    }

    @Override
    public void setHasGuarant(boolean hasGuarant) {
        super.setHasGuarant(hasGuarant);
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public BaseDepartment getDepartment() {
        return super.getDepartment();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }
}
