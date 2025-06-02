package Ex2_03_1;

public class Janken {

    public static void main(String[] args) {

        String playerName1 = args[0];
        String playerName2 = args[1];
        String refereeName = args[2];

        Player p1 = new Player(playerName1);
        Player p2 = new Player(playerName2);
        Referee ref = new Referee(refereeName);

        ref.startJanken();

        p1.makeHandStatus();
        p2.makeHandStatus();

        ref.checkHand(p1);
        ref.checkHand(p2);

        ref.judgeJanken(p1, p2);

    }
}