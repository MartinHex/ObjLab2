package geometri;

import java.util.*;

public class Testare{

  private JFrame frame = new JFrame("Test");
  Graphics g = frame.getGraphics();

  public static void main(String[] args){
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    frame.fillOval(0,0,40,40);
  }

}
