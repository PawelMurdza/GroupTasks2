package com.GroupTasks;

public class Task1 {
}

interface Shape {
    void calculateArea(double r);
    void calculatePerimiter(double r);
}
class Circle implements Shape {

    public void calculateArea(double r)  {
        double area=(r*r)*Math.PI;
        System.out.println(area);
    }

    public void calculatePerimiter(double r) {
      double perimiter= 2*Math.PI*r;
        System.out.println(perimiter);
        }
}
    class Square implements Shape {

        public void calculateArea(double r)  {
            double area=r*r;
            System.out.println(area);
        }

        public void calculatePerimiter(double r) {
            double  perimiter= 4*r;
            System.out.println(perimiter);
        }
        public static void main(String [] args) {
            Square obj = new Square();
            Circle obj2 = new Circle();
            obj.calculateArea(10);
            obj.calculatePerimiter(10);
            obj2.calculateArea(5);
            obj2.calculatePerimiter(10);
        }
    }


