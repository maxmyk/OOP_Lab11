package builder;

import junit.framework.TestCase;
import org.junit.Test;

public class ClientTest extends TestCase {
    @Test
    public void testClient(){
        Client client = Client.builder().email("dobosevyck@ucu.edu.ua").build();
        assertEquals(client.toString(), "Client(email=dobosevyck@ucu.edu.ua)");
    }
}