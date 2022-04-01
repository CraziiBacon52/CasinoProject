import java.awt.Graphics;

//This is the superclass for all of your individual games
//Please inherit from this
public class Game
{
  private Graphics g; 
  private String instructions; 
  private String name; 
  
  public Game(Graphics g, String instructions, String   gameName)
  {
    this.g = g; 
    this.instructions = instructions;
    this.name = gameName;  
  }

  public Graphics getGraphics(){
    return g;
  }   

  public String getName()
  {
    return name;
  }
  
  public String getInstructions()
  {
    return instructions;
  } 
}