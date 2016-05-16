import javax.swing.*;
public class TestApp extends JFrame {
  
  /** Description of main(String [] args)
    * This method calls the JFrameTest constructor to
    * create the application.
    * 
    * @param args [ ]  String array that allows command line
    * parameters to be used when executing the program.
    */ 
  public TestApp()
  {
    super ("Testing");
    HighScores h = new HighScores();
    //h.update("Caroline 22 2".split(" "));
    //h.setUpHighScoresPanel();
  //add(h);
    Menus m = new Menus(1);
    add(m);
    setSize(800,800);
    setVisible(true);
  }
  public static void main(String[] args) { 
    new TestApp();
  }
  
}
