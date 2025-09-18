package dev.petko.oop;

import java.util.function.Consumer;

public class CallWrapper
{
    public static void runMain(String name, Consumer<String[]> mainFunc, String[] args)
    {
        System.out.printf("========== Running %s ==========\n\n", name);

        mainFunc.accept(args);

        System.out.println();
    }
}
