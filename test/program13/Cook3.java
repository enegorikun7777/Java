package test.program13;

// Cook3のクラスを定義
public class Cook3 implements Person3 {
    private String name;
    private String job;
    private String specialities;

    // コンストラクタ
    public Cook3(String name, String job, String specialities) {
        this.name = name;
        this.job = job;
        this.specialities = specialities;
    }

    // Person3インターフェースのメソッドを実装
    @Override
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("得意料理: " + specialities);
    }
}
