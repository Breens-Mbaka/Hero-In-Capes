import java.awt.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class Hero {
    private String name;
    private int age;
    private String weakness;
    private String strength;
    private static ArrayList<Hero> mInstances = new ArrayList<>();


    public Hero(String name, int age, String weakness, String strength) {
        this.name = name;
        this.age = age;
        this.weakness = weakness;
        this.strength = strength;
        this.mInstances.add(this);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static ArrayList<Hero> getAll(){
        if(mInstances.size() > 5) {
            showMessageDialog(null, "You can only have 5 super heroes");
        }
        return mInstances;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getStrength() {
        return strength;
    }
}
