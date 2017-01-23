package com.homework.company;

import java.util.Scanner;

/**
 * Created by Bolandian on 22/01/2017.
 */

public class Prints {

    // this method gets from the user row and column to print it on the board
    static void printUserChoice(String[][] arr,String typeToPrint) {

            System.out.println("Please enter the row 1/2/3");

            Scanner scan = new Scanner(System.in);
            int row = scan.nextInt();
            while (!Check.checkInputUser(row)) { // check the range of the user input 1 - 3
                System.out.println("Please ENTER the right row");
                row = scan.nextInt();
            }

            System.out.println("Please enter the column 1/2/3");
            int column = scan.nextInt();
            while (!Check.checkInputUser(column)) {
                System.out.println("Please ENTER the right column");
                column = scan.nextInt();
            }
         while(Check.isEmpty(arr,row-1,column-1))
               arr[row - 1][column - 1] = typeToPrint;
               Board.printBoard(arr);

        }
}