package player;


public class Player {
    private static String name;
    private static int maxHp = 100;
    private static int hp = maxHp;
    private static int maxMp = 0;
    private static int mp = 0;
    private static int defence = 5;
    private static int minPower = 7;
    private static int maxPower = 12;
    private static double criticChance = 1;

    public Player(String name) {
        this.name = name;
    }

    public static int averagePower(){
        int differentOfPowers=maxPower-minPower+1;
        return minPower+(int)(Math.random()*differentOfPowers);
    }

    public static int getMp() {
        return mp;
    }

    public static void setMp(int smp) {
        mp = smp;
    }

    public static int getMaxMp() {
        return maxMp;
    }

    public static void setMaxMp(int smaxMp) {
        maxMp = smaxMp;
    }

    public static String getName() {
        return name;
    }

    public static int getMaxHp() {
        return maxHp;
    }

    public static void setMaxHp(int smaxHp) {
        maxHp = smaxHp;
    }

    public static int getHp() {
        return hp;
    }

    public static void setHp(int shp) {
        hp = shp;
    }

    public static int getDefence() {
        return defence;
    }

    public static void setDefence(int sdefence) {
        defence = sdefence;
    }

    public static int getMinPower() {
        return minPower;
    }

    public static void setMinPower(int sminPower) {
        minPower = sminPower;
    }

    public static int getMaxPower() {
        return maxPower;
    }

    public static void setMaxPower(int smaxPower) {
        maxPower = smaxPower;
    }

    public static double getCriticChance() {
        return criticChance;
    }

    public static void setCriticChance(double scriticChance) {
        criticChance = scriticChance;
    }

    public static void lessHp(int x) {
        if (getHp() > x) {
            setHp(getHp() - x);
        } else {
            System.out.println("Ojoj...Przegrałeś... Nawet nie wiesz jak mi bardzo... wszystko jedno...");
            System.out.println("GAME OVER");
            System.exit(0);
        }
    }

    public static void moreHp(int x) {
        if (getHp() + x < getMaxHp()) {
            setHp(getHp() + x);
            System.out.println("Wyleczono "+x+" pkt życia. Twoje życie wynosi " + getHp() + "/" + getMaxHp() + " pkt.");
        } else {
            setHp(getMaxHp());
            System.out.println("Wyleczono całkowicie. Twoje życie wynosi " + getHp() + "/" + getMaxHp() + " pkt.");

        }
    }

    public static void lessMp(int x) {
        if (getMp() > x) {
            setMp(getMp() - x);
            System.out.println(" Twoja mana wynosi " + getMp() + "/" + getMaxMp() + " pkt.");
        } else {
            System.out.println("Za mało many");
        }
    }

    public static void moreMp(int x) {
        if (getMp() + x < getMaxMp()) {
            setMp(getMp() + x);
            System.out.println("Twoja mana wynosi " + getMp() + "/" + getMaxMp() + " pkt.");
        } else {
            setMp(getMaxMp());
            System.out.println("Twoja mana wynosi " + getMp() + "/" + getMaxMp() + " pkt.");

        }
    }

}
