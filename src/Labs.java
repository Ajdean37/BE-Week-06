package src;

import java.util.Scanner;

public class Labs {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    //Declare a gameBoard.  
		String[] gameBoard = new String[9];
    gameBoard[0] = "1";
    gameBoard[1] = "2";
    gameBoard[2] = "3";
    gameBoard[3] = "4";
    gameBoard[4] = "5";
    gameBoard[5] = "6";
    gameBoard[6] = "7";
    gameBoard[7] = "8";
    gameBoard[8] = "9";


		game.describe();

    char player1 = 'X';
    char player2 = 'O';

    for (int i = 0; i < gameBoard.length; i++) {
			if (i % 2 == 0) {
        System.out.println("Player 1, It's your turn");
      } else {
        System.out.println("Player 2, It's your turn");
      }
    }



	}


  public String display() {
    for (String game : gameBoard) {
      return game.display();
    }
  }

  public String checkWinStatus() {
    for (String game : gameBoard) {
      return game.checkWinStatus();
    }
  }
  
  public String initialize() {
    for (String game : gameBoard) {
      return game.initialize();
    }
  }



}