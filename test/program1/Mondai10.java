package test.program1;

import java.util.Scanner;

public class Mondai10 {
    public static void main(String[] args) {
        // Scanner オブジェクトの作成
        Scanner scanner = new Scanner(System.in,"Shift-JIS"); 

        // 文字列入力の例
        System.out.print("文字の入力 :");
        String inputString = scanner.nextLine();

        // 整数入力の例
        System.out.print("整数の入力 :");
        int inputInteger = scanner.nextInt();

        // 小数入力の例
        System.out.print("小数の入力: ");
        double inputDecimal = scanner.nextDouble();

        // 入力を使用して文字列を構築
        String resultString = "入力された文字 = " + inputString + " 入力された整数 = " + (inputInteger) + " 入力された小数 = " + inputDecimal;

        // 結果を表示
        System.out.println(resultString);

        // Scanner クラスのクローズ
        scanner.close();
    }
}
