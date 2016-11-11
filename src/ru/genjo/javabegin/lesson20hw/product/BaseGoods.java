package ru.genjo.javabegin.lesson20hw.product;

import ru.genjo.javabegin.lesson20hw.department.BaseDepartment;

public abstract class BaseGoods {
    private  double price;
    private boolean hasGuarant;
    private String name;
    private BaseDepartment department;
    private String company;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isHasGuarant() {
        return hasGuarant;
    }

    public void setHasGuarant(boolean hasGuarant) {
        this.hasGuarant = hasGuarant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseDepartment getDepartment() {
        return department;
    }

    public void setDepartment(BaseDepartment department) {
        this.department = department;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
