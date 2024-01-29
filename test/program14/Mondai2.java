package test.program14;

import java.util.Scanner;

public class Mondai2 {
    public static void main(String[] args) {
        // Scannerを使ってユーザからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        // ユーザからの文字列の入力を受け取る
        String userInput = scanner.nextLine();

        // ユーザからの入力を元に新しい文字列を生成
        String String = String(userInput);

        // 生成された文字列の文字数を画面に表示
        System.out.println("入力された文字数は " + String.length() + " です。");

        // Scannerを閉じる
        scanner.close();
    }

    // 入力を元に新しい文字列を生成するメソッド
    private static String String(String input) {
        // ここでは入力文字列をそのまま返す例
        return input;
    }
}
