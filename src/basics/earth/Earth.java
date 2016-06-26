package basics.earth;

/**
 * Created by VKurochkin on 6/22/2016.
 */
public class Earth {

    public static void main(String args[]){
       Human human1 = new Human("Tom", 25, 76, "Blue");
       Human human2 = new Human("Jim", 99, 76, "Blue");
       Human human3 = new Human("Max", 25, 76, "Blue");

       human1.speak();
       human2.speak();
       human3.speak();
    }
}
