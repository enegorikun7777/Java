package test.program11;
import test.program11.Mondai3.En3;

public class Main3 {
    public static void main(String[] args) {
        // 外部クラスのインスタンスを作成
        Mondai3 mondai3Instance = new Mondai3();

        // 内部クラスのインスタンスを作成
        En3 en3 = mondai3Instance.new En3();
        
        // xとyの値を設定
        int xValue = 100;
        int yValue = 200;
        en3.setValues(xValue, yValue);

        // 合計値を計算
        int total = en3.calculateSum();

        // 結果を出力
        System.out.println(en3.getX() + " から " + en3.getY() + " までの合計値は" + total + "です。");
    }
}

