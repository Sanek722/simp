package pract12;
import java.awt.*;
import javax.swing.*;

class zad_1 extends JFrame {
    zad_1()
    {
        setSize(700, 700);
        setLocation(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }



    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < 10; i++)
        {

            g.setColor(new Color((int) (Math.random() * 0x1000000)));
            g.fillOval(
                    (int) (Math.random() * 350),
                    (int) (Math.random() * 350),
                    (int) (Math.random() * 100),
                    (int) (Math.random() * 100)
            );

            g.setColor(new Color((int) (Math.random() * 0x1000000)));
            g.fillRect(
                    (int) (Math.random() * 450),
                    (int) (Math.random() * 350),
                    (int) (Math.random() * 200),
                    (int) (Math.random() * 200)
            );

            g.setColor(new Color((int) (Math.random() * 0x1000000)));
            g.drawArc(
                    (int) (Math.random() * 400),
                    (int) (Math.random() * 500),
                    (int) (Math.random() * 400),
                    (int) (Math.random() * 500),
                    (int) (Math.random() * 360),
                    (int) (Math.random() * 360)
            );

            g.setColor(new Color((int) (Math.random() * 0x1000000)));
            g.fillRoundRect(
                    (int) (Math.random() * 340),
                    (int) (Math.random() * 270),
                    (int) (Math.random() * 200),
                    (int) (Math.random() * 200),
                    (int) (Math.random() * 200),
                    (int) (Math.random() * 200)
            );

            g.setColor(new Color((int) (Math.random() * 0x1000000)));
            g.fillOval(
                    (int) (Math.random() * 200),
                    (int) (Math.random() * 400),
                    100,
                    100
            );
        }
    }

    public static void main(String[] args)
    {

        zad_1 app = new zad_1();
    }
}
