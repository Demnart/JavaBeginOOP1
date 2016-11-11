package ru.genjo.javabegin.lesson27.product;


import ru.genjo.javabegin.lesson27.interfaces.IDepartment;
import ru.genjo.javabegin.lesson27.interfaces.IGoods;

public abstract class AbstractGoods implements IGoods {
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

