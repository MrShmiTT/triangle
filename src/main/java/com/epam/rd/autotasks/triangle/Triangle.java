package com.epam.rd.autotasks.triangle;

class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        if (a == null || b == null || c == null)
            throw new RuntimeException("Arguments can't be null");

        double length1 = Math.sqrt(((Math.pow(b.getX() - a.getX(), 2)) + (Math.pow(b.getY() - a.getY(), 2))));
        double length2 = Math.sqrt(((Math.pow(c.getX() - b.getX(), 2)) + (Math.pow(c.getY() - b.getY(), 2))));
        double length3 = Math.sqrt(((Math.pow(a.getX() - c.getX(), 2)) + (Math.pow(a.getY() - c.getY(), 2))));

        if (((length1 + length2) <= length3) || ((length1 + length3) <= length2) || ((length2 + length3) <= length1))
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
