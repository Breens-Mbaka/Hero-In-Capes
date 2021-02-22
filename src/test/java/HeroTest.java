import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testingHeroObjectIsInstanceOfHeroClass_true() throws Exception {
        Hero testHero = new Hero("name",25,"laughing","concentration");
        assertEquals(true , testHero instanceof Hero);
    }

    @Test
    void testingHeroObjectReturnsNameCorrectly_String() {
        Hero testHero = new Hero("Spider Man", 23,"laughing","concentration");
        Hero testHero2 = new Hero("Spider Man", 23, "laughing","concentration");
        assertEquals(testHero.name, testHero2.name);
    }
}