import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testingHeroObjectIsInstanceOfHeroClass_true() throws Exception {
        Hero testHero = new Hero("name",25,"laughing","concentration","avengers");
        assertEquals(true , testHero instanceof Hero);
    }

    @Test
    void testingHeroObjectReturnsNameCorrectly_String() {
        Hero testHero = new Hero("Spider Man", 23,"laughing","concentration","avengers");
        Hero testHero2 = new Hero("Spider Man", 23, "laughing","concentration","avengers");
        assertEquals(testHero.getName(), testHero2.getName());
    }
}