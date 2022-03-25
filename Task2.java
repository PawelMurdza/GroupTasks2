package com.GroupTasks;

public class Task2 {
}
abstract class Marks {
    void getPercentage(){};
public static void main(String[] args) {
    Marks obj1 = new A(60,80,95);
    Marks obj2 = new B(90,55,80,75);
    obj1.getPercentage();
    obj2.getPercentage();
}

}
class A extends Marks {
    int mark1;
    int mark2;
    int mark3;

    void getPercentage() {
        int avg=(mark1+mark2+mark3)/3;
        System.out.println("Student A average mark "+avg);
    }
     A(int mark1,int mark2, int mark3) {
        this.mark1=mark1;
        this.mark2=mark2;
        this.mark3=mark3;
    }

}
class B extends Marks {
    int mark1;
    int mark2;
    int mark3;
    int mark4;

     B(int mark1, int mark2,int mark3, int mark4) {
    this.mark1=mark1;
    this.mark2=mark2;
    this.mark3=mark3;
    this.mark4=mark4;
    }
    void getPercentage() {
        int avg2=(mark1+mark2+mark3+mark4)/4;
        System.out.println("Student B average mark "+avg2);
    }
}


