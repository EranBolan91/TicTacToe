package com.homework.company;

/**
 * Created by Bolandian on 22/01/2017.
 */
public class Check {


    // check if the input is between 1 to 3
    static boolean checkInputUser(int choice){
        boolean flag = false;
        if(choice <= 3 && choice >= 1) {
            flag = true;
        }
        return flag;
    }


    //method that checks if there is input X or O
    // if there is input it return false otherwise it return true
    static boolean isEmpty(String arr[][],int row,int column){
        if(!(arr[row][column] == "")){
            return false;

        }
        return true;
    }


    // method that checks if there is a seria
    static boolean checkIfWin(String arr[][]){
        boolean flag = false;

        // diagonal line from left to right
        if(arr[0][0].equals(arr[1][1]) && arr[1][1].equals(arr[2][2])|| arr[1][1] != ""){
            return true;
        }else
            flag = false;

        // diagonal line from right to left
        if(arr[0][2].equals(arr[1][1]) && arr[1][1].equals(arr[2][0])|| arr[1][1] != ""){
            return true;
        }else
            flag = false;

        // checks the first line from left to right
        if(arr[0][0].equals(arr[0][1]) && arr[0][1].equals(arr[0][2])|| arr[0][1] != ""){
            return true;
        }else
            flag = false;

        // checks the second line from left to right
        if(arr[1][0].equals(arr[1][1]) && arr[1][1].equals(arr[1][2])|| arr[1][1] != ""){
            return true;
        }else
            flag = false;

        // checks the third line from left to right
        if(arr[2][0].equals(arr[2][1]) && arr[2][1].equals(arr[2][2])|| arr[2][1] != ""){
            return true;
        }else
            flag = false;

        // checks the first line from TOP to BOTTOM
        if(arr[0][0].equals(arr[1][0]) && arr[1][0].equals(arr[2][0])|| arr[1][0] != ""){
            return true;
        }else
            flag = false;

        // checks the second line from TOP to BOTTOM
        if(arr[0][1].equals(arr[1][1]) && arr[1][1].equals(arr[2][1])|| arr[1][1] != ""){
            return true;
        }else
            flag = false;

        // checks the third line from TOP to BOTTOM
        if(arr[0][2].equals(arr[1][2]) && arr[1][2].equals(arr[2][2]) && arr[1][2] != ""){
            return true;
        }else
            flag = false;

        return flag;
    }

}
