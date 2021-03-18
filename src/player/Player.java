package player;


public class Player {
    private String name;
    private int maxHp = 100;
    private int hp = maxHp;
    private int maxMp;
    private int mp;
    private int defence = 5;
    private int minPower = 7;
    private int maxPower = 12;
    private double criticChance = 0.1;

    public Player(String name) {
        this.name = name;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public String getName() {
        return name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getMinPower() {
        return minPower;
    }

    public void setMinPower(int minPower) {
        this.minPower = minPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public double getCriticChance() {
        return criticChance;
    }

    public void setCriticChance(double criticChance) {
        this.criticChance = criticChance;
    }

}
