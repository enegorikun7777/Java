package test.program11;
// 学生の情報を表すクラス
public class Main7 {
    String name;
    String number;
    int japanese;
    int math;
    int english;
    
    // コンストラクタ: 学生の情報を初期化する
    public Main7(String n, String num, int ja, int ma, int en) {
        name = n;
        number = num;
        japanese = ja;
        math = ma;
        english = en;
    }
    //  各教科の平均点を計算するメソッド
    static double score_sum(int x, int y, int z){
        double sum = 0;
        sum = x + y + z;
        return sum;
    }
    static double score_avarage(int x, int y, int z){
        double avarage = 0;
        avarage = (x + y + z) / 3;
        return avarage;
    }
    
}
