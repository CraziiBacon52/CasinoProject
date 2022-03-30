import java.awt.*;

public class CasinoController implements KeyListener{
  public static final int LOBBY = 0;
  public static final int INGAME = 1;
  private Player p; 
  public static int mode; 
  
  public CasinoController(Player p){
    this.p = p;
    mode = LOBBY;
  }

  //Getter
  public int getMode()
  {
    return mode;
  }

  //Setter

  public void setMode(int newMode)
  {
    mode = newMode;
  }
}