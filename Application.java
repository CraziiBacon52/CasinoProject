import java.util.*;

//Starts the whole program, initializes the various parts
//Won't actively be doing that much

public class Application 
{
  public static void main(String[] args) {
    //creates all objects, player, etc., DON'T TOUCH
    Player p = new Player(); 
    CasinoController c = new CasinoController(p); 
    Painter g = new Painter(p); 
    p.setController(c); 
    g.repaint(); 
  }
}