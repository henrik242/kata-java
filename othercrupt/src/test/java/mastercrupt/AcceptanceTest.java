package mastercrupt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {
    @Test
    public void testLeeting() throws Exception {
        UI ui = new UI(new OtherLeeter());
        assertEquals("Leeted: 53cr3t", ui.leetMessage("s3cr3t"));
    }
}