/* Based on the ecs 100 template
 * Code for ??
 * Name:
 * Date:
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;


/** Class demonstration to draw a lollipop for our first GUI
 * 
 * @author Josh
 * @version 1/4/21
 * 
 */
public class Lollipop{

    /**
     * Constructor for objects of class lollipop
     */
    public Lollipop(){
        UI.initialise();
        UI.addButton("Quit", UI::quit); // Comment out checkstyle
    }

    /**
     * Draw a red lollipop on a stick
     * 
     */
    private void drawLollipop()
    {
        /* drawing the stick */
        UI.setLineWidth(10);                // set line width to ten
        UI.drawLine(300, 200, 300, 600);    // draw a line (300, 200) to (300, 400)
        /* drawing the lolly */
        UI.setLineWidth(1);                 // set line width to 1
        UI.setColor(Color.red);             // set colour to red
        UI.fillOval(250, 150, 100, 100);    // draw the solid oval at (260, 160), 80*80
    }

    /**
     * Main routine
     */
    public static void main(String[] args){
        Lollipop obj = new Lollipop();
        obj.drawLollipop();             // call the lollipop method
    }

}

