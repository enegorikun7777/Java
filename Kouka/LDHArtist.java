package Kouka;

/**
 * LDHのアーティストクラス
 */

public class LDHArtist {
    // アーティストの名前
    protected String name;
    
    // アーティストが所属するグループ
    protected String group;
    
    // アーティストのデビューした年
    protected String debutYear;
    
    // アーティストの担当ポジション（新しく追加）
    protected String position;

    /**
     * コンストラクタ：LDHArtist クラスのインスタンスを生成する。
     *
     * @param name       アーティストの名前
     * @param group      アーティストが所属するグループ
     * @param debutYear  アーティストのデビューした年
     * @param position   アーティストの担当ポジション
     */
    public LDHArtist(String name, String group, String debutYear, String position) {
        this.name = name;
        this.group = group;
        this.debutYear = debutYear;
        this.position = position;
    }

    /**
     * アーティストのプロフィールを表示。
     */
    public void displayProfile() {
        System.out.println("名前: " + name);
        System.out.println("グループ: " + group);
        System.out.println("デビューした年: " + debutYear);
    }

    /**
     * アーティストの詳細なプロフィールを表示。
     * 担当ポジションも含まれる。
     */
    public void displayProfileWithDetails() {
        displayProfile();
        System.out.println("担当: " + position);
    }
}
