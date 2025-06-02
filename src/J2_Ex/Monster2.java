package J2_Ex;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Monster2 {

    String character;
    String trainer;
    String name;
    int lv;
    int hp;
    int atk;
    int def;
    int spd;
    int hpMax;
    String wazaNm;
    String wazaDmgRate;

    final String WAZA_DMG_RATE_REGEXP = "^[0-9]+\\.[0-9]$";
    final String DMG_CORRECTION_120 = "120";
    final String DMG_CORRECTION_1 = "1";

    Monster2() {
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

    Monster2(String trainer, String name) {
        this();
        this.trainer = trainer;
        this.name = name;
    }

    Monster2(String trainer, String name, int lv) {
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

    void levelUp(int up) {
        lv = lv + 1 * up;
        hpMax = hpMax + 30 * up;
        atk = atk + 5 * up;
        def = def + 5 * up;
        spd = spd + 5 * up;
        hp = hpMax;
    }

    void setWaza(String name, String damage) {

        if (damage.matches(WAZA_DMG_RATE_REGEXP)) {
            wazaNm = name;
            wazaDmgRate = damage;
        } else {
            System.out.println("[ERROR]わざの設定に失敗しました");
        }
    }

    String getStatus() {
        return "[ " + name + " lv" + lv + " HP" + hp + "/" + hpMax + " ]";
    }

    int useWaza() {

        BigDecimal bdAtk = new BigDecimal(atk);
        BigDecimal bdDmgRate = new BigDecimal(wazaDmgRate);

        return (bdAtk.multiply(bdDmgRate)).intValue();
    }

    int damaged(int sourceDamage) {
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
}