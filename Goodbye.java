import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.awt.image.*;
import java.io.*;
import java.net.URL;
import javax.imageio.*;
import java.lang.*;
 
public class Goodbye extends JPanel {
  
  public Goodbye() { 
    super();
    JFrame j=new JFrame("A Basket Full Of Fun: Goodbye!");
    j.setSize(800,800);
    this.setPreferredSize(new Dimension( 800,800));
    j.add(this);
    j.setVisible (true);
  }
  public void delay()
  {
    try 
    {
      Thread.sleep(3000);
    }
    catch(Exception e)
    {
    }
  }
   public void paintComponent (Graphics g)
  {
     BufferedImage logo=null;
    super.paintComponent(g);
    g.setColor (Colours.skyB);
    g.fillRect(0,0,800,800);
    Font f=new Font("Serif", Font.BOLD,40);
   g.setFont(f );
    g.setColor(Colours.lGreen);
   g.drawString("THANKS!", 320,50);
   Font f1=new Font("Serif", Font.BOLD,20);
   g.setFont(f1 );
    g.drawString("We hope you had a great time playing this game!", 200,400);
    g.drawString("Created by Top Of The Stack: Alice Zhang and Caroline Liu!", 140,500);
    g.drawString("Thanks for feeding the animals!", 270,350);
    
    try{
    
      logo = ImageIO.read(new File ("logo.jpg"));
        g.drawImage(logo,275,100,null);
    }
    catch(Exception e){
      
    }
    
    
    
   g.fill3DRect(50,75,700,25,true);
   //clouds
   g.setColor (Color.white);
   g.fillOval(20,640,300,50);
    g.fillOval(600,640,200,30);
    
    
     g.fillOval(10,640,100,40);
     g.fillOval(20,640,100,40);
    g.fillOval(60,620,100,70);
      g.fillOval(90,620,150,100);
         g.fillOval(-30,620,150,100);
    g.fillOval(100,630,100,50);
    g.fillOval(160,640,100,60);
    
      g.fillOval(550,640,300,70);
    g.fillOval(640,620,100,60);
    g.fillOval(600,630,100,60);
    g.fillOval(660,640,100,50);
     g.fillOval(500,640,100,30);
   g.fillOval(450,650,150,60);
  }
  public static void main(String[] args) { 
    Goodbye g=new Goodbye();
  }
  
  /* ADD YOUR CODE HERE */
  
}
