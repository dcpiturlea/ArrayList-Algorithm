package com.company;

import java.util.Scanner;

public class SearchIfAValueExist  extends DeleteByIndex{
    Scanner in = new Scanner(System.in);

    public void GetIfTheValueExist() {
        System.out.println("Which is the value you are looking for: ");
        int theSearchValue = in.nextInt();
        int countNumberIfValueExist = 0;
        boolean exist = false;
        int i = 0;
        int j = 0;
        int[] numberOfIndex = new int[20];


        for (i = 0; i < ArrayStructures.theArray.size(); i++) {

            if (ArrayStructures.theArray.get(i) == theSearchValue) {
                j++;
                exist = true;
                countNumberIfValueExist++;
                numberOfIndex[j] = i;
                if (j == 1) {
                    System.out.print("The index where your value exist: " + numberOfIndex[j]);
                } else {
                    System.out.print(" , " + numberOfIndex[j]);
                }

            }
        }
        if (exist) {
            System.out.println("\nSo your value exist in the Array " + countNumberIfValueExist + " times");
        } else {
            System.out.println("Your value does not exist in the Array");
        }
    }
}
