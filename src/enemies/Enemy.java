package enemies;
//TODO dorobić więcej wrogów
import player.Player;

public class Enemy {
    private String name;
    private int maxHp;
    private int hp;
    private int maxMp;
    private int mp;
    private int defence;
    private int power;
    private double criticChance;


    public Enemy(){}

    public void attack(){
        int less= this.power- Player.getDefence();
        if (less>0){
        System.out.println(this.getName()+ " zadaje obrażenia równe "+less+". Pozostało Ci "+ (Player.getHp()-less)+"/"+ Player.getMaxHp()+" pkt życia.");
        Player.lessHp(less);}
        else System.out.println(getName()+" pudłuje.");
    }

    public void lessHp(int x){
        if (hp<x) {
            hp=0;
            System.out.println(getName() + " padł i raczej prędko nie wstanie");
        }else{
            hp-=x;
            System.out.println(getName()+" otrzymuje obrażenia równe "+x+". Zostało mu "+hp+"/"+maxHp+" pkt życia.");
        }
                }

    public void moreHp(int x){
        if (hp+x<maxHp) {
            hp+=x;
            System.out.println("Życie przeciwnika wzrasta o "+x+" i wynosi "+hp+"/"+maxHp+".");
        }else{
            hp=maxHp;
            System.out.println(getName()+" całkowicie się leczy. Jego życie wynosi"+hp+"/"+maxHp+" pkt życia.");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getMaxMp() {
        return maxMp;
    }

    public void setMaxMp(int maxMp) {
        this.maxMp = maxMp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getCriticChance() {
        return criticChance;
    }

    public void setCriticChance(double criticChance) {
        this.criticChance = criticChance;
    }
}
