package test.program11;
import test.program11.En2;

public class Main2 {
    public static void main(String[] args) {
        // 変数の初期化
        int xValue = 100;
        int yValue = 200;

        En2.x = xValue;
        En2.y = yValue;

        // 合計値を計算
        int total = En2.calculateSum();

        // 結果を出力
        System.out.println(En2.x + " から " + En2.y + " までの合計値は" + total + "です。");
    }
}