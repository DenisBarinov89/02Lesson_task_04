package com.company;

public class Main {

    public static void main(String[] args) {

        int deliveryDistance = 95;
        int timeToClient = 1;

        if (deliveryDistance < 20) {
            timeToClient = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            timeToClient++;
        } else {
            timeToClient = timeToClient + 2;
        }
        System.out.println("Срок доставки:" + timeToClient);
    }
}
