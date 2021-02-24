import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

public class Hero {
    private String name;
    private int age;
    private String weakness;
    private String strength;
    private static ArrayList<Hero> mInstances = new ArrayList<>();
    private String squadName;


    public String getSquadName() {
        return squadName;
    }

    Hero(String name, int age, String weakness, String strength, String squadName) {
        this.name = name;
        this.age = age;
        this.weakness = weakness;
        this.strength = strength;
        this.mInstances.add(this);
        this.squadName = squadName;
    }

    public static ArrayList<Hero> getAllHeroes() {
        if(mInstances.size() > 5) {
            JOptionPane.showMessageDialog(null, "You can only have five superheroes");
            Hero lastItem = mInstances.get(mInstances.size() - 1);
            mInstances.remove(lastItem);
        }
        return mInstances;
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
