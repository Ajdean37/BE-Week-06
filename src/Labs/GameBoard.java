package src.Labs;

import java.util.Arrays;

public class GameBoard {
  
  //Declare a gameBoard.  
  //create an array of length 9 to represent the board
  String[] board = new String[9];

//to set up your new gameBoard
  public void initialize() {
    for (int i = 1; i <= 9; i++) {
      this.board[i-1] = String.valueOf(i);
    }
  }

//to print the gameBoard
  public void display() {
    System.out.println("*---*---*---*");
    System.out.println("| " + this.board[0] + " | " + this.board[1] + " | " + this.board[2] + " | " );
    System.out.println("*---*---*---*");
    System.out.println("| " + this.board[3] + " | " + this.board[4] + " | " + this.board[5] + " | " );
    System.out.println("*---*---*---*   ");
    System.out.println("| " + this.board[6] + " | " + this.board[7] + " | " + this.board[8] + " | " );
    System.out.println("*---*---*---*");
  }

  public boolean ifValidSquare(int squareNumber, String input, String player) {
    if (this.board[squareNumber-1].equals(input)) {
      this.board[squareNumber-1] = player;
      return true;
    }
    return false;
  }

  public String checkWinStatus() {
    for (int i = 0; i < 8; i++) {
      String winningCombo = "";

      switch (i) {
        case 0:
          winningCombo = this.board[0] + this.board[1] + this.board[2];
          break;
        case 1:
          winningCombo = this.board[3] + this.board[4] + this.board[5];
          break;
        case 2:
          winningCombo = this.board[6] + this.board[7] + this.board[8];
          break;
        case 3:
          winningCombo = this.board[0] + this.board[3] + this.board[6];
          break;
        case 4:
          winningCombo = this.board[1] + this.board[4] + this.board[7];
          break;
        case 5:
          winningCombo = this.board[2] + this.board[5] + this.board[8];
          break;
        case 6:
          winningCombo = this.board[0] + this.board[4] + this.board[8];
          break;
        case 7:
          winningCombo = this.board[2] + this.board[4] + this.board[6];
          break;
      }
      if (winningCombo.equals("XXX")) {
        return "X";
      } else if (winningCombo.equals("OOO")) {
        return "O";
      }
    }
    for (int i = 1; i <= 9; i++) {
      if (Arrays.asList(this.board).contains(String.valueOf(i))) {
        break;
      } else if (i == 9) {
        return "draw";
      }
    }
    return "";
  }
}
