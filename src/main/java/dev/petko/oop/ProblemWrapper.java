package dev.petko.oop;

import java.util.function.Consumer;

public class ProblemWrapper
{
    public static void runMain(String problemName, Consumer<String[]> mainFunc, String[] args)
    {
        System.out.printf("========== Running %s ==========\n\n", problemName);

        mainFunc.accept(args);

        System.out.println();
    }
}
