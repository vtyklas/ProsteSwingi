package Swing;

import javax.swing.*;


public class Zadanie14Main {
    public static void main(String[] args) {

        String choice = JOptionPane.showInputDialog("Podaj A-G lub wpisz 0 zeby wyjsc!");
        new Zadanie14().chooseYourButtonLayout(choice);

    }
}
