package test.program12;

    /**
 * 人クラス
 */
class Person {
    // 名前
    String name = "";
    // 職業
    String job = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job  職業
     */
    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
     */
    public void introduce() {
        System.out.println("氏名 : " + name + " 職業 : " + job);
    }
}

/**
 * 教師クラス
 */
class Teacher extends Person {
    // 担当科目
    String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name    名前
     * @param job     職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.subject = subject;
    }

    /**
     * 自己紹介
     */
    public void introduce() {
        super.introduce();
        System.out.println("担当科目 : " + subject);
    }
}

/**
 * 料理人クラス
 */
class Cook extends Person {
    // 得意料理
    String specialities = "";

    /**
     * コンストラクタ
     * 
     * @param name         名前
     * @param job          職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.specialities = specialities;
    }

    /**
     * 自己紹介
     */
    public void introduce() {
        super.introduce();
        System.out.println("得意料理 :" + specialities);
    }
}

/**
 * メイン処理クラス
 */
public class Mondai2 {
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");

        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}

