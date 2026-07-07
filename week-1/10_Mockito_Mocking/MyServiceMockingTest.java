import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceMockingTest {

    @Test
    public void testExternalApi() {
        // Create a mock object for the external API
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Stub the method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Use the mock inside the service
        MyService service = new MyService(mockApi);
        String result = service.fetchData();

        // Verify the result matches the stubbed value
        assertEquals("Mock Data", result);
    }
}
