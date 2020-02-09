package com.company;

import javax.jws.soap.SOAPBinding;

public class Main {

    private static Runnable runnable = new Runnable() {
        @Override
        public void run() {
            for (int i = 1; i < 100; i++) {
                cricket.setScore(i);
                cricket.notifyObserver();
                if (i == 35) {
                    cricket.Subscribe(user2);
                    cricket.Subscribe(user3);
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };
    private static Cricket cricket;
    private static User2 user2;
    private static User1 user1;
    private static User1 user3;


    public static void main(String[] args) {
        // write your code here
        System.out.println("hasif");
        cricket = new Cricket(90);
        user1 = new User1();
        user3 = new User1();
        user2 = new User2();

        cricket.Subscribe(user1);
        cricket.Subscribe(user2);
        cricket.notifyObserver();
        cricket.setScore(100);
        cricket.unSubscribe(user1);
        cricket.notifyObserver();

        final Thread thread = new Thread(runnable);
        thread.start();
    }
}
