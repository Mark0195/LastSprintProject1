package DataRestTest;

import AnimalDatabase.DataRest.mock_data;
import AnimalDatabase.DataRest.searchtable;
import AnimalDatabase.DataRest.passwordtable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DatabaseTest {
    @Test
    void testAnimals() {
        mock_data actualAnimals = new mock_data();
        actualAnimals.setAnimals("Tockus erythrorhyncus");
        actualAnimals.setCommon_name("Red-billed hornbill");
        actualAnimals.setId(1);
        assertEquals("Tockus erythrorhyncus", actualAnimals.getAnimals());
        assertEquals("Red-billed hornbill", actualAnimals.getCommon_name());
        assertEquals(1, actualAnimals.getId());
    }

    @Test
    void testAnimalsNotEqual() {
        mock_data actualAnimals = new mock_data();
        actualAnimals.setAnimals("Tockus erythrorhyncus");
        actualAnimals.setCommon_name("Red-billed hornbill");
        actualAnimals.setId(1);
        assertNotEquals("Dusicyon thous", actualAnimals.getAnimals());
        assertNotEquals("Common zorro", actualAnimals.getCommon_name());
        assertNotEquals(6, actualAnimals.getId());
    }

    @Test
    void testSearchConstructor() {
        searchtable actualSearchtable = new searchtable();
        actualSearchtable.setEmail("jane.doe@example.org");
        actualSearchtable.setId(123L);
        actualSearchtable.setSearched("Searched");
        assertEquals("jane.doe@example.org", actualSearchtable.getEmail());
        assertEquals(123L, actualSearchtable.getId());
        assertEquals("Searched", actualSearchtable.getSearched());
    }

        @Test
        void testPassConstructor() {
            passwordtable actualPasswordtable = new passwordtable();
            actualPasswordtable.setEmail("jane.doe@example.org");
            actualPasswordtable.setId(123L);
            actualPasswordtable.setPassword("iloveyou");
            assertEquals("jane.doe@example.org", actualPasswordtable.getEmail());
            assertEquals(123L, actualPasswordtable.getId());
            assertEquals("iloveyou", actualPasswordtable.getPassword());

    }
}