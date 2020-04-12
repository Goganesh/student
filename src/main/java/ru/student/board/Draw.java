package ru.student.board;

import ru.student.component.Text;

import javax.swing.*;
import java.awt.*;

public class Draw {

    private static final String PROJECT_NAME = "Project";
    private static final String SIGNATURE = "Сапон Елизавета";

    public void show(){
        JFrame frame = new JFrame();
        frame.setTitle(PROJECT_NAME);
        frame.setSize(new Dimension(600, 600));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Landscape landscape = new Landscape();
        Text text = new Text(SIGNATURE);
        landscape.add(text);

        frame.add(landscape, new GridBagConstraints(0, 0 ,1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.BOTH,
                new Insets(2, 2, 2, 2), 0, 0));

        frame.setVisible(true);
    }
}
