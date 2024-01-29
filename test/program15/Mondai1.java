package test.program15;

import java.util.Scanner;

public class Mondai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // 1つ目の整数入力
            System.out.print("整数1 = ");
            int num1 = scanner.nextInt();

            // 2つ目の整数入力
            System.out.print("整数2 = ");
            int num2 = scanner.nextInt();

            // num2がゼロでないか確認して、ゼロでの除算を避ける
            // if (num2 == 0) {
            //     // もしnum2がゼロなら、ArithmeticExceptionをスローする
            //     throw new ArithmeticException();
            // }

            // 割り算の実行
            double result = num1 / num2;

            // 結果の表示
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (ArithmeticException e) {
            // 0で割った場合の例外処理
            System.out.println("0による割り算です!!");
        } finally {
            System.out.println("処理終了");
        }
    }
}