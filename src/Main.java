import com.workintech.model.Player;
import com.workintech.model.Point;
import com.workintech.model.Weapon;

public class Main {
    public static void main(String[] args) {

        Point first=new Point(6,5);
        Point second=new Point(3,1);
        System.out.println("Point Outputs");
        System.out.println("distance(0,0)="+first.distance());
        System.out.println("distance(second)="+first.distance(second));
        System.out.println("distance(2,2)="+first.distance(2,2));

        Point point=new Point(0,0);
        System.out.println("distance()="+point.distance());

        System.out.println("-------------------------------");
        System.out.println("Player Outputs");
        Player player1=new Player("John",-5, Weapon.CROSSBOW);
        System.out.println(player1);
        System.out.println(player1.healthRemaining());
        player1.restoreHealth(60);
        System.out.println(("after healthPoint:60 >>> "+player1.healthRemaining()));
        player1.loseHealth(70);
        System.out.println("after damage:70 >>> "+player1.healthRemaining());


        Player player2=new Player("Josh",90,Weapon.GUN);
        System.out.println(player2);
        player2.loseHealth(20);
        System.out.println("after damage:20 >>> "+player2.healthRemaining());
        player2.restoreHealth(60);
        System.out.println(("after healthPoint:60 >>> "+player2.healthRemaining()));


    }
}