import java.util.Scanner;

public class Mondai9 {
    public static void main(String[] args) {
        double radius = 3;

        double area = calculateCircleArea(radius);

        // 結果を画面に表示（小数点以下2桁まで表示）
        System.out.printf("%.2f\n", area);
    }

    // 円の面積を計算するメソッド
    public static double calculateCircleArea(double radius) {
        // 円周率
        double pi = 3.14;

        // 面積の計算
        double area = pi * radius * radius;

        return area;
    }
}
