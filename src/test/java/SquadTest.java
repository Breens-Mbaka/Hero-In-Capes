import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void testingHeroObjectIsInstanceOfHeroClass_true() {
        Squad testSquad = new Squad("name","laughing");
        assertEquals(true, testSquad instanceof Squad);
    }
}