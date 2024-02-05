package Kouka;

/**
 * インターフェイス：プロフィールを表示可能なクラスに実装されるべきメソッドを定義する。
 */
interface Displayable {
    /**
     * プロフィールを表示するメソッド。
     */
    void displayProfile();

    /**
     * 詳細なプロフィールを表示するメソッド。
     */
    void displayProfileWithDetails();
}