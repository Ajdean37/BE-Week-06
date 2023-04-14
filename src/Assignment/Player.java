package src.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Player {

  //declare fields for hand, score, and name
  List<Card> hand = new ArrayList<Card>();
    int score;
    String name;

    public Player(String name) {
      this.score = 0;
      this.name = name;
    }
    //describe (prints out information about the player and calls the describe method for each card in the Hand List)
    public void describe() {
      System.out.println(name + " has the folloing cards:");
      for (Card card : hand) {
        card.describe();
      }
    }
    //flip (removes and returns the top card of the Hand)
    public Card flip() {
      Card drawnCard = hand.get(0);
      hand.remove(drawnCard);
      return drawnCard;
    }
    //draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
    public void draw (Deck deck) {
      Card card = deck.draw();
      hand.add(card);
    }
    //incrementScore (adds 1 to the Player’s score field)
    public void incrementScore() {
      this.score++;
    }
    public int getScore() {
      return score;
    }
}

