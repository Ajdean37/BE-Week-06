package src.Assignment;

public class Card {
  //initialize name suit and value of each card
  private String name;
  private String suit;
  private int value;

  Card(String name, String suit, int value) {
    this.name = name;
    this.suit = suit;
    this.value = value;
  }
  //describe (prints out information about a card)
  public void describe() {
    System.out.println(name + " of " + suit + "- " + value );
  }
  //Getters and Setters
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getSuit() {
    return suit;
  }
  public void setSuit(String suit) {
    this.suit = suit;
  }
  public int getValue() {
    return value;
  }
  public void setValue(int value) {
    this.value = value;
  }
}
