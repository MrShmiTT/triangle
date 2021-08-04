package com.epam.rd.autotasks.triangle;

class Triangle {
    private Point a;
    private Point b;
    private Point c;
    double side1;
    double side2;
    double side3;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null)
            throw new RuntimeException("Arguments can't be null");

        if (((side1 + side2) < side3) || ((side1 + side3) < side2) || ((side2 + side3) < side1))
            throw new RuntimeException("Triangle is degenerative");

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        return Math.abs((a.getX() - c.getX()) * (b.getY() - a.getY()) - (a.getX() - b.getX()) * (c.getY() - a.getY())) * 0.5;
    }

    public Point centroid() {
        double xc = (((a.getX() + b.getX() + c.getX()) / 3));
        double yc = (((a.getY() + b.getY() + c.getY()) / 3));
        return new Point(xc, yc);
    }
}

