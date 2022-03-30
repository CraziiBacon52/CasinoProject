import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player{
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
  
  //Setters

  public void adjustBalance(int add)
  {
    balance += add;
  }
  
  public void setBalance(int newBalance)
  {
    balance = newBalance;
  }
}