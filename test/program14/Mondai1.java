package test.program14;

import java.util.Scanner;

public class Mondai1 {
    public static void main(String[] args) {
        // Scannerを使ってユーザからの入力を受け取る
        Scanner scanner = new Scanner(System.in);

        System.out.print("文字列を入力してください: ");
        // ユーザからの文字列の入力を受け取る
        String userInput = scanner.nextLine();

        // 画面に入力された文字列を表示
        System.out.println(userInput);

        // Scannerを閉じる
        scanner.close();
    }
}
