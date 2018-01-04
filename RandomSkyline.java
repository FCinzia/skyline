
/**
 
 * @author Cinzia Ferri
 * @version 1.0
 * @since 2016-09-15
 
 * Creates a Skyline and Windows using a for loop and fillRect method with random x, y, width, and height.
 
 Algorythm:
 1) create a frame and panel
 2) generate random number
 3) generate random height and width
 4) generate random gap between next building
 5) draw building
 6) upgrade distance from left side of frame
 7) generate random number of windows
 8) generate random number for x, y, width, and height for windows
 9) generate random gap between next building
 
 */

import javax.swing.*;
import java.awt.*;

public class RandomSkyline
{
//-----------------------------------------------------------------
//  Presents a Skyline.
//-----------------------------------------------------------------
  public static void main (String[] args)
  {
    JFrame frame = new JFrame ("Skyline");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SkylinePanel panel = new SkylinePanel();
    frame.getContentPane().add(panel);

    frame.pack();
    frame.setVisible(true);
  }
}
