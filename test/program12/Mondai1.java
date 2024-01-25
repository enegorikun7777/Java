package test.program12;

import java.util.Scanner;

public class Mondai1 {
    // 2つの引数の合計値を返す
    public int calcSum(int a, int b) {
        return a + b;
    }
    // 2つの引数の平均値を返す
    public double calcAve(int a, int b) {
        return (a + b) / 2.0;
    }
}
// 引数の累乗を求めて返すメソッド
class MoreCalc extends Mondai1 {
    public int calcPow(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }
}

class CalculaterProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        // 1つ目の整数
        System.out.print("整数を入力してください:");
        int a = scanner.nextInt();

        // 2つ目の整数
        System.out.print("整数を入力してください:");
        int b = scanner.nextInt();

        MoreCalc moreCalc = new MoreCalc();

        System.out.println("Sum " + a + " and " + b + " = " + moreCalc.calcSum(a, b));
        System.out.println("Average " + a + " and " + b + " = " + moreCalc.calcAve(a, b));
        System.out.println("Power " + a + " of " + b + " = " + moreCalc.calcPow(a, b));
    }
}
