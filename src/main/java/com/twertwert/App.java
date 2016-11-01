package com.twertwert;

/**
 * Blah
 * Created by gerab on 13/07/2016.
 */
public class App {

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }

}
