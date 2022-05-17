package pl.edu.pw.elka.prm2t.lab6.zad1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.CENTER;

public class Gui implements ActionListener {
    JFrame f;
    JLabel label;
    JLabel label2;
    JButton button;

    Gui() {
        f = new JFrame("Testowanie danych wejściowych");
        f.setSize(350, 150);
        f.setLayout(new FlowLayout());
        label = new JLabel("Żeby przetestować dane, wciśnij:", CENTER);
        button = new JButton("WPISZ");
        f.add(label);
        f.add(button);
        button.addActionListener(this);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        f.setVisible(true);
        //nie moge zamknac gui, ale chyba nie trzeba??
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        while(true) {
            String input = JOptionPane.showInputDialog("Wpisz liczbe");
            //tu ma byc dobry if
            if (input.equals("1")) {
                JOptionPane.showMessageDialog(f, "Jest to wartość numeryczna");
                label2= new JLabel(input);
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                f.add(label2);
                //tu wpisuje do okna wartosc
                break;
            } else {
                JOptionPane.showMessageDialog(f, "Nie jest to wartość numeryczna, powtórz czynność");
            }
        }
    }

    public static void main(String[] args) {
        Gui gui = new Gui();
    }
}

