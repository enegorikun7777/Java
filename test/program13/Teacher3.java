package test.program13;

// Teacher3のクラスを定義
public class Teacher3 implements Person3 {
    private String name;
    private String job;
    private String subject;

    // コンストラクタ
    public Teacher3(String name, String job, String subject) {
        this.name = name;
        this.job = job;
        this.subject = subject;
    }
    
    // Person3インターフェースのメソッドを実装
    @Override
    public void introduce() {
        System.out.println("氏名: " + name);
        System.out.println("職種: " + job);
        System.out.println("得意料理: " + subject);
    }
}
