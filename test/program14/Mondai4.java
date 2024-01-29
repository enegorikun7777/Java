package test.program14;

import java.util.Scanner;

public class Mondai4 {
    public static void main(String[] args) {
        // ユーザーから入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("文字列を２つ入力してください。");

        // 文字列を入力させる
        System.out.print("１つ目文字列を入力:");
        String a = scanner.next();
        System.out.print("２つ目文字列を入力:");
        String b = scanner.next();

        // 文字列の比較
        // 同じ場合
        if (a.equals(b))
            System.out.println("同じ文字列です。");
        // 違う場合
        else 
            System.out.println("違う文字列です。");
    }
}
        