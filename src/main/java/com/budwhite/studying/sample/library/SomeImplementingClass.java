package com.budwhite.studying.sample.library;

public class SomeImplementingClass implements SomeInterface {

    private static final long WAIT_TIME_MS = 2000;

    public void someInterfaceMethod(Model model) {
        System.out.println("someInterfaceMethod starts with model " + model + ", will wait...");
        try {
            Thread.sleep(WAIT_TIME_MS);
        }
        catch (Exception e) {
            System.err.println("I could wait no longer");
        }
        System.out.println("...done waiting, someInterfaceMethod ends");
    }
}
