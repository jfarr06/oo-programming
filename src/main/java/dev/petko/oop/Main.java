/*
 * @file: Main.java
 * @desc: Main entrypoint for all labs.
 * @author: James Farrelly (C24402114)
 * */

package dev.petko.oop;

public class Main 
{
    public static void main(String[] args) 
    {
        CallWrapper.runMain("lab 1", dev.petko.oop.lab1.Main::main, args);
    }
}
