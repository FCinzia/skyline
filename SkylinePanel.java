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
import java.util.Random;

public class SkylinePanel extends JPanel
{
    private Building build, window;
    private int x, y, width, height, gap, buildNr, total_width= 0, i=1;
    private int windowNr, windows_width, windows_height, windows_x, windows_y, windows_gap, building_distance;
    private final int FRAME_DISTANCE = 390;
    
    public SkylinePanel()
    {
        setPreferredSize (new Dimension(500, 430));
        setBackground (Color.cyan);
    }
    
    //-----------------------------------------------------------------
    //  Draws this panel by requesting that each building draw itself.
    //-----------------------------------------------------------------
    public void paintComponent (Graphics page)
    {
        super.paintComponent(page);
        
        //----------------------------------------------
        // Creates random number of Building objects.
        //----------------------------------------------
        
        Random generator = new Random();
        
        buildNr = (generator.nextInt(10)+1);
        
        //------------------------------------------------------
        // Building For loop; draws each building individually.
        //-------------------------------------------------------

        while (total_width < FRAME_DISTANCE && i < buildNr)
        {
          
            //-----------------------------------------------------------
            //  Creates random width, hight, and gap for each building.
            //-----------------------------------------------------------
             gap = (generator.nextInt(10)+10);
             y= (generator.nextInt(370)+50);
             width = (generator.nextInt(100)+20);
             x = (generator.nextInt(gap)+total_width);
             height= 430 - y;
             total_width = total_width + (width + gap);
            
            //-------------------------
            // Building Constructor.
            //-------------------------
             page.setColor (Color.black);

             build = new Building (x, y, width, height);
             build.draw(page);
            
            //----------------------------------------------
            // Creates a random number of Window objects.
            //----------------------------------------------
             windowNr = (generator.nextInt(10)+5);
             for (int j = 1; j <= windowNr; j++)
             {
                //-------------------------------------------------------------------------
                // Creates random x, y, width, and height for each of the Window objects.
                //-------------------------------------------------------------------------
                windows_x = (generator.nextInt(width-10)+x-5);
                windows_gap = (generator.nextInt(4)+1);
                windows_y = (generator.nextInt(height-15)+y);
                windows_width = (generator.nextInt(5)+10);
                windows_height = (generator.nextInt(5)+10);
                
                page.setColor (Color.yellow);
                
                //-----------------------------------------------------------------
                // Window Constructor: uses random x, y, width, and height.
                //-----------------------------------------------------------------
                window = new Building (windows_x, windows_y, windows_width, windows_height);
                window.draw(page);
            }
             
            i++;
           
        }
        //-----------------------------------------------------------------
        // Draws a box at the bottom of the panel and name of Skyline.
        //-----------------------------------------------------------------
        page.setColor (Color.blue);
        page.fillRect(0,400,500,30);
        page.setColor (Color.yellow);
        page.drawString ("Ferri's Skyline", 200, 420);
        
        
    }
}
