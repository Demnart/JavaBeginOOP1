package ru.genjo.javabegin.lesson27.workers;

import ru.genjo.javabegin.lesson20hw.interfaces.IDepartment;
import ru.genjo.javabegin.lesson20hw.interfaces.IEmployee;

public abstract class AbstractEmployee implements IEmployee {
    private String name;
    private IDepartment department;
    private boolean free;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IDepartment getIDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(IDepartment department) {
        this.department = department;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    @Override
    public boolean isFree() {
        return false;
    }
}
