package ru.student.board;

import ru.student.component.Circle;
import ru.student.component.Line;
import ru.student.component.Rectangle;
import ru.student.component.Triangle;
import ru.student.component.Point;
import javax.swing.*;
import java.awt.*;

public class Landscape extends JPanel {
    private Line sunlight1;
    private Line sunlight2;
    private Line sunlight3;
    private Line sunlight4;
    private Line sunlight5;
    private Line sunlight6;
    private Line sunlight7;
    private Line sunlight8;
    private Rectangle house;
    private Rectangle door;
    private Circle sun;
    private Triangle roof;


    public Landscape() {
        this.house = new Rectangle(new Point(350, 350), 150, 150);
        this.roof = new Triangle(new int[]{425, 350, 500}, new int[]{250,350,350}, 3);
        this.door = new Rectangle(new Point(370, 425), 75,45);

        this.sun = new Circle(new Point(150, 150), 80, 80);

        this.sunlight1 = new Line(new Point(190, 245), new Point(190, 290));
        this.sunlight2 = new Line(new Point(190, 140), new Point(190, 95));
        this.sunlight3 = new Line(new Point(240, 190), new Point(290, 190));
        this.sunlight4 = new Line(new Point(90, 190), new Point(140, 190));
        this.sunlight5 = new Line(new Point(150, 150), new Point(120, 120));
        this.sunlight6 = new Line(new Point(150, 230), new Point(120, 260));
        this.sunlight7 = new Line(new Point(230, 150), new Point(260, 120));
        this.sunlight8 = new Line(new Point(230, 230), new Point(260, 260));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.setPaint(Color.DARK_GRAY);
        graphics2D.fill(house);
        graphics2D.setColor(Color.gray);
        graphics2D.fill(roof);
        graphics2D.draw(door);
        graphics2D.setColor(Color.yellow);
        graphics2D.fill(sun);
        graphics2D.draw(sunlight1);
        graphics2D.draw(sunlight2);
        graphics2D.draw(sunlight3);
        graphics2D.draw(sunlight4);
        graphics2D.draw(sunlight5);
        graphics2D.draw(sunlight6);
        graphics2D.draw(sunlight7);
        graphics2D.draw(sunlight8);
    }
}
