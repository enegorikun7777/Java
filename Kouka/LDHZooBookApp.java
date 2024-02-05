package Kouka;

import java.util.Scanner;

public class LDHZooBookApp {
    // LDH図鑑アプリのクラス
    public static void main(String[] args) {
        // LDHアーティストの作成
        LDHArtist atsushi = new LDHArtist("ATSUSHI", "EXILE", "2001", "Vocal");
        LDHArtist omi = new LDHArtist("OMI", "3JSB", "2010", "Vocal");
        LDHArtist ami = new LDHArtist("Ami", "E-girls,Dream", "2011", "Vocal");

        // EXILEの新しいメンバーの作成
        LDHArtist takahiro = new LDHArtist("TAKAHIRO", "EXILE", "2006", "Vocal");
        LDHArtist akira = new LDHArtist("AKIRA", "EXILE THE SECOND", "2003", "Performer");
        LDHArtist kenchi = new LDHArtist("KENTI", "EXILE", "2007", "Performer");
        LDHArtist keiji = new LDHArtist("黒木 啓司", "EXILE THE SECOND", "2007", "Performer");
        LDHArtist tetsuya = new LDHArtist("TETSUYA", "EXILE THE SECOND", "2007", "Performer");
        LDHArtist nesmith = new LDHArtist("NESMITH", "EXILE THE SECOND", "2001", "Performer");
        LDHArtist shokichi = new LDHArtist("SHOKICHI", "EXILE THE SECOND", "2007", "Vocal");
        LDHArtist aran = new LDHArtist("白濱 亜嵐", "GENERATIONS", "2010", "Performer");
        LDHArtist mendy = new LDHArtist("関口 メンディー", "GENERATIONS", "2011", "Performer");
        LDHArtist sekai = new LDHArtist("世界", "FANTASTICS from EXILE TRIBE", "2014", "Performer");
        LDHArtist daiki = new LDHArtist("佐藤 大樹", "FANTASTICS from EXILE TRIBE", "2011", "Performer");

        // 三代目の新しいメンバーの作成
        LDHArtist ryuji = new LDHArtist("今市 隆二", "3JSB", "2010", "Vocal");
        LDHArtist gun = new LDHArtist("岩田 剛典", "3JSB", "2010", "Performer");
        LDHArtist kenjirou = new LDHArtist("山下 健二郎", "3JSB", "2010", "Performer");
        LDHArtist naoto = new LDHArtist("NAOTO", "3JSB", "2010", "Performer");
        LDHArtist elly = new LDHArtist("ELLY", "3JSB", "2010", "Performer");
        LDHArtist naoki = new LDHArtist("小林 直己", "3JSB", "2010", "Performer");

        // E-girlsの新しいメンバーの作成
        LDHArtist shizuka = new LDHArtist("Shizuka", "Dream", "2011", "Vocal");
        LDHArtist aya = new LDHArtist("Aya", "Dream", "2011", "Vocal");
        LDHArtist erie = new LDHArtist("Erie", "Dream", "2011", "Vocal");
        LDHArtist sayaka = new LDHArtist("SAYAKA", "Happiness", "2011", "Performer");
        LDHArtist kaede = new LDHArtist("楓", "Happiness", "2011", "Performer");
        LDHArtist karen = new LDHArtist("藤井 夏恋", "Happiness", "2011", "Vocal");
        LDHArtist miyuu = new LDHArtist("MIYUU", "Happiness", "2011", "Performer");
        LDHArtist yurino = new LDHArtist("YURINO", "Happiness", "2011", "Performer");
        LDHArtist anna = new LDHArtist("須田 アンナ", "Happiness", "2011", "Performer");
        LDHArtist ruri = new LDHArtist("川本 璃", "Happiness", "2011", "Performer");
        LDHArtist shuka = new LDHArtist("藤井 萩花", "Flower", "2011", "Performer");
        LDHArtist manami = new LDHArtist("重留 真波", "Flower", "2011", "Performer");
        LDHArtist mio = new LDHArtist("中島 美央", "Flower", "2011", "Performer");
        LDHArtist reina = new LDHArtist("鷲尾 怜奈", "Flower", "2011", "Vocal");
        LDHArtist kyouka = new LDHArtist("市来 杏香", "Flower", "2011", "Vocal");
        LDHArtist nozomi = new LDHArtist("坂東 希", "Flower", "2011", "Performer");
        LDHArtist harumi = new LDHArtist("佐藤 晴美", "Flower", "2011", "Performer");
        LDHArtist yuzuna = new LDHArtist("武部 柚那", "E-girls", "2011", "Vocal");
        LDHArtist misato = new LDHArtist("萩尾 美聖", "E-girls", "2011", "Performer");
        LDHArtist rio = new LDHArtist("稲垣 莉生", "E-girls", "2011", "Performer");
        LDHArtist ishii = new LDHArtist("石井 杏奈", "E-girls", "2011", "Performer");

        // EXILEグループの作成とメンバーの追加
        LDHGroup exile = new LDHGroup("EXILE");
        exile.addMember(atsushi);
        exile.addMember(takahiro);  // 新しいメンバーを追加
        exile.addMember(akira);
        exile.addMember(kenchi);
        exile.addMember(keiji);
        exile.addMember(tetsuya);
        exile.addMember(nesmith);
        exile.addMember(shokichi);
        exile.addMember(aran);
        exile.addMember(mendy);
        exile.addMember(sekai);
        exile.addMember(daiki);

        // 三代目のグループの作成とメンバーの追加
        LDHGroup jsb = new LDHGroup("3JSB");
        jsb.addMember(omi);
        jsb.addMember(ryuji);  // 新しいメンバーを追加
        jsb.addMember(gun);
        jsb.addMember(kenjirou);
        jsb.addMember(naoto);
        jsb.addMember(elly);
        jsb.addMember(naoki);

        // E-girlsのグループの作成とメンバーの追加
        LDHGroup egirlsGroup = new LDHGroup("E-girls");
        egirlsGroup.addMember(ami);
        egirlsGroup.addMember(shizuka);
        egirlsGroup.addMember(aya);
        egirlsGroup.addMember(erie);
        egirlsGroup.addMember(sayaka);
        egirlsGroup.addMember(kaede);
        egirlsGroup.addMember(karen);
        egirlsGroup.addMember(miyuu);
        egirlsGroup.addMember(yurino);
        egirlsGroup.addMember(anna);
        egirlsGroup.addMember(ruri);
        egirlsGroup.addMember(shuka);
        egirlsGroup.addMember(manami);
        egirlsGroup.addMember(mio);
        egirlsGroup.addMember(reina);
        egirlsGroup.addMember(kyouka);
        egirlsGroup.addMember(nozomi);
        egirlsGroup.addMember(harumi);
        egirlsGroup.addMember(yuzuna);
        egirlsGroup.addMember(misato);
        egirlsGroup.addMember(rio);
        egirlsGroup.addMember(ishii);

        // LDH図鑑の作成とグループの追加
        LDHZooBook ldhZooBook = new LDHZooBook();
        ldhZooBook.addGroup(exile);
        ldhZooBook.addGroup(jsb);
        ldhZooBook.addGroup(egirlsGroup);

        // 一覧画面の表示
        ldhZooBook.displayGroupList();

        // ユーザーによるグループの選択
        Scanner scanner = new Scanner(System.in, "Shift-JIS");

        boolean exitProgram = false;

        while (!exitProgram) {

            // ユーザーによるグループの選択
            System.out.print("知りたいグループを選んでください。 (1~3番の中で): ");
            int selectedGroupIndex = scanner.nextInt();

            // メンバー一覧画面の表示
            ldhZooBook.displayGroupMembers(selectedGroupIndex);

            // 追加: メンバー詳細情報表示
            System.out.print("詳細を知りたいメンバーの名前を入力してください: ");
            scanner.nextLine(); // 改行をクリア
            String memberName = scanner.nextLine();
            ldhZooBook.ldhGroups.get(selectedGroupIndex - 1).displayMemberDetails(memberName);

            // メニュー表示
            System.out.print("続けますか？ (はい: 1, いいえ: 0): ");
            int continueChoice = scanner.nextInt();

            if (continueChoice == 0) {
                exitProgram = true;
                System.out.println("LDH図鑑を終了します。");
            }
        }

        // スキャナーを閉じる
        scanner.close();
    }
}
