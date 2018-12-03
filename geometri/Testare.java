package geometri;

import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Testare{

   static JFrame frame = new JFrame("Test");

  public static void main(String[] args){
    JFrame frame = new JFrame("Test");
    Graphics g = frame.getGraphics();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    g.fillOval(0,0,40,40);
  }

}
