package test.program11;

class En2 {
    static int x;
    static int y;

    // 合計値を計算するメソッド
    static int calculateSum() {
        int total = 0;
        for (int i = x; i <= y; i++) {
            total += i;
        }
        return total;
    }
}