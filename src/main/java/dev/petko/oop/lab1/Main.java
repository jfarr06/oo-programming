/*
 * @file: Main.java
 * @desc: Main entrypoint for all problems within lab1.
 * @author: James Farrelly (C24402114)
 * */

package dev.petko.oop.lab1;

import dev.petko.oop.CallWrapper;

public class Main 
{
    public static void main(String[] args) 
    {
        CallWrapper.runMain("problem 1", Problem1::main, args);
        CallWrapper.runMain("problem 2", Problem2::main, args);
        CallWrapper.runMain("problem 3", Problem3::main, args);
        CallWrapper.runMain("problem 4", Problem4::main, args);
    }
}
