package pl.edu.pw.elka.prm2t.project.mastermind;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {

    // to tez potem bedzie trzeba powiazac zklasa generator

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        setBackground(Color.lightGray);

        for(int i = 0; i < 8; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(i<4){
                    g.fillOval(0 + (i * 50), 0 + (j * 50), 50, 50);
                    //to jest statyczne dosc, a bedzie musialo bycpowiazane zgeneratorem
                    g.setColor(Color.magenta);
                }
                else{
                    g.fillOval(100 + (i * 25 ), 0 + (j * 50), 25, 25);
                    // to tez
                    g.setColor(Color.black);
                }
            }
        }
    }
    // cos sie nie pokolorowalo jak trzeba
}

