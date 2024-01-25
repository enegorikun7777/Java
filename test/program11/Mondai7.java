package test.program11;

import java.lang.reflect.Array;

// 学生情報を表すクラス
public class Mondai7 {
    public static void main(String[] args) {
        // 学生情報を作成
        Main7 A = new Main7("A", "001", 89, 65, 88);
        Main7 B = new Main7("B", "002", 80, 95, 64);
        Main7 C = new Main7("C", "003", 70, 80, 98);
        
        // 各学生の情報を表示
        System.out.println(A.number + "番" + A.name + "さん" + "平均点" + Main7.score_avarage(A.japanese, A.math, A.english));
        System.out.println(B.number + "番" + B.name + "さん" + "平均点" + Main7.score_avarage(B.japanese, B.math, B.english));
        System.out.println(C.number + "番" + C.name + "さん" + "平均点" + Main7.score_avarage(C.japanese, C.math, C.english));
    }
}
