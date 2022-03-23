package com.company;

public class Main {

    public static void main(String[] args) {

        int deliveryDistance = 95;
        int timeToClient = 0;
        int buffer = (deliveryDistance - 20) / 40;

        if (deliveryDistance <= 20) {
            timeToClient = 1;            
        }
        else {
            timeToClient = buffer + 2;
        }
        System.out.println("Срок доставки:"+timeToClient);
    }
}
