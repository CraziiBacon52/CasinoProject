import java.awt.*;

//This will be running most of the time, manages the inbetween phases of games

public class CasinoController{
  /*these are different modes so we can keep track of who is playing when, also keeps track of modes*/
  public static final int LOBBY = 0;
  public static final int INGAME = 1;
  private Player p; 
  public static int mode; 
  
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