package ru.genjo.javabegin.lesson27.interfaces;

/**
 * Created by Артем on 11.11.2016.
 */
public interface IGoods {

    double getPrice();

    boolean hasGuarant();

    String getName();

    IDepartment getIDepartment();

    String getCompany();
}
