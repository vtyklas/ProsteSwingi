package Swing;

import javax.swing.*;
import java.awt.*;

public class Zadanie13 extends JFrame {

    public Zadanie13(){
        JFrame frame = new JFrame();
        JTextArea area = new JTextArea();
        area.setBounds(30,30,200,200);
        frame.add(area);
        frame.setSize(300,300);
        area.setBackground(Color.GREEN);
        area.setForeground(Color.RED);
        area.setFont(new Font("Dialog",Font.ITALIC + Font.BOLD,14));
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new Zadanie13();
    }




}