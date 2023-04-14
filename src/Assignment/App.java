package src.Assignment;

public class App {
  
  public static void main(String[] args) {

    //Instantiate a Deck and two Players, call the shuffle method on the deck
    System.out.println("----------------------------");
   Player player1 = new Player("Kaiden");
   Player player2 = new Player("Makensie");
    
    Deck deck = new Deck();
    deck.shuffle();

    //Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.

    for (int i = 1; i <= 26; i++) {
     player1.hand.add(deck.draw());
     player2.hand.add(deck.draw());
    }

    player1.describe();
    System.out.println("------------------------------");
    player2.describe();
    System.out.println("------------------------------");

    //Using a traditional for loop, iterate 26 times and call the flip method for each player.

    for (int i = 0; i < 26; i++) {
      Card player1FlipCard =  player1.flip();
      Card player2FlipCard = player2.flip();
    //Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
      if (player1FlipCard.getValue() > player2FlipCard.getValue()) {
        player1.incrementScore();
      } else if (player2FlipCard.getValue() > player1FlipCard.getValue()) {
        player2.incrementScore();
      } else {
        System.out.println();
      }
    }
    //After the loop, compare the final score from each player.

    //Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.
    if (player1.score > player2.score) {
      System.out.println("Kaiden" + " is the winner!");
      System.out.println("Kaiden" + " score: " + player1.score + player2 + " score: " + player2.score);
    } else if (player2.score > player1.score) {
      System.out.println(player2 + " is the winner!");
      System.out.println(player2 + " score: " + player2.score + "Kaiden" + " score: " + player1.score);
    } else {
      System.out.println("Draw!");
    }


    // Tips:  Printing out information throughout the game adds value including easier debugging as you progress and a better user experience.
    // Using the Card describe() method when each card is flipped illustrates the game play.
    // Printing the winner of each turn adds interest.  
    // Printing the updated score after each turn shows game progression.
    // At the end of the game: print the final score of each player and the winner’s name or “Draw” if the result is a tie.

  }
}
