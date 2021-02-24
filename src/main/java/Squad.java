import java.util.ArrayList;

public class Squad {
private Hero mHero;

public Squad(Hero hero) {
    mHero = hero;
}

    public Hero getHero() {
        return mHero;
    }

    public ArrayList<Hero> getAllOurHeroes() {
        return  mHero.getAllHeroes();
    }
}
