package ru.student.component;

import java.awt.geom.Rectangle2D;

public class Rectangle extends Rectangle2D {

    private Point point;
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(Point point, double height, double width) {
        this.point = point;
        this.height = height;
        this.width = width;
    }

    @Override
    public void setRect(double x, double y, double w, double h) {
        point.setLocation(x, y);
        width = w;
        height = h;
    }

    //точка относительно прямоугольника
    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    //пересечение прямоугольников
    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    //объединение прямоумольников
    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return point.getX();
    }

    @Override
    public double getY() {
        return point.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        if (width <= 0 || height <=0) return false;
        return true;
    }
}
