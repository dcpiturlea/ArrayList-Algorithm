package com.company;

import java.util.Scanner;

public class GetArrayFunction extends ArrayStructures {

    private byte caseFunctions = 0;
    Scanner in = new Scanner(System.in);

    public void ChoseTheFunction(){
       ArrayStructures newArray = new ArrayStructures();
       newArray.generateRandomArray();
       newArray.printArray();

        System.out.println("\nPlease chose a function number: ");
        System.out.println("1:---Check if a value exist in the array, and if yes, see how many time and the index values");
        System.out.println("2:---Find a value by index!" );
        System.out.println("3:---Delete a value by index" );
        System.out.println("4:---Add a value to Array" );
        caseFunctions = in.nextByte();

        switch (caseFunctions){

            case 1: newArray.GetIfTheValueExist(); break;
            case 2: newArray.getValueAtIndex(); break;
            case 3: newArray.DeteleByIndexMethod(); break;
            case 4: newArray.AdValueMethod(); break;
        }

    }

}
