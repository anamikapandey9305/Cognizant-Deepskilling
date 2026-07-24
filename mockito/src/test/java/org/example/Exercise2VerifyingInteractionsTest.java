package org.example;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Exercise2VerifyingInteractionsTest {

    @Test
    void testVerifyInteraction() {

        // Step 1: Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Step 2: Create service using the mock
        MyService service = new MyService(mockApi);

        // Step 3: Call the service method
        service.fetchData();

        // Step 4: Verify the interaction
        verify(mockApi).getData();
    }
}