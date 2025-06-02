package J2_02_1;

class Janken {
    public static void main(String[] args) {

        final String HAND_G = "グー";
        final String HAND_C = "チョキ";
        final String HAND_P = "パー";

        String playerName1 = args[0];
        String playerName2 = args[1];

        Player player1 = new Player(playerName1);
        Player player2 = new Player(playerName2);

        System.out.println("じゃんけん・・・ぽん！！！！！");

        player1.makeHandStatus();
        player2.makeHandStatus();

        System.out.println(player1.name + "さんの手 : " + player1.handStatus);
        System.out.println(player2.name + "さんの手 : " + player2.handStatus);

        System.out.println("結果は・・・");

        if (player1.handStatus.equals(player2.handStatus)) {

            System.out.println("あいこ！勝負つかず！");

        } else if ((player1.handStatus.equals(HAND_G) && player2.handStatus.equals(HAND_C))
                || (player1.handStatus.equals(HAND_C) && player2.handStatus.equals(HAND_P))
                || (player1.handStatus.equals(HAND_P) && player2.handStatus.equals(HAND_G))) {

            System.out.println(player1.name + "さんの勝利！");

        } else if ((player2.handStatus.equals(HAND_G) && player1.handStatus.equals(HAND_C))
                || (player2.handStatus.equals(HAND_C) && player1.handStatus.equals(HAND_P))
                || (player2.handStatus.equals(HAND_P) && player1.handStatus.equals(HAND_G))) {

            System.out.println(player2.name + "さんの勝利！");

        } else {

            System.out.println("[ERROR]ジャンケンの判定が不正です。");

        }
    }
}