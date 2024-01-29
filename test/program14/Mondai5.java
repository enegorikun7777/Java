package test.program14;

public class Mondai5 {
    public static void main(String[] args) {
        // 内容1の文字列
        String a = "東京都千代田区";

        // 内容2の文字列
        String b = "神田神保町";

        // StringBuilderクラスを使用して新しい文字列を構築
        StringBuilder c = new StringBuilder(a);

        // aの末尾にbを追加
        c.append(b);

        // 結果を画面に表示
        System.out.println(c);
    }
}