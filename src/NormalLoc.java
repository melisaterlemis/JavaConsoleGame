public abstract class NormalLoc extends Location {
    //savasılmyan bölge
    NormalLoc(Player player, String name) {
        super(player);
        //safehouse un adını aldık
        this.name = name;
    }
public boolean getLocation(){
        return  true;
}

}
