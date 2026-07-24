package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class Exercise1MockingAndStubbingTest {

    @Test
    void testExternalApi() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method
        when(mockApi.getData()).thenReturn("Mock Data");

        // Pass the mock object to the service
        MyService service = new MyService(mockApi);

        // Call the method
        String result = service.fetchData();

        // Check the result
        assertEquals("Mock Data", result);
    }
}