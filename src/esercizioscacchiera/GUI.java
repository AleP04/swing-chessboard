/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizioscacchiera;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;

/**
 *
 * @author alep
 */
public class GUI extends JFrame {

    @Override
    public void paint(Graphics g) {
        int spazio = 100;
        int x = 560;  //angolo in alto, asse x
        int y = 50;  //angolo in alto, asse y
        int base = spazio; //base quadrato
        int altezza = spazio;  //altezza quadrato
        int colonne = 8;
        int righe = 8;
        GradientPaint whiteGradient = new GradientPaint(x, y, Color.RED, x + 800, y + 800, Color.ORANGE);

        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < righe; i++) {
            x = 560;
            y = y + spazio;
            for (int j = 0; j < colonne / 2; j++) {//numero di colonne/2
                if (i % 2 != 0) {
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, base, altezza);
                    x = x + spazio;
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, base, altezza);
                } else {
                    g.setColor(Color.WHITE);
                    g.fillRect(x, y, base, altezza);
                    x = x + spazio;
                    g.setColor(Color.BLACK);
                    g.fillRect(x, y, base, altezza);
                }
                x = x + spazio;
            }
        }
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(80));
        g2.setPaint(whiteGradient);
        g2.drawRect(520, 110, 880, 880);

    }

}
