package test.program11;

public class Mondai2 {
    class OperationExecutor {
        // クラス変数として x と y を定義
        static int x;
        static int y;
    
        // 合計値を求めるメソッド
        static int calculateSum() {
            int sum = 0;
            // x から y までの合計を計算
            for (int i = x; i <= y; i++) {
                sum += i;
            }
            return sum;
        }
    }
}