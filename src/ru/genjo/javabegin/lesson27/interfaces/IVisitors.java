package ru.genjo.javabegin.lesson27.interfaces;

/**
 * Created by Артем on 11.11.2016.
 */
public interface IVisitors {

    void buy( IGoods goods);

    void returnGoods(IGoods goods);

    String getName();
}
