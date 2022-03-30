import java.util.*;

public class Application 
{
  public static void main(String[] args) {
    Player p = new Player(); 
    CasinoController c = new CasinoController(p); 
    Painter g = new Painter(p); 
    g.repaint(); 
  }

  
}