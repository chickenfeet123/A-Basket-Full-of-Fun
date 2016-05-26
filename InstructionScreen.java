import java.awt.*;
import java.util.*;
import javax.swing.*;

public class InstructionScreen extends JPanel {
  
  public InstructionScreen() { 
    super();
    JFrame j=new JFrame("A Basket Full Of Fun: Instructions");
    j.setSize(800,800);
    this.setPreferredSize(new Dimension( 800,800));
    j.add(this);
    j.setVisible (true);
    
  }

    
  
  
  /** Purpose: The purpose of this method is to 
    * paint the panel. It draws the sky, the sun, 
    * and a series of animated baskets.
    * @param g Graphics allows use to the Graphics class.
    */
  
  public void paintComponent (Graphics g)
  {
    
    super.paintComponent(g);
    g.setColor (Colours.skyB);
    g.fillRect(0,0,800,800);
    Font f=new Font("Serif", Font.BOLD,40);
   g.setFont(f );
    g.setColor(Colours.lGreen);
   g.drawString("INSTRUCTIONS!", 250,50);
   g.fill3DRect(50,75,700,25,true);
   //clouds
   g.setColor (Color.white);
   g.fillOval(20,40,200,30);
    g.fillOval(600,40,120,30);
    
     g.fillOval(20,40,70,20);
    g.fillOval(60,20,70,50);
    g.fillOval(100,30,70,20);
    g.fillOval(160,40,70,30);
    
    g.fillOval(640,20,70,50);
    g.fillOval(600,30,70,20);
    g.fillOval(660,40,70,30);
     g.fillOval(700,40,80,30);
  }
  
  public static void main(String[] args) { 
     InstructionScreen i=new InstructionScreen ();
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
