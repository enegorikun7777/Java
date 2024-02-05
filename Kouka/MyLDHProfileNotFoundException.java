package Kouka;

import Kouka.MyLDHProfileNotFoundException;

/**
 * LDHプロフィールが見つからなかった場合にスローされる例外クラス。
 * MyLDHProfileNotFoundException は Exception クラスを継承し、
 * メッセージを含むコンストラクタを提供している。
 */
public class MyLDHProfileNotFoundException extends Exception {
    
    /**
     * MyLDHProfileNotFoundException クラスのコンストラクタ
     *
     * @param message 例外の詳細メッセージ
     */
    public MyLDHProfileNotFoundException(String message) {
        // 親クラス (Exception) のコンストラクタを呼び出し、メッセージを設定
        super(message);
    }
}