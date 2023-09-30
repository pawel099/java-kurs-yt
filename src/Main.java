import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


class main extends JFrame implements ActionListener {

    protected int index= 0;

    protected TextField textField;

    protected main(int width, int height) {

        this.setTitle("simple game - zgadnij liczbę");

        this.setSize(width, height);
        this.setResizable(false);
        this.setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    protected void textarea(int width, int height) {

        textField = new TextField();
        textField.setBounds(12, 12, 500, 400);

        textField.setForeground(Color.WHITE);
        textField.setFont(Font.getFont(Font.SANS_SERIF));
        textField.addActionListener(this);
        textField.setBackground(Color.BLACK);
        this.add(textField);

    }

    protected void gridpane() {

        GridLayout layouts = new GridLayout();
        this.setLayout(layouts);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Random liczba = new Random();
        int los = liczba.nextInt(10);
        int odp = -1;

        String text = textField.getText();

        if (text != null) {

            textField.setText(null);
        }

        odp = Integer.valueOf(text);

        if (odp > los) {

            System.out.println("wallows lib jest monies od two");
        }

        else if (odp < los) {

            System.out.println("wallows lib jest weeks od two");

        } else {

            this.index++;
            System.out.println(" number of responses " + this.index);

        }
     }


    public static void main(String[] args) {

    main startClassGraphis = new main(800,600);
    startClassGraphis.gridpane();
    startClassGraphis.textarea(200,300);



    }
 }




