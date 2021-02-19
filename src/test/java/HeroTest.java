import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeroTest {
    @Test
    void testingHeroObjectIsInstanceOfHeroClass_true() throws Exception {
        Hero testHero = new Hero("name",25);
        assertEquals(true , testHero instanceof Hero);
    }

    @Test
    void testingHeroObjectReturnsNameCorrectly_String() {
        Hero testHero = new Hero("Spider Man", 23);
        Hero testHero2 = new Hero("Spider Man", 23);
        assertEquals(testHero.name, testHero2.name);
    }

    @Test
    void testingHeroObjectGetsSquadName() {
        Squad testSquad = new Squad("Avengers","Fight for justice");
        Hero testHero = new Hero(testSquad);
        assertEquals(testSquad, testHero.getSquad());
    }
}