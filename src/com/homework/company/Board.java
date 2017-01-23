package com.homework.company;

/**
 * Created by Bolandian on 22/01/2017.
 */
public class Board {

    // print the inside of the board
    static void printBoard(String[] arr){
        System.out.printf("|");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4s|", arr[i]);
        }
        System.out.printf("\n________________\n");
    }

    //print the outside of the board
    static void printBoard(String[][] arr){
        System.out.printf("\n________________\n");
        for (int i = 0; i < arr.length; i++) {
            printBoard(arr[i]);
        }
    }
}
