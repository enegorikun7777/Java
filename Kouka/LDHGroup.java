package Kouka;

import java.util.ArrayList;

/**
 * LDHグループのクラス
 */
public class LDHGroup {
    // グループの名前
    protected String groupName;

    // グループのメンバー（LDHArtistのインスタンスのリスト）
    protected ArrayList<LDHArtist> members;

    /**
     * コンストラクタ：LDHGroup クラスのインスタンスを生成する。
     *
     * @param groupName グループの名前
     */
    public LDHGroup(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
    }

    /**
     * グループにメンバーを追加する。
     *
     * @param artist LDHArtist クラスのインスタンス（メンバー）
     */
    public void addMember(LDHArtist artist) {
        this.members.add(artist);
    }

    /**
     * グループのメンバー一覧を表示。
     */
    public void displayMembers() {
        System.out.println("=== " + groupName + " Members ===");
        for (LDHArtist member : members) {
            System.out.println("- " + member.name);
        }
    }

    /**
     * 指定された名前のメンバーを取得する。
     *
     * @param memberName 取得したいメンバーの名前
     * @return メンバーの LDHArtist インスタンス
     * @throws MyLDHProfileNotFoundException メンバーが見つからない場合の例外
     */
    private LDHArtist getMemberByName(String memberName) throws MyLDHProfileNotFoundException {
        for (LDHArtist member : members) {
            if (member.name.equals(memberName)) {
                return member;
            }
        }
        throw new MyLDHProfileNotFoundException("Member not found in the group.");
    }

    /**
     * 指定された名前のメンバーの詳細情報を表示する。
     *
     * @param memberName 詳細を表示したいメンバーの名前
     */
    public void displayMemberDetails(String memberName) {
        try {
            LDHArtist member = getMemberByName(memberName);
            member.displayProfileWithDetails();
        } catch (MyLDHProfileNotFoundException e) {
        System.out.println(e.getMessage());
        }
    }
}