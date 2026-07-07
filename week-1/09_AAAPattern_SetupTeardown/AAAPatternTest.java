import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class AAAPatternTest {

    private List<String> items;

    // Runs before every test method (Setup)
    @Before
    public void setUp() {
        items = new ArrayList<>();
        items.add("Item1");
        System.out.println("Setup: list initialized.");
    }

    // Runs after every test method (Teardown)
    @After
    public void tearDown() {
        items = null;
        System.out.println("Teardown: list cleared.");
    }

    @Test
    public void testAddItem() {
        // Arrange
        String newItem = "Item2";

        // Act
        items.add(newItem);

        // Assert
        assertEquals(2, items.size());
        assertEquals("Item2", items.get(1));
    }

    @Test
    public void testRemoveItem() {
        // Arrange
        String itemToRemove = "Item1";

        // Act
        items.remove(itemToRemove);

        // Assert
        assertEquals(0, items.size());
    }
}
