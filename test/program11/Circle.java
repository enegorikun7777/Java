package test.program11;

import java.util.Scanner;

public class Circle { 
   private static final double PI = 3.1415;
   private double radius;
   public Circle(double radius) {
       this.radius = radius;
   }
   //円周の長さ
   public double calculateCircumference() {
       return 2 * PI * radius;
   }
   //円の面積
   public double calculateArea() {
       return PI * radius * radius;
   }
}
class CircleProgram {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("半径を整数値で入力：");
       double radius = scanner.nextDouble();
       Circle circle = new Circle(radius);
       
       System.out.println("円周の長さは" + circle.calculateCircumference() + "です。");
       System.out.printf("円の面積は%.3fです。", circle.calculateArea());
       scanner.close();
   }
}

