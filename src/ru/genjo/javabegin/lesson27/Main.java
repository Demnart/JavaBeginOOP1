package ru.genjo.javabegin.lesson27;


import ru.genjo.javabegin.lesson27.client.Buyer;
import ru.genjo.javabegin.lesson27.product.Computer;
import ru.genjo.javabegin.lesson27.product.TV;

/**
 * Created by Артем on 11.11.2016.
 * JavaBeginOOP1
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("Intel");
        TV tv = new TV("Toshiba");

        Buyer buyer = new Buyer();

        buyer.buy(computer);
        buyer.buy(tv);

    }
}
