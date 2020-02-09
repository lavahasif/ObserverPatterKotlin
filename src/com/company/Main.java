package com.company;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("hasif");
        final Cricket cricket = new Cricket(90);
        final User1 user1 = new User1();
        final User2 user2 = new User2();

        cricket.Subscribe(user1);
        cricket.Subscribe(user2);
        cricket.notifyObserver();
        cricket.setScore(100);
        cricket.unSubscribe(user1);
        cricket.notifyObserver();
    }
}
