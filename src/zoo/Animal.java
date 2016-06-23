package zoo;

/**
 * Created by slavkurochkin on 6/23/16.
 */
public class Animal {

    int weight;
    String gender;

    public Animal(int weight, String gender, String type) {
        this.weight = weight;
        this.gender = gender;
        this.type = type;
    }

    String type;

    public void speak(){
        System.out.println("I'm " + type);
        System.out.println("And I'm " + gender);
        System.out.println("My weight " + weight);
    }


}
