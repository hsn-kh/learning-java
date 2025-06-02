package J2_Ex;

class Fushigiyade extends Monster3 {

    Fushigiyade() {
        super.setCharacter("フシギヤデ");
    }

    Fushigiyade(String trainer, String name) {
        super(trainer, name);
        super.setCharacter("フシギヤデ");
    }

    Fushigiyade(String trainer, String name, int lv) {
        super(trainer, name, lv);
        super.setCharacter("フシギヤデ");
    }

    public void levelUp(int up) {
        setLv(getLv() + 1 * up);
        setHpMax(getHpMax() + 31 * up);
        setAtk(getAtk() + 6 * up);
        setDef(getDef() + 7 * up);
        setSpd(getSpd() + 8 * up);
        setHp(getHpMax());
    }
}