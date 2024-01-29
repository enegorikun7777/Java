package test.program5;

import java.util.Scanner;

public class Mondai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーにメッセージを表示
        System.out.print("クラス番号を入力してください（1～3）：");

        // クラス番号を入力
        int classNumber = scanner.nextInt();

        // 入力されたクラス番号に対応するメッセージを表示
        switch (classNumber) {
            case 1:
                System.out.println("情報処理コース");
                break;
            case 2:
                System.out.println("OA ビジネスコース");
                break;
            case 3:
                System.out.println("税理士コース");
                break;
            default:
                System.out.println("不正な入力です");
        }
    }
}
