package test.program13;

public class Main3 {
    public static void main(String[] args) {
        // Teacher3クラスのインスタンス生成と情報表示
        Teacher3 teacher = new Teacher3("竹井一馬", "教員", "情報処理");
        teacher.introduce();

        // 空の文字列を改行とともに標準出力に出力
        System.out.println("");

        // Cook3クラスのインスタンス生成と情報表示
        Cook3 cook = new Cook3("大原太郎", "シェフ", "オムライス");
        cook.introduce();
    }
}
