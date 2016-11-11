package ru.genjo.javabegin.lesson20hw;

import ru.genjo.javabegin.lesson20hw.client.BaseBuyer;
import ru.genjo.javabegin.lesson20hw.department.BaseDepartment;
import ru.genjo.javabegin.lesson20hw.interfaces.IDepartment;
import ru.genjo.javabegin.lesson20hw.interfaces.IVisitors;
import ru.genjo.javabegin.lesson20hw.workers.Administrator;

import java.util.ArrayList;

public class SalesRoom {
    private ArrayList<IDepartment> departments;
    private String  name;
    private ArrayList<IVisitors> buyerses;
    private Administrator administrator;
}
