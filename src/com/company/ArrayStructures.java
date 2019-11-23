package com.company;

import java.util.Scanner;

/** 1. Define an Array with 50 values maximum
    and a variable for dinamic size.
   2. Create multiples metods:
    a) the firs for populating the Array with random number
     from 1 to 20
    b) the second for printing the Array("in graphic mode")
    c) getValuesIndex is for searching the values by an index input
 */

public class ArrayStructures extends GetValueAtIndex{

    protected static int[] theArray = new int[50];
    protected static int arraySize = 10;
    Scanner in = new Scanner(System.in);


    public void generateRandomArray() {
        for (int i = 0; i < arraySize; i++)
            theArray[i] = (int) (Math.random() * 10) + 10;
    }

    public void printArray() {
        System.out.println("This is the Array");
        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {
            System.out.print(" | " + i + " | ");
            System.out.println(theArray[i] + " | ");
        }
        System.out.println("----------");
    }
}