package com.company;
/** Class: getValuesIndex is for searching the values by an index input
 */

import java.util.Scanner;

public class GetValueAtIndex extends SearchIfAValueExist{
    //function: you can find a value bassed on the index(input)
    public void getValueAtIndex () {
        Scanner in = new Scanner(System.in);
        System.out.println("Please insert the index for get the value of him: ");
        byte index = in.nextByte();

        if (index < ArrayStructures.arraySize){
            System.out.println(ArrayStructures.theArray[index]);
        }
        else{
            System.out.println("Please insert an index from 0 to " + ArrayStructures.arraySize);
        }

    }
}
