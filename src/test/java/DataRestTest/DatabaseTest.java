package DataRestTest;

import AnimalDatabase.DataRest.mock_data;
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
    void testAnimalsNotEqual(){
        mock_data actualAnimals = new mock_data();
        actualAnimals.setAnimals("Tockus erythrorhyncus");
        actualAnimals.setCommon_name("Red-billed hornbill");
        actualAnimals.setId(1);
        assertNotEquals("Dusicyon thous", actualAnimals.getAnimals());
        assertNotEquals("Common zorro", actualAnimals.getCommon_name());
        assertNotEquals(6, actualAnimals.getId());
    }
}
//Test123