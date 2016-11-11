package ru.genjo.javabegin.lesson20hw.department;

import ru.genjo.javabegin.lesson20hw.interfaces.IDepartment;
import ru.genjo.javabegin.lesson20hw.interfaces.IEmployee;
import ru.genjo.javabegin.lesson20hw.interfaces.IGoods;

import java.util.ArrayList;

public class BaseDepartment implements IDepartment {
    private String name;
    private ArrayList<IEmployee> emploees;
    private ArrayList<IGoods> goodses;



    @Override
    public String getName() {
        return name;
    }

    public void setGoodses(ArrayList<IGoods> goodses) {
        this.goodses = goodses;
    }

    @Override

    public ArrayList<IEmployee> getEmployeeList() {
        return emploees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmploees(ArrayList<IEmployee> emploees) {
        this.emploees = emploees;
    }

    @Override
    public ArrayList<IGoods> getGoodsList() {
        return goodses;

    }
}
