public class Hero {
    public String name;
    public int age;
    public Squad squad;


    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Hero(Squad squad) {
        this.squad = squad;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Squad getSquad() {
        return squad;
    }
}
