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
    
    public class MainProgram {
        public static void main(String[] args) {
            // 変数 x と y に値を代入
            OperationExecutor.x = 100;
            OperationExecutor.y = 200;
    
            // 合計値を求めるメソッドを呼び出し
            int sum = OperationExecutor.calculateSum();
    
            // 結果を表示
            System.out.println(OperationExecutor.x + " から " + OperationExecutor.y + " までの合計値は " + sum + " です。");
        }
    }
}
