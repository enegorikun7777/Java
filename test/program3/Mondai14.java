import java.util.Scanner;

public class Mondai14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーにメッセージを表示
        System.out.println("長方形の面積を求めます");

        // 縦の長さを入力
        System.out.print("縦の長さ：");
        double vertical = scanner.nextDouble();

        // 横の長さを入力
        System.out.print("横の長さ：");
        double horizontal = scanner.nextDouble();

        // 長方形の面積を計算
        double area = calculateRectangleArea(vertical, horizontal);

        // 面積を表示
        System.out.println("長方形の面積 = " + area);
    }

    // 長方形の面積を計算するメソッド
    private static double calculateRectangleArea(double vertical, double horizontal) {
        return vertical * horizontal;
    }
}
