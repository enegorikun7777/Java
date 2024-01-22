package test.program11;

public class Mondai3 {
// xとyの値を持ち、それらの値を設定し、合計値を計算するクラス
class En3 {
    private int x; 
    private int y;  

    // xとyの値を設定する
    void setValues(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // xの値を取得するメソッド
    int getX() {
        return x;
    }

    // yの値を取得するメソッド
    int getY() {
        return y;
    }

    // 合計値を計算するメソッド
    int calculateSum() {
        int total = 0;
        for (int i = x; i <= y; i++) {
            total += i;
        }
        return total;
    }
}


}
