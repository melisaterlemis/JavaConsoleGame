public abstract class ToolStore extends NormalLoc{
    ToolStore(Player player) {
        super(player,"Mağazadasınız");
    }

    public boolean getLocation(){
        System.out.println("Para: " + player.getMoney());
        System.out.println("1- Silahlar");
        System.out.println("2- Zırhlar");
        System.out.println("3- Çkış");
        System.out.print("Seçiminiz: ");
        int selTool = scan.nextInt();
        int selItemID;
        switch (selTool){
            case 1:
                selItemID = weaponMenu();
            buyweapon(selItemID);
            break;

        }

        return true;
    }
    public int weaponMenu(){
        System.out.println("1- Tabanca <Para: 25 - Hasar: 2>");
        System.out.println("2- Kılıç   <Para: 35 - Hasar: 3>");
        System.out.println("3- Tüfek   <Para: 45 - Hasar: 7>");
        System.out.println("4- Çıkış");
        System.out.println("Silah seçiniz: ");
        int selWeaponID =scan.nextInt();
        return selWeaponID;

    }
    public void buyweapon(int itemID){
        int damage = 0, price = 0;
        String wName=null;
        switch (itemID){
            case 1:
                damage = 2;
                wName = "Tabanca";
                price = 25;
                break;
            case 2:
                damage = 3;
                wName = "Kılıç";
                price = 35;
                break;
            case 3:
                damage = 7;
                wName = "Tüfek";
                price = 45;
                break;
            default:
                System.out.println("Geçersiz İşlem.");
                break;

        }
       player.getInv().setDamage(damage);
    }
}
