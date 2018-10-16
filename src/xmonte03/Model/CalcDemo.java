/*
 * @author Guillermo Montes Martos
 * @author xmonte03
 *
 */

package xmonte03.Model;

import javax.swing.*;
import xmonte03.GUI.Controller;


/**
 * Runs the application.
 *
 * @author Guillermo Montes Martos
 * @author xmonte03
 * @version 1.0
 */
public class CalcDemo {

    public static void main(String[] args) {

        // We run the window in separate thread using an anonymous class
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Controller control = new Controller();
                control.setFrameControl();
            }
        });
    }
    
}
