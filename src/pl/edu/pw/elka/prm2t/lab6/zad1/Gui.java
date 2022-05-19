package pl.edu.pw.elka.prm2t.lab6.zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class Gui implements ActionListener {
    JFrame f;
    JTextField text;
    String input = " ";
    JButton button;

    Gui() {
        f = new JFrame("Testowanie danych wejściowych");
        f.setSize(400, 100);
        f.setLayout(new GridLayout());
        button = new JButton("WPISZ");
        button.addActionListener(this);
        text = new JTextField(input);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        f.add(button);
        f.add(text);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    public static boolean isNumeric(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch(NumberFormatException e) {
            return false;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        while(true) {
            input = JOptionPane.showInputDialog("Wpisz liczbe");
            if (isNumeric(input)) {
                JOptionPane.showMessageDialog(f, "Jest to wartość numeryczna");
                text.setText(input);
                break;
            }
            else {
                JOptionPane.showMessageDialog(f, "Nie jest to wartość numeryczna, powtórz czynność");
            }
        }
    }

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}

