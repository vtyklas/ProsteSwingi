package Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Zadanie14  {

    private final String[] buttonNames = {"Przycisk 1", "P 2", "Wiekszy przycisk numer 3", "Przycisk 4", "P5"};
    private final String[] borderLayoutPos = {"East","North","West","South","Center"};
    private JFrame frame;

    public Zadanie14() {
        frame = new JFrame();
        SwingUtilities.invokeLater(
                () -> createGUI()
        );

    }


    protected void createGUI() {
        frame.setTitle("Style w Swingu");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int hight = Toolkit.getDefaultToolkit().getScreenSize().height;

        frame.setSize(width / 2, hight / 4);

        int frameWidth = frame.getSize().width;
        int frameHeight = frame.getSize().height;

        frame.setLocation((width - frameWidth) / 2, (hight - frameHeight) / 2);

    }



    public void chooseYourButtonLayout(String choice){


        switch (choice) {
            case "A":
                BorderLayout bl = new BorderLayout();
                frame.setLayout(bl);
                for (int i = 0; i < buttonNames.length; i++) {

                    bl.addLayoutComponent(frame.add(new JButton(buttonNames[i])),borderLayoutPos[i]);

                }
                frame.pack();
                break;

            case "B":
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }

                frame.setLayout(new FlowLayout());
                frame.pack();
                break;

            case "C":
                int pos = 0;
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }

                frame.setLayout(new FlowLayout(0));
                frame.pack();
                break;

            case "D":
                int pos1 = 2;
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }

                frame.setLayout(new FlowLayout(2));
                frame.pack();
                break;

            case "E":
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }
                frame.setLayout(new GridLayout(1,5));
                frame.pack();
                break;

            case "F":
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }
                frame.setLayout(new GridLayout(5,1));
                frame.pack();
                break;

            case "G":
                for (int i = 0; i < 5; i++) {
                    frame.add(new JButton(buttonNames[i]));
                }
                frame.setLayout(new GridLayout(3,2));
                frame.pack();
                break;

        }
    }

}



