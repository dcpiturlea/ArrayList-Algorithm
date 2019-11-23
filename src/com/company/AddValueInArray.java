package com.company;

import java.util.Scanner;

public class AddValueInArray {

    public void AdValueMethod() {
        Scanner in = new Scanner(System.in);
        boolean newAdd = true;

        while (newAdd == true) {
            System.out.println("Which is the value do you want to add to the Array: ");
            int addValue = in.nextInt();

            ArrayStructures.theArray.add(addValue);

            System.out.println("Do you want add a new value? Y/N :");

            String anotherAdd = in.next();

            if (anotherAdd.toUpperCase().equals("Y")) {
                newAdd = true;
            } else {
                newAdd = false;
            }

        }
        ArrayStructures.printArray();

    }
}
