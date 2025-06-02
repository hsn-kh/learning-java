package Ex2_03_1;

public class Referee {

    private final String HAND_G = "グー";
    private final String HAND_C = "チョキ";
    private final String HAND_P = "パー";

    private String name;

    public Referee(String name) {
        this.name = name;
    }

    public void startJanken() {

        messageReferee("じゃんけん・・・ぽん！！！！！");

    }

    public void checkHand(Player player) {

        switch (player.getHandStatus()) {
            case HAND_G -> messageReferee(player.getName() + "さんの手はグーでした！");
            case HAND_C -> messageReferee(player.getName() + "さんの手はチョキでした！");
            case HAND_P -> messageReferee(player.getName() + "さんの手はパーでした！");
            default -> System.out.println("[ERROR]ジャンケンの判定が不正です。");
        }

    }

    public void judgeJanken(Player player1, Player player2) {

        messageReferee("結果は・・・");

        if ((player1.getHandStatus()).equals(player2.getHandStatus())) {

            messageReferee("あいこ！勝負つかず！");

        } else if ((player1.getHandStatus().equals(HAND_G) && player2.getHandStatus().equals(HAND_C))
                || (player1.getHandStatus().equals(HAND_C) && player2.getHandStatus().equals(HAND_P))
                || (player1.getHandStatus().equals(HAND_P) && player2.getHandStatus().equals(HAND_G))) {

            messageReferee(player1.getName() + "さんの勝利！");

        } else if ((player2.getHandStatus().equals(HAND_G) && player1.getHandStatus().equals(HAND_C))
                || (player2.getHandStatus().equals(HAND_C) && player1.getHandStatus().equals(HAND_P))
                || (player2.getHandStatus().equals(HAND_P) && player1.getHandStatus().equals(HAND_G))) {

            messageReferee(player2.getName() + "さんの勝利！");

        } else {

            System.out.println("[ERROR]ジャンケンの判定が不正です。");

        }
    }

    private void messageReferee(String msg) {

        System.out.println(this.name + "「" + msg + "」");

    }

    public String getName() {
        return this.name;
    }

}