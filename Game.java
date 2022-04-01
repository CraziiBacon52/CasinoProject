import java.awt.Graphics;

//This is the superclass for all of your individual games
//Please inherit from this
public class Game
{
  private Graphics g; 
  private String instructions; 
  private String name; 
  private Player p;
  private CasinoController c;
  
  public Game(Graphics g, String instructions, String   gameName, Player p, CasinoController c)
  {
    this.g = g; 
    this.instructions = instructions;
    this.name = gameName;  
    this.p = p;
    this.c = c;
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

  public Player getPlayer()
  {
    return p;
  }

  public CasinoController getCasinoController()
  {
    return c;
  }
}