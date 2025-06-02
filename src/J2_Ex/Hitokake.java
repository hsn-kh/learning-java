package J2_Ex;

class Hitokake extends Monster3 {

    Hitokake() {
        //super()が暗黙的に実行されています
        super.setCharacter("ヒトカケ");
    }

    Hitokake(String trainer, String name) {
        super(trainer, name);
        super.setCharacter("ヒトカケ");
    }

    Hitokake(String trainer, String name, int lv) {
        super(trainer, name, lv);
        super.setCharacter("ヒトカケ");
    }

    public void levelUp(int up) {
        setLv(getLv() + 1 * up);
        setHpMax(getHpMax() + 29 * up);
        setAtk(getAtk() + 8 * up);
        setDef(getDef() + 5 * up);
        setSpd(getSpd() + 9 * up);
        setHp(getHpMax());
    }
}