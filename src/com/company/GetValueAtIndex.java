package com.company;
/** Class: getValuesIndex is for searching the values by an index input
 */

import java.util.Scanner;

public class GetValueAtIndex extends SearchIfAValueExist{
    //function: you can find a value bassed on the index(input)
    public void getValueAtIndex () {
        Scanner in = new Scanner(System.in);
        boolean indexOutOfBounds = false;


        while(!indexOutOfBounds) {
            System.out.println("Please insert the index for get the value of him: ");
            int index = in.nextInt();

            if (index < ArrayStructures.theArray.size()) {
                indexOutOfBounds = true;
                System.out.println("The index " + index + " have the the next value: " + ArrayStructures.theArray.get(index));
            }

        }
    }
}
