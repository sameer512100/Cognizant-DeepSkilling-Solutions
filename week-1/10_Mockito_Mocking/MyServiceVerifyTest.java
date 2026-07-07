import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceVerifyTest {

    @Test
    public void testVerifyInteraction() {
        // Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        MyService service = new MyService(mockApi);

        // Call the method
        service.fetchData();

        // Verify that getData() was called on the mock
        verify(mockApi).getData();
    }
}
