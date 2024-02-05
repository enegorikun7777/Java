package Kouka;

/**
 * LDHのアーティストクラス
 */
public class LDHArtist {
    // アーティストの名前
    private String name;

    // アーティストが所属するグループ
    private String group;

    // アーティストのデビューした年
    private String debutYear;

    // アーティストの担当ポジション（新しく追加）
    private String position;

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

    // nameのゲッター
    public String getName() {
        return name;
    }

    // nameのセッター
    public void setName(String name) {
        this.name = name;
    }

    // groupのゲッター
    public String getGroup() {
        return group;
    }

    // groupのセッター
    public void setGroup(String group) {
        this.group = group;
    }

    // debutYearのゲッター
    public String getDebutYear() {
        return debutYear;
    }

    // debutYearのセッター
    public void setDebutYear(String debutYear) {
        this.debutYear = debutYear;
    }

    // positionのゲッター
    public String getPosition() {
        return position;
    }

    // positionのセッター
    public void setPosition(String position) {
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