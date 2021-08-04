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
        double p = (side1 + side2 + side3) / 2;
        return Math.sqrt(p * ((p - side1) * (p - side2) * (p - side3)));
    }

    public Point centroid() {
        double xc = (((a.getX() + b.getX() + c.getX()) / 3));
        double yc = (((a.getY() + b.getY() + c.getY()) / 3));
        return new Point(xc, yc);
    }
}

