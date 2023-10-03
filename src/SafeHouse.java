public class SafeHouse extends NormalLoc{
    SafeHouse(Player player) {
        super(player, "Güvenli evdesiniz!");
    }
    public boolean getLocation(){
        //canını fullüyoruz
        player.setHealthy(player.getrHealthy());
        System.out.println("Canınız fullendi!");
        System.out.println("Şuan güvenli evdesiniz. ");
        return  true;
    }
}
