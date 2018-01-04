
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

import java.awt.*;

public class Building
{
    private int x, y, width, height, windows_x, windows_y, windows_width, windows_height;
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this building with the specified values.
    //-----------------------------------------------------------------
    public Building (int upperX, int upperY, int w, int h)
    {
        width = w;
        height = h;
        x = upperX;
        y = upperY;
    }
    
    //-----------------------------------------------------------------
    //  Constructor: Sets up this window with the specified values.
    //-----------------------------------------------------------------
    
    public void Windows(int x,int y,int wWidth,int wHeight)
    {
        
        windows_x= this.x;
        windows_y = this.y;
        windows_width = wWidth;
        windows_height = wHeight;
        
    }
    
    //-----------------------------------------------------------------
    //  Draws black rectangles for buldings and yellow for windows.
    //-----------------------------------------------------------------
    public void draw (Graphics page)
    {
        page.fillRect (x, y, width, height);
        page.fillRect (windows_x, windows_y, windows_width, windows_height);
    }
    
    //-----------------------------------------------------------------
    //  Width mutator.
    //-----------------------------------------------------------------
    public void setWidth (int w)
    {
        width = w;
    }
    
    //-----------------------------------------------------------------
    //  Height mutator.
    //-----------------------------------------------------------------
    public void setHeight (int h)
    {
        height = h;
    }
    //-----------------------------------------------------------------
    //  X mutator.
    //-----------------------------------------------------------------
    public void setX (int upperX)
    {
        x = upperX;
    }
    
    
    //-----------------------------------------------------------------
    //  Y mutator.
    //-----------------------------------------------------------------
    public void setY (int upperY)
    {
        y = upperY;
    }
    
    //-----------------------------------------------------------------
    //  Width accessor.
    //-----------------------------------------------------------------
    public int getWidth ()
    {
        return width;
    }
    
    //-----------------------------------------------------------------
    //  Height accessor.
    //-----------------------------------------------------------------
    public int getHeight ()
    {
        return height;
    }
    
    //-----------------------------------------------------------------
    //  X accessor.
    //-----------------------------------------------------------------
    public int getX ()
    {
        return x;
    }
    
    //-----------------------------------------------------------------
    //  Y accessor.
    //-----------------------------------------------------------------
    public int getY ()
    {
        return y;
    }
}

