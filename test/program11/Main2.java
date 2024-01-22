package test.program11;

import test.program11.Mondai2.OperationExecutor;

public class Main2 {
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