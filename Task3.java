package com.GroupTasks;

public class Task3 {
}
class Car {

        int carPrice;
        String color;
        int calculateSalePrice(int carPrice) {
        return carPrice;
    }

        public static void main(String [] args) {
        Car obj = new Sedan();
        Car obj1 = new Truck();
        System.out.println(obj.calculateSalePrice(100));
        System.out.println(obj1.calculateSalePrice(100));
    }
}
class Sedan extends Car {
        int length=30;
        int calculateSalePrice(int carPrice) {
        if (length > 20) {
            carPrice=carPrice*95/100;

        } else {
            carPrice=carPrice*90/100;
        }
        return carPrice;
    }
}
class Truck extends Car {
    int weight=2005;
    int calculateSalePrice(int carPrice) {
        if (weight > 2000) {
            carPrice=carPrice*90/100;

        } else {
            carPrice=carPrice*80/100;
        }
        return carPrice;
    }
}
