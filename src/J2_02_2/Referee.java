package Ex2_02_2;

public class Referee {

    final String HAND_G = "グー";
    final String HAND_C = "チョキ";
    final String HAND_P = "パー";


    String name;

    Referee(String name) {
        this.name = name;
    }

    void startJanken() {
        messageReferee("じゃんけん・・・ぽん！！！！！");
    }

    void checkHand(Player player) {
        switch (player.handStatus) {
            case HAND_G -> messageReferee(player.name + "さんの手はグーでした！");
            case HAND_C -> messageReferee(player.name + "さんの手はチョキでした！");
            case HAND_P -> messageReferee(player.name + "さんの手はパーでした！");
            default -> System.out.println("[ERROR]ジャンケンの判定が不正です。");
        }
    }

    void judgeJanken(Player player1, Player player2) {

        messageReferee("結果は・・・");

        if (player1.handStatus.equals(player2.handStatus)) {

            messageReferee("あいこ！勝負つかず！");

        } else if ((player1.handStatus.equals(HAND_G) && player2.handStatus.equals(HAND_C))
                || (player1.handStatus.equals(HAND_C) && player2.handStatus.equals(HAND_P))
                || (player1.handStatus.equals(HAND_P) && player2.handStatus.equals(HAND_G))) {

            messageReferee(player1.name + "さんの勝利！");

        } else if ((player2.handStatus.equals(HAND_G) && player1.handStatus.equals(HAND_C))
                || (player2.handStatus.equals(HAND_C) && player1.handStatus.equals(HAND_P))
                || (player2.handStatus.equals(HAND_P) && player1.handStatus.equals(HAND_G))) {

            messageReferee(player2.name + "さんの勝利！");

        } else {

            System.out.println("[ERROR]ジャンケンの判定が不正です。");

        }
    }

    void messageReferee(String msg) {

        System.out.println(this.name + "「" + msg + "」");

    }
}