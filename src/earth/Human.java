package earth;

/**
 * Created by VKurochkin on 6/22/2016.
 */
public class Human {

    String name;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

    int age;
    int heightInInches;
    String eyeColor;




    public void speak(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " old");
        System.out.println("My eye color is " + eyeColor);

    }

    public void eat(){
        System.out.println("eating ...");
    }

    public void walk(){
        System.out.println("walking...");
    }
}
