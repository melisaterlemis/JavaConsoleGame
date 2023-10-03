import java.util.Scanner;

public class Player {

    private int damage, healthy, money, rHealthy;
    private String name, cName;

    private Inventory inv;
    Scanner scan = new Scanner(System.in);

//karakter seçimi
    public void selectCha(){
    switch (chaMenu()){
        case 1:
           initPlayer("Samuray" , 5, 21, 15);
            break;
        case 2:
            initPlayer("Okcu" , 7, 18, 20);
            break;
        case 3:
            initPlayer("Şovalye" , 8, 24, 5);
            break;
        default:
            initPlayer("Samuray" , 5, 21, 15);
            break;
    }
System.out.println("Karakteriniz:  " + getcName() + "\t Hasar: " + getDamage() + "\t Sağlık: " + getHealthy() + "\tPara: " + getMoney() );
    }

    public int chaMenu(){
        System.out.println("Lütfen bir karaker seçiniz: ");
        System.out.println("1- Samuray,\t Hasar: 5,\t Sağlık: 21, \tPara: 15");
        System.out.println("2- Okcu,   \t Hasar: 7, \tSağlık: 18, \tPara: 20");
        System.out.println("3- Şovalye,\t Hasar: 8, \tSağlık: 24, \tPara: 5");
        System.out.println("Seçiniz: ");
        int chaID =  scan.nextInt();
        while(chaID < 1 || chaID > 3){

            System.out.println("Lütfen geçrerli bir karaketer giriniz: ");
            chaID  = scan.nextInt();
        }
        return chaID;


    }

    public void initPlayer(String cName, int dmg, int hlthy, int mny){
        setcName(cName);
        setDamage(dmg);
        setHealthy(hlthy);
        setMoney(mny);
        setrHealthy(healthy);
    }
    public Inventory getInv() {
        return inv;
    }

    public void setInv(Inventory inv) {
        this.inv = inv;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Player(String name) {

        this.name = name;
        this.inv = new Inventory();
    }

    public int getrHealthy() {
        return rHealthy;
    }

    public void setrHealthy(int rHealthy) {
        this.rHealthy = rHealthy;
    }

}
