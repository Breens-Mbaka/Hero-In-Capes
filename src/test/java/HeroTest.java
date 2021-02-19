import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testingHeroObjectIsInstanceOfHeroClass_true() throws Exception {
        Hero testHero = new Hero("name",25);
        assertEquals(true , testHero instanceof Hero);
    }
}