package Ex2_02_1;

class Player {

    final String HAND_G = "グー";
    final String HAND_C = "チョキ";
    final String HAND_P = "パー";

    String name;
    String handStatus;

    Player(String nm) {
        this.name = nm;
    }

    void makeHandStatus() {

        int random1to3 = 1 + (int) (Math.random() * 3.0);

        switch (random1to3) {
            case 1 -> this.handStatus = HAND_G;
            case 2 -> this.handStatus = HAND_C;
            case 3 -> this.handStatus = HAND_P;
        }
    }
}