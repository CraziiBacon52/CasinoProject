import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

//Player object, has the player's instance vars like their balance and screen position
public class Player
{
	private int x; 
	private int y; 
	private int balance;
  private String name;
	private static final int STARTX = 50;
	private static final int STARTY = 50;
	
	public Player() {
		x = STARTX;
		y = STARTY;
	}
  
  //Getters
  public int getBalance(){
    return balance;
  }

  public int getX(){
    return x;
  }

  public int getY(){
    return y; 
  }

  public String getName()
  {
    return name;
  }
  
  //Setters
  public void adjustBalance(int add)
  {
    balance += add;
  }
  
  public void setBalance(int newBalance)
  {
    balance = newBalance;
  }

  public void setX(int newX)
  {
    x = newX;
  }

  public void adjustX(int add)
  {
    x += add;
  }

  public void setY(int newY)
  {
    y = newY;
  }

  public void adjustY (int add)
  {
    y += add;
  }
}