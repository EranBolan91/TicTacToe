package com.homework.company;

public class Main {

    public static void main(String[] args) {
        boolean win = true;
        int countPlays = 0; // count each play
        String typeToPrint = "X";

        String[][] board = {{"", "", ""}, {"", "", ""}, {"", "", ""}};
        Board.printBoard(board);
        System.out.println("");

        while(win) {
            Prints.printUserChoice(board,typeToPrint); // start the game. gets the user choice
            countPlays++;
            if(typeToPrint.equals("X"))
                typeToPrint = "O";
            else
                typeToPrint = "X";

            // count 5 times of users playing. only on the fifth time someone can win.
            // i did it to save time of checking
            if(countPlays == 5){
               if( Check.checkIfWin(board))
                {
                    switch(typeToPrint){
                        case "X":
                            typeToPrint = "O";
                        case "O":
                            typeToPrint = "X";
                    }

                    System.out.println(typeToPrint + " has won!");
                    System.out.println();
                    break;
                }
            }else if(countPlays == 9){ // if the count of plays gets to 9 its draw
                System.out.println("Its a DRAW");
                break;
            }
        }


    }
}
