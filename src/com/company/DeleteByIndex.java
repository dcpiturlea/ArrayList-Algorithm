package com.company;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class DeleteByIndex {

    public void DeteleByIndexMethod() {
        Scanner in = new Scanner(System.in);
        System.out.println("What index want to delete? ");
        int index = in.nextInt();
        ArrayStructures.theArray.remove(index);
        System.out.println("Now");
        ArrayStructures.printArray();
    }


}