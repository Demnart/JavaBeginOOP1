package ru.genjo.javabegin.lesson20hw.interfaces;

import java.util.ArrayList;

/**
 * Created by Артем on 11.11.2016.
 */
public interface IDepartment {

    String  getName();

    ArrayList<IEmployee> getEmployeeList();

    ArrayList<IGoods> getGoodsList();


}
