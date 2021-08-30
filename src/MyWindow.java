import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setLocation(650, 450);
        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton btn1 = new JButton("Push the button");
        //add(btn1, BorderLayout.SOUTH);
        JButton btn2 = new JButton("Выход");
        //add(btn2, BorderLayout.EAST);

        ActionListener actionListener = new CloseActionListener();
        btn1.addActionListener(actionListener);


        panel.add(btn1);
        panel.add(btn2);

//        JPanel panel1 = new JPanel(new GridLayout(2, 3));
//        panel.add(panel1);

        add(panel, BorderLayout.SOUTH);

        setVisible(true);
    }

}
