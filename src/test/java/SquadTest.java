import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void newSquad_instantiatesCorrectly() {
        Hero testHero = new Hero("Spidey",21,"power","speed");
        Squad testSquad = new Squad(testHero);
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    void newSquad_savesHeroObjects_Hero() {
        Hero testHero = new Hero("Spidey",21,"power","speed");
        Squad testSquad = new Squad(testHero);
        assertEquals(testHero, testSquad.getHero());
    }
}