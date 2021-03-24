/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioscacchiera;

import java.awt.Color;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author alep
 */
public class EsercizioScacchiera {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        initUI();
    }

    private static void initUI() throws IOException {
        GUI w = new GUI();
        w.setVisible(true);
        w.setSize(700, 700);
        w.setLocation(200, 200);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        w.getContentPane().add(new Background ("src/resources/images/wood.jpg"));
        
    }

}
