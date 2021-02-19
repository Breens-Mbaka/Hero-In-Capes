import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquadTest {
    @Test
    void testingSquadObjectIsInstanceOfSquadClass_true() {
        Squad testSquad = new Squad("Avengers","Fighting for justice");
        assertEquals(true, testSquad instanceof Squad);
    }

    @Test
    void testingSquadObjectReturnsSquadNameCorrectly_String() {
        Squad testSquad = new Squad("Avengers", "Fight for justice");
        Squad testSquad2 = new Squad("Avengers", "Fight for justice");
        assertEquals(testSquad.squadName, testSquad2.squadName);
    }

}