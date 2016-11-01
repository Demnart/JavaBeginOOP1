package ru.genjo.javabegin.lesson12.obj;

public class Door {
    private String color;
    private int height;

    public void test() {
        int count= 0;//Переменная существует только в методе
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
