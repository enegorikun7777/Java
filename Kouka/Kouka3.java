package Kouka;
import java.util.ArrayList;
import java.util.Scanner;

public class Kouka3 {
      // LDHアーティストのクラス
      static class LDHArtist {
        protected String name;
        protected String group;
        protected String debutYear;
        protected String position; // 新しく追加

        public LDHArtist(String name, String group, String debutYear, String position) {
            this.name = name;
            this.group = group;
            this.debutYear = debutYear;
            this.position = position; // 新しく追加
        }

        public void displayProfile() {
            System.out.println("名前: " + name);
            System.out.println("グループ: " + group);
            System.out.println("デビューした年: " + debutYear);
        }

        public void displayProfileWithDetails() {
            displayProfile();
            System.out.println("担当: " + position);
        }
    }

    // LDHグループのクラス
    static class LDHGroup {
        protected String groupName;
        protected ArrayList<LDHArtist> members;

        public LDHGroup(String groupName) {
            this.groupName = groupName;
            this.members = new ArrayList<>();
        }

        public void addMember(LDHArtist artist) {
            this.members.add(artist);
        }

        public void displayMembers() {
            System.out.println("=== " + groupName + " Members ===");
            for (LDHArtist member : members) {
                System.out.println("- " + member.name);
            }
        }

        public void displayMemberDetails(String memberName) {
            for (LDHArtist member : members) {
                if (member.name.equals(memberName)) {
                    member.displayProfileWithDetails();
                    return;
                }
            }
            System.out.println("Member not found in the group.");
        }
    }

    // LDH図鑑のクラス
    static class LDHZooBook {
        private ArrayList<LDHGroup> ldhGroups;

        public LDHZooBook() {
            this.ldhGroups = new ArrayList<>();
        }

        public void addGroup(LDHGroup group) {
            this.ldhGroups.add(group);
        }

        public void displayGroupList() {
            System.out.println("=== LDH Group List ===");
            for (int i = 0; i < ldhGroups.size(); i++) {
                System.out.println((i + 1) + ". " + ldhGroups.get(i).groupName);
            }
        }

        public void displayGroupMembers(int index) {
            if (index >= 1 && index <= ldhGroups.size()) {
                System.out.println("=== Group Members ===");
                ldhGroups.get(index - 1).displayMembers();
            } else {
                System.out.println("Invalid index. Please select a valid LDH group.");
            }
        }
    }

    // LDH図鑑アプリのクラス
    public static class LDHZooBookApp {
        public static void main(String[] args) {
            // LDHアーティストの作成
            LDHArtist atsushi = new LDHArtist("ATSUSHI", "EXILE", "2001", "Vocal");
            LDHArtist omi = new LDHArtist("OMI", "3JSB", "2010", "Vocal");
            LDHArtist ami = new LDHArtist("Ami", "E-girls,Dream", "2011", "Vocal");

            // EXILEの新しいメンバーの作成
            LDHArtist takahiro = new LDHArtist("TAKAHIRO", "EXILE", "2006", "Vocal");
            LDHArtist akira = new LDHArtist("AKIRA", "EXILE", "2003", "Performer");
            LDHArtist kenchi = new LDHArtist("KENTI", "EXILE", "2007", "Performer");

            // 三代目の新しいメンバーの作成
            LDHArtist ryuji = new LDHArtist("今市 隆二", "3JSB", "2010", "Vocal");
            LDHArtist gun = new LDHArtist("岩田 剛典", "3JSB","2010" , "Performer");
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
            LDHArtist yurino = new LDHArtist("YURINO", "Happiness", "2011", "Perfomer");
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
            Scanner scanner = new Scanner(System.in);
            System.out.print("知りたいグループを選んでください。 (1~3番の中で): ");
            int selectedGroupIndex = scanner.nextInt();

            // メンバー一覧画面の表示
            ldhZooBook.displayGroupMembers(selectedGroupIndex);

            // 追加: メンバー詳細情報表示
            System.out.print("詳細を知りたいメンバーの名前を入力してください: ");
            scanner.nextLine(); // 改行をクリア
            String memberName = scanner.nextLine();
            ldhZooBook.ldhGroups.get(selectedGroupIndex - 1).displayMemberDetails(memberName);
        }
    }
}