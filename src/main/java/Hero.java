import java.util.ArrayList;

public class Hero {
    public String name;
    public int age;
    public String weakness;
    public String strength;


    public Hero(String name, int age, String weakness, String strength) {
        this.name = name;
        this.age = age;
        this.weakness = weakness;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getStrength() {
        return strength;
    }
}
