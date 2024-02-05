package Kouka;

import java.util.ArrayList;

/**
 * LDH図鑑のクラス
 */
public class LDHZooBook {
    // LDHグループのリスト
    public ArrayList<LDHGroup> ldhGroups;

    /**
     * コンストラクタ：LDHZooBook クラスのインスタンスを生成する。
     */
    public LDHZooBook() {
        this.ldhGroups = new ArrayList<>();
    }

    /**
     * LDHグループを図鑑に追加する。
     *
     * @param group 追加するLDHグループ
     */
    public void addGroup(LDHGroup group) {
        this.ldhGroups.add(group);
    }

    /**
     * LDHグループの一覧を表示。
     */
    public void displayGroupList() {
        System.out.println("=== LDH Group List ===");
        for (int i = 0; i < ldhGroups.size(); i++) {
            System.out.println((i + 1) + ". " + ldhGroups.get(i).groupName);
        }
    }

    /**
     * 指定されたインデックスのLDHグループのメンバー一覧を表示する。
     *
     * @param index 表示するLDHグループのインデックス
     */
    public void displayGroupMembers(int index) {
        if (index >= 1 && index <= ldhGroups.size()) {
            System.out.println("=== Group Members ===");
            ldhGroups.get(index - 1).displayMembers();
        } else {
            System.out.println("Invalid index. Please select a valid LDH group.");
        }
    }
}