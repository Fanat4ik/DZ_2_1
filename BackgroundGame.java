package ru.gb.jtwo.lone.online.circles;

import java.awt.*;


public class BackgroundGame  {
    private int rColor, gColor, bColor;

    private float vR = (float)(1+(int)(Math.random() * 1000));
    private float vG = (float)(1+(int)(Math.random() * 1000));
    private float vB = (float)(1+(int)(Math.random() * 1000));

    //setBackground(Color.BLUE);
    BackgroundGame() {
    }
    private  Color colorB = new Color (
            (1+rColor),
            (1+gColor),
            (1+bColor)
    );

    void update(GameCanvas canvas, float deltaTime) {
        rColor += (int)(vR * deltaTime);
        gColor += (int)(vG * deltaTime);
        bColor += (int)(vB * deltaTime);
            if (rColor > 254) {
                vR = -vR;
            }
            if (rColor < 0) {
                vR = -vR;
            }
            if (gColor > 254) {
                vG = -vG;
            }
            if (rColor < 0) {
                vG = -vG;
            }
            if (bColor > 254) {
                vB = -vB;
            }
            if (rColor < 0) {
                vB = -vB;
            }
        }

    void render(GameCanvas canvas, Graphics g) {
        g.setColor(colorB);
        g.fillRect(0, 0,
                800,  600);
}

}
