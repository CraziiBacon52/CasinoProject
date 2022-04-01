import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

//This is just a graphics class
//Calls each game's graphics class

public class Painter extends JFrame {
  private Player p;
  private CasinoController c; 

  public Painter(Player p, CasinoController c) 
  {
    //Jframe - DON'T TOUCH
    this.setVisible(true);
    this.setBackground(Color.white);
    this.setBounds(new Rectangle(500, 500));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1500, 800);
    this.p = p;
    this.c = c; 
  }

  /* This does all the painting, what it paints will be dependent on the mode */ 
  public void paint(Graphics g) {
    if(c.mode == c.LOBBY) {
    	System.out.println("lobby");
    }else if(c.mode == c.ROULETTE) {
    	System.out.println("roulette"); 
    }else if(c.mode == c.SLOTS){
      System.out.println("slots");
    }else if(c.mode == c.SOLITAIRE){
      System.out.println("Solitaire"); 
    }else if(c.mode == c.BLACKJACK){
      System.out.println("blackjack"); 
    }
  }
}