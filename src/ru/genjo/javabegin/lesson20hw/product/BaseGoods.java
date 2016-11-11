package ru.genjo.javabegin.lesson20hw.product;

import ru.genjo.javabegin.lesson20hw.interfaces.IDepartment;
import ru.genjo.javabegin.lesson20hw.interfaces.IGoods;

public class BaseGoods implements IGoods {
    private double price;
    private boolean hasGuarant;
    private String name;
    private IDepartment department;
    private String company;

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setHasGuarant(boolean hasGuarant) {
        this.hasGuarant = hasGuarant;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(IDepartment department) {
        this.department = department;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean hasGuarant() {

        return false;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IDepartment getIDepartment() {
        return department;
    }

    @Override
    public String getCompany() {
        return company;
    }
}

