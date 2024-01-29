package test.program4;

import java.util.Scanner;

public class Mondai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーにメッセージを表示
        System.out.println("0～100 までの得点（整数値）を 2 つ入力してください");

        // 国語の得点を入力
        System.out.print("国語の得点：");
        int japaneseScore = scanner.nextInt();

        // 英語の得点を入力
        System.out.print("英語の得点：");
        int englishScore = scanner.nextInt();

        // 両方の得点が80以上の場合に「2科目とも合格です」と表示
        if (japaneseScore >= 80 && englishScore >= 80) {
            System.out.println("2科目とも合格です");
        } 
    }
}