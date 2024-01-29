package test.program14;

import java.util.Scanner;

public class Mondai3 {
    public static void main(String[] args) {
        // ユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in, "Shift-JIS");
        System.out.print("文字列を入力:");
        String userInput = scanner.nextLine();
        
        // 文字列を構築する
        StringBuilder generatedString = new StringBuilder(userInput);

        // 文字数が11文字以上の場合は、11文字以降を削除
        if (generatedString.length() >= 11) {
            generatedString.setLength(10);
        }

        // 結果を画面に表示
        System.out.println("結果文字列:" + generatedString.toString());
    }
}