// [構文]
// class クラス名{
//  クラスの定義
// }

public class Vehicle {
    // ---------------[ プロパティ ]--------------
    String      Name1;           // 名前
    int         engine_size;    // 排気量
    // -----------------------------------------

    // -------[ メソッド ]--------
    // 2.メソッドを書く
    public void getOn(){
        System.out.println("誰か乗りました");
    }
    
    public String getName1() {
        return Name1;
    }

    public int getEngine_size() {
        return engine_size;
    }

    public Vehicle(String name1, int engine_size) {
        Name1 = name1;
        this.engine_size = engine_size;
    }

    // メソッド　乗る
    public void move()  {
        System.out.println("動き始めます");
    }
    // --------------------------
}


