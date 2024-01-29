package test.program4;

import java.util.Scanner;

public class Mondai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーにメッセージを表示
        System.out.print("0～100 までの得点（整数値）を入力してください：");

        // 得点を入力
        int score = scanner.nextInt();

        // 得点が80以上の場合に「合格です」と表示
        if (score >= 80) {
            System.out.println("合格です");
        } 
    }
}
