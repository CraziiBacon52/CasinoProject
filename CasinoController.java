import java.awt.*;

//This will be running most of the time, manages the inbetween phases of games

public class CasinoController{
  /*these are different modes so we can keep track of who is playing when, also keeps track of modes*/
  public final int LOBBY = 0;
  public final int ROULETTE = 1;
  public final int SLOTS = 2; 
  public final int SOLITAIRE = 3; 
  public final int BLACKJACK = 4;

  private Player p; 
  public int mode; 
  
  public CasinoController(Player p){
    this.p = p;
    mode = LOBBY;
  }

  //Getters
  public int getMode()
  {
    return mode;
  }

  //Setters
  public void setMode(int newMode)
  {
    mode = newMode;
  }
}