package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeleteByIndex extends AddValueInArray {

    public void DeteleByIndexMethod() {
        Scanner in = new Scanner(System.in);
        boolean newDel = true;
        while (newDel) {
            System.out.println("What index want to delete? ");
            int index = in.nextInt();
            ArrayStructures.theArray.remove(index);

            System.out.println("Do you want delete a new value? Y/N :");

            String anotherAdd = in.next();

            if (anotherAdd.toUpperCase().equals("Y")) {
                newDel = true;
            } else {
                newDel = false;
            }

        }
        ArrayStructures.printArray();
    }


}