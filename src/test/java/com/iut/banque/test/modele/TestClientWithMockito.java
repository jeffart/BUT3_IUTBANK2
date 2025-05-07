package com.iut.banque.test.modele;

import com.iut.banque.modele.Client;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TestClientWithMockito {

    @Test
    public void testClientWithMock() {
        // Test basique :
        Client client = Mockito.mock(Client.class);
        Mockito.when(client.possedeComptesADecouvert()).thenReturn(true);
        assertTrue(client.possedeComptesADecouvert());
    }

}
