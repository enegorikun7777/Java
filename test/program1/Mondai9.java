package test.program1;

import java.util.Scanner;

public class Mondai9 {
    public static void main(String[] args) {
        // Scannerオブジェクトを使ってユーザーからの入力を受け取る
        Scanner scanner = new Scanner(System.in,"Shift-JIS");

        // ユーザーにメッセージを表示して名前を入力させる
        System.out.print("お名前を入力してください＞ ");
        String name = scanner.nextLine();

        // 入力された名前を使ってメッセージを作成
        String message = "こんにちは、" + name + "さん！";

        // 作成したメッセージを画面に表示
        System.out.println(message);

        // Scannerを閉じる
        scanner.close();
    }
}