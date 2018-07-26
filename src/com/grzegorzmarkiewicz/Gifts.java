package com.grzegorzmarkiewicz;


import java.util.ArrayList;
import java.util.List;

public class Gifts {
    public static void main(String[] args) {

        int counter = 0;
        long giver = 1L;
        long receiver = 1L;
        long sum = 0;
        long max = 7600000000L;

        List<Long> giverList = new ArrayList<>();
        List<Long> receiverList = new ArrayList<>();
        while (sum < max) {
            giverList.add(giver);
            receiverList.add(receiver);
            if (counter < 2) {
                giver += receiver;
                receiver = giver;
            } else if (counter < 4) {

                giver = giver + receiver - 1;
                receiver = giver;
            } else {
                giver += receiver - giverList.get(counter - 3);
                receiver = giver;
            }
            sum+=receiver;
            counter++;
            System.out.println(counter + " " +sum);
        }
        for (int j = 0; j < counter; j++) {
            System.out.println("G: " + giverList.get(j) + " | R: " + receiverList.get(j));
        }
        System.out.println("Liczba dni: " + counter);
    }
}
