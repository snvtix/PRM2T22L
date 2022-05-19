package pl.edu.pw.elka.prm2t.lab6.zad2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui2 implements ActionListener {
    JFrame f;
    JTextField text;
    String number = "10";
    int workNumber = 10;
    String[] optionsAvaible = {"1","5"};
    JComboBox options = new JComboBox<>(optionsAvaible);
    JButton addition;
    JButton comeBack;
    JButton subtraction;

    Gui2() {
        f = new JFrame("Testowanie danych wejściowych");
        f.setSize(500, 75);
        f.setLayout(new GridLayout());
        subtraction = new JButton("odejmij");
        subtraction.addActionListener(this);
        comeBack = new JButton("przywróć");
        comeBack.addActionListener(this);
        addition = new JButton("dodaj");
        addition.addActionListener(this);
        text = new JTextField(number);
        text.setEnabled(false);
        text.setHorizontalAlignment(SwingConstants.CENTER);
        text.setDisabledTextColor(Color.BLACK);
        f.add(text);
        f.add(options);
        f.add(addition);
        f.add(comeBack);
        f.add(subtraction);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == addition){
            if(options.getSelectedIndex() == 0){
                workNumber = workNumber + 1;
                text.setText(String.valueOf(workNumber));
            }
            else if(options.getSelectedIndex() == 1){
                workNumber = workNumber + 5;
                text.setText(String.valueOf(workNumber));
            }
        }
        else if(source == comeBack){
            text.setText(number);
        }
        else if(source == subtraction){
            if(options.getSelectedIndex() == 0){
                workNumber = workNumber - 1;
                text.setText(String.valueOf(workNumber));
            }
            else if(options.getSelectedIndex() == 1){
                workNumber = workNumber - 5;
                text.setText(String.valueOf(workNumber));
            }
        }
    }

    public static void main(String[] args) {
        Gui2 gui2 = new Gui2();
    }

}
