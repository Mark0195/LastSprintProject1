package DataRestTest;

import AnimalDatabase.DataRest.Mock_data;
import AnimalDatabase.DataRest.Searchtable;
import AnimalDatabase.DataRest.Passwordtable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DatabaseTest {
    @Test
    void testAnimals() {
        Mock_data actualAnimals = new Mock_data();
        actualAnimals.setAnimals("Tockus erythrorhyncus");
        actualAnimals.setCommonName("Red-billed hornbill");
        actualAnimals.setId(1);
        assertEquals("Tockus erythrorhyncus", actualAnimals.getAnimals());
        assertEquals("Red-billed hornbill", actualAnimals.getCommonName());
        assertEquals(1, actualAnimals.getId());
    }

    @Test
    void testAnimalsNotEqual() {
        Mock_data actualAnimals = new Mock_data();
        actualAnimals.setAnimals("Tockus erythrorhyncus");
        actualAnimals.setCommonName("Red-billed hornbill");
        actualAnimals.setId(1);
        assertNotEquals("Dusicyon thous", actualAnimals.getAnimals());
        assertNotEquals("Common zorro", actualAnimals.getCommonName());
        assertNotEquals(6, actualAnimals.getId());
    }

    @Test
    void testSearchConstructor() {
        Searchtable actualSearchtable = new Searchtable();
        actualSearchtable.setEmail("jane.doe@example.org");
        actualSearchtable.setId(123L);
        actualSearchtable.setSearched("Searched");
        assertEquals("jane.doe@example.org", actualSearchtable.getEmail());
        assertEquals(123L, actualSearchtable.getId());
        assertEquals("Searched", actualSearchtable.getSearched());
    }

    @Test
    void testPassConstructor() {
        Passwordtable actualPasswordtable = new Passwordtable();
        actualPasswordtable.setEmail("jane.doe@example.org");
        actualPasswordtable.setId(123L);
        actualPasswordtable.setPassword("iloveyou");
        assertEquals("jane.doe@example.org", actualPasswordtable.getEmail());
        assertEquals(123L, actualPasswordtable.getId());
        assertEquals("iloveyou", actualPasswordtable.getPassword());

    }
}