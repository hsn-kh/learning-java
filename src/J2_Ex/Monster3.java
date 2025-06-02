package J2_Ex;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster3 {

    private String character;
    private String trainer;
    private String name;
    private int lv;
    private int hp;
    private int atk;
    private int def;
    private int spd;
    private int hpMax;
    private String wazaNm;
    private String wazaDmgRate;

    final String WAZA_DMG_RATE_REGEXP = "^[0-9]+\\.[0-9]$";
    final String DMG_CORRECTION_120 = "120";
    final String DMG_CORRECTION_1 = "1";                   //ダメージ計算の補正で使う数字

    Monster3() {
        this.character = "(unknown)";
        this.trainer = "(wild)";
        this.name = "(noname)";
        this.lv = 1;
        this.hp = 80;
        this.atk = 15;
        this.def = 10;
        this.spd = 10;
        this.hpMax = 80;
        this.wazaNm = "たいあたり";
        this.wazaDmgRate = "1.0";
    }

    Monster3(String trainer, String name) {
        this();
        this.trainer = trainer;
        this.name = name;
    }

    Monster3(String trainer, String name, int lv) {
        this(trainer, name);

        if (lv > 1) {
            levelUp(lv - 1);
        }
    }

    public String toString() {

        return "<フィールド確認>" +
                "character:" + character + "/" +
                "trainer:" + trainer + "/" +
                "name:" + name + "/" +
                "lv:" + lv + "/" +
                "hp:" + hp + "/" +
                "atk:" + atk + "/" +
                "def:" + def + "/" +
                "spd:" + spd + "/" +
                "hpMax:" + hpMax + "/" +
                "wazaNm:" + wazaNm + "/" +
                "wazaDmgRate:" + wazaDmgRate;
    }

    public void levelUp(int up) {
        lv = lv + 1 * up;
        hpMax = hpMax + 30 * up;
        atk = atk + 5 * up;
        def = def + 5 * up;
        spd = spd + 5 * up;
        hp = hpMax;
    }

    public void setWaza(String name, String damage) {

        if (damage.matches(WAZA_DMG_RATE_REGEXP)) {
            wazaNm = name;
            wazaDmgRate = damage;
        } else {
            System.out.println("[ERROR]わざの設定に失敗しました");
        }
    }

    public String getStatus() {
        return "[ " + name + " lv" + lv + " HP" + hp + "/" + hpMax + " ]";
    }

    public int useWaza() {

        BigDecimal bdAtk = new BigDecimal(atk);
        BigDecimal bdDmgRate = new BigDecimal(wazaDmgRate);

        return (bdAtk.multiply(bdDmgRate)).intValue();
    }

    public int damaged(int sourceDamage) {
        BigDecimal bdSourceDamage = new BigDecimal(sourceDamage);
        BigDecimal bdDmgCorrection120 = new BigDecimal(DMG_CORRECTION_120);
        BigDecimal bdDmgCorrection1 = new BigDecimal(DMG_CORRECTION_1);
        BigDecimal bdDef = new BigDecimal(def);

        BigDecimal bdDamageCutRate = bdDmgCorrection1.divide(bdDmgCorrection1.add(bdDef.divide(bdDmgCorrection120, 2, RoundingMode.DOWN)), 2, RoundingMode.DOWN);

        int resultDamage = (bdSourceDamage.multiply(bdDamageCutRate)).intValue();

        if (hp > resultDamage) {
            hp = hp - resultDamage;
        } else {
            hp = 0;
        }
        return resultDamage;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public String getTrainer() {
        return trainer;
    }

    public void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpd() {
        return spd;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public int getHpMax() {
        return hpMax;
    }

    public void setHpMax(int hpMax) {
        this.hpMax = hpMax;
    }

    public String getWazaNm() {
        return wazaNm;
    }

    public void setWazaNm(String wazaNm) {
        this.wazaNm = wazaNm;
    }

    public String getWazaDmgRate() {
        return wazaDmgRate;
    }

    public void setWazaDmgRate(String wazaDmgRate) {
        this.wazaDmgRate = wazaDmgRate;
    }
}