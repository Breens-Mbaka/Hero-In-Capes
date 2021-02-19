public class App {
    public static void main(String[] args) {
        //testing to see if user can make a hero
        Hero hero1 = new Hero("Spider man", 23);
        System.out.println(hero1.age);

        Squad heroes = new Squad("Avengers","Fighting for justice");
        System.out.println(heroes.squadName);
        System.out.println(heroes.cause);
    }
}
