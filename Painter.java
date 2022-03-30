import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Painter extends JFrame {
  private Player p;

  public Painter(Player p) {
    this.setVisible(true);
    this.setBackground(Color.white);
    this.setBounds(new Rectangle(500, 500));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1500, 800);
    this.p = p;
  }

  public void paint(Graphics g) {
    System.out.println("Hello");
  }
}