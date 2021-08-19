/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JApplet;
import java.awt.*;
/**
 *
 * @author smart
 */
public class applet1 extends JApplet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods
    public void paint(Graphics g){
        super.paint(g);
        g.drawString("PRANTA PAUL CSE02006917 PORT CITY INTERNATIONAL UNIVERSITY!",40,40);
    }
}
