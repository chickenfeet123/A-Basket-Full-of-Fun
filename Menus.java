import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class Menus extends JPanel
{
  GridBagLayout gbl = new GridBagLayout();
  GridBagConstraints gbc = new GridBagConstraints();
  public Menus(int whichMenu)
  {
    setLayout(gbl);
    gbc.insets = new Insets(10,10,10,10);
    if(whichMenu == 0)
      setUpMain();
    else
      setUpLevel();
  }
  
  public void setUpMain()
  {
    JLabel test = new JLabel("Main Menu");
    add (test,gbc);
    JButton testInst = new JButton("Instructions"),testPlay = new JButton("Play Game");
    JButton testHigh = new JButton("High Scores"),testExit = new JButton("Exit Game");
    gbc.weighty=1;
    gbc.anchor = gbc.LINE_START;
    gbc.gridy = 1;
    add(testInst,gbc);
    gbc.gridy=2;
    add(testPlay,gbc);
    gbc.gridy=3;
    add(testHigh,gbc);
    gbc.gridy=4;
    add(testExit,gbc);
  }
  
  public void setUpLevel()
  {
    JLabel test = new JLabel("Main Menu");
    add (test,gbc);
    JButton testInst = new JButton("Easy"),testPlay = new JButton("Medium");
    JButton testHigh = new JButton("Hard"),testExit = new JButton("Back to Main Menu");
    JButton testOne = new JButton("Level 1"), testTwo = new JButton("Level 2"), testThree = new JButton("Level 3");
    gbc.weighty=1;
    gbc.anchor = gbc.LINE_START;
    gbc.gridy = 1;
    add(testInst,gbc);
    gbc.gridy=2;
    add(testPlay,gbc);
    gbc.gridy=3;
    add(testHigh,gbc);
    gbc.gridy=4;
    add(testExit,gbc);
  }
}