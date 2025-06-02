package Ex2_03_1;

public class Player {

    private final String HAND_G = "グー";
    private final String HAND_C = "チョキ";
    private final String HAND_P = "パー";


    private String name;
    private String handStatus;

    public Player(String name) {
        this.name = name;
    }

    public void makeHandStatus() {

        int random1to3 = 1 + (int) (Math.random() * 3.0);    //1～3のランダムな値を取得

        switch (random1to3) {
            case 1 -> this.handStatus = HAND_G;
            case 2 -> this.handStatus = HAND_C;
            case 3 -> this.handStatus = HAND_P;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getHandStatus() {
        return this.handStatus;
    }

}