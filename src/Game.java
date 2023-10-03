import java.util.Scanner;

public class Game {
    Player player;
    Location location;
    Scanner scan = new Scanner(System.in);


    public void login(){
        System.out.println("Macere Oyununa Hoşgeldiniz");
        System.out.println("Oyuna başlamadan önce isminizi giriniz: ");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();
        player = new Player(playerName);
        player.selectCha();
        start();

    }

    public void start(){
      while (true){
          System.out.println();
          System.out.println("=============================================");
          System.out.println();
          System.out.println("Eylem gerçekleştirmek için bir yer seçniz: ");
          System.out.println("1- Güvenli Ev");
          System.out.println("2- Mağara");
          System.out.println("3- Orman");
          System.out.println("4- Nehir");
          System.out.println("5- Mağaza");
          int selLoc = scan.nextInt();

          while(selLoc < 0 || selLoc > 5){
              System.out.println("Geçerli bir değer giriniz: ");
              selLoc = scan.nextInt();
          }
          switch (selLoc){
              case 1:
                  location = new SafeHouse(player);
                  break;
              default:
                  location = new SafeHouse(player);
          }
         if(! location.getLocation()){
             System.out.println("Oyun Bitti!");
             break;
         }
      }
    }
}
