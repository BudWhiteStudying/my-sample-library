package com.budwhite.studying.sample.library;

public class SomeClass {

    private static final long WAIT_TIME_MS = 2000;

    public void someMethod(Model model) throws InterruptedException {
        System.out.println("someMethod starts with model " + model + ", will wait...");
        Thread.sleep(WAIT_TIME_MS);
        System.out.println("...done waiting, someMethod ends");
    }
}
