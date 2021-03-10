import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class myWindow extends JFrame{

    myWindow(){
        setVisible(true);
        setLocation(500,50);
        setSize(400, 400);
        setTitle("Новое окно");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton btn1 = new JButton("Пока");
        panel.add(btn1);
        ActionListener act1 = new CloseActionListener();
        btn1.addActionListener(act1);

        JButton btn2 = new JButton("Инфо");
        panel.add(btn2);

        add(panel, BorderLayout.SOUTH);



    }
}

