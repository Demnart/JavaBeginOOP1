package ru.genjo.javabegin.lesson20hw;

import ru.genjo.javabegin.lesson20hw.client.Buyers;
import ru.genjo.javabegin.lesson20hw.department.BaseDepartment;
import ru.genjo.javabegin.lesson20hw.workers.Administrator;

import java.util.ArrayList;

public class SalesRoom {
    private ArrayList<BaseDepartment> departments;
    private String  name;
    private ArrayList<Buyers> buyerses;
    private Administrator administrator;
}
