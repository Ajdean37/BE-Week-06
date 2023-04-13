package src.Labs;

import java.util.Scanner;

//Create a class with a main method -- this Lab can be implemented in just one class.
public class Labs {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GameBoard gameBoard = new GameBoard();
    gameBoard.initialize();
    gameBoard.display();

    String player = "X";
    String winner = "";
    int playedSquares = 1;
    int squareNumber;

    while (winner.equals("") && playedSquares <= 9) {
      System.out.println(player + "'s turn. Enter a number to place an " + player + " in");
      String input = sc.nextLine();
      squareNumber = Integer.valueOf(input);

      if (squareNumber > 0 && squareNumber <= 9) {
        if (gameBoard.ifValidSquare(squareNumber, input, player)) {
          if (player.equals("X")) {
            player = "O";
          } else {
            player = "X";
          }
          playedSquares++;
          gameBoard.display();
          winner = gameBoard.checkWinStatus();
        } else {
          System.out.println("Invalid entry. Please pick another number");
        }
      }
    }
    
    if (winner.equals("draw")) {
      System.out.println("This game is a " + winner);
    } else {
      System.out.println(" " + winner + " wins!");
    }







    sc.close();
	}

}

//Math.random!!!!!!