package ru.genjo.javabegin.lesson20hw.bank;

import ru.genjo.javabegin.lesson20hw.interfaces.IBank;

/**
 * Created by Артем on 11.11.2016.
 * JavaBeginOOP1
 */
public class BaseBank implements IBank {
    private String  name;
    private String creditDescription;


    @Override
    public String getCreditDescription() {
        return creditDescription;
    }

    @Override
    public void chekInfo() {

    }

    @Override
    public void getCredit() {

    }

    @Override
    public String getName() {
        return name;
    }
}
