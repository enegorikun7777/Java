import java.util.Scanner;

public class Kouka1 {
    public static void main(String[] args) {
        int[] scores = new int[5];

        // 点数の入力
        for (int i = 0; i < 5; i++) {
            scores[i] = inputScore(i + 1);
        }

        // 合計点の計算
        int totalScore = TotalScore(scores);

        // 平均点の計算
        double averageScore = AverageScore(totalScore, scores.length);

        // 結果の表示
        System.out.println("合計点: " + totalScore);
        System.out.println("平均点: " + averageScore);
    }

    // 点数の入力メソッド
    private static int inputScore(int subjectNumber) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(subjectNumber + "教科目の点数を入力してください: ");

        int score = scanner.nextInt();

        // 不正な点数の検知
        if (score < 0 || score > 100) {
            System.out.println("不正な点数を検知しました。0点とします。");
            return 0;
        }

        return score;
    }

    // 合計点の計算メソッド
    private static int TotalScore(int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }
        return total;
    }

    // 平均点の計算メソッド
    private static double AverageScore(int totalScore, int numSubjects) {
        return (double) totalScore / numSubjects;
    }
}
