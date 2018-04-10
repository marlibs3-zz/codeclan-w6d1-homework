import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before() {
        printer = new Printer(100);
    }

    @Test
    public void canItPrint(){
        assertEquals(90, printer.print(2, 5));
    }

}
