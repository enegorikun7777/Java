package test.program7;

import java.util.Scanner;

public class Mondai3 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに整数を入力してもらう
        System.out.print("整数値を入力してください: ");
        int number = scanner.nextInt();

        // 入力された整数の桁を反転する
        int reversedNumber = reverseDigits(number);

        // 反転した結果を表示
        System.out.println(reversedNumber);
    }

    // 整数の桁を反転するメソッド
    private static int reverseDigits(int number) {
        int reversedNumber = 0;

        do {
            // 入力された整数の最後の桁を取得して反転用の変数に追加
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;

            // 入力された整数から最後の桁を削除
            number /= 10;
        } while (number != 0);

        return reversedNumber;
    }
}
