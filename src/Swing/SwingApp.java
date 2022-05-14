package Swing;

import java.awt.*;
import javax.swing.*;

public class SwingApp {

    public static void main(String[] args)
    {
        new SwingApp();
    }

    public SwingApp()
    {
        SwingUtilities.invokeLater(
                () -> createGUI()
        );
    }

    protected void createGUI()
    {
        // utworzenie okna
        JFrame jf = new JFrame();

        // określenie tytułu okna
        jf.setTitle("Simple Swing App");

        // obsługa zamknięcia okna JFrame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String x = JOptionPane.showInputDialog("Podaj położenie x okna");
        String y = JOptionPane.showInputDialog("Podaj położenie y okna");

        // określenie położenia okna
        jf.setLocation(Integer.valueOf(x), Integer.valueOf(y));

        // dodatkowy panel do grupowania komponentów
        JPanel jp = new JPanel();

        // ustawianie zarządcy rozkładu dla panelu
        jp.setLayout(new GridLayout(2, 3, 2, 2));

        // dodawanie komponentów do panelu
        for (int i = 0; i < 6; i++)
            jp.add(new JButton(""+i));

        // ustawianie zarządcy rozkladu dla okna
        jf.setLayout(new FlowLayout(FlowLayout.CENTER));

        // dodawanie komponentów do okna
        jf.add(jp);
        jf.add(new JButton("7"));

        // nie działa
        jf.setBackground(Color.RED);

        // działa
        //jf.getContentPane().setBackground(Color.RED);

        // ustawianie możliwości zmiany rozmiarów okna
        jf.setResizable(true);

        // upakowanie okna
        jf.pack();

        // wyświetlenie okna
        jf.setVisible(true);
    }
}
