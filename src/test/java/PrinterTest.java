import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50, 1000);
    }

    @Test
    public void canPrintAndUsePaper() {
        printer.printOut(5, 5);
        assertEquals(25, printer.getPaper());
    }

    @Test
    public void canPrintAndUseToner() {
        printer.printOut(5, 5);
        assertEquals(975, printer.getToner());
    }


    @Test
    public void cannotPrintNotEnoughPaper() {
        printer.printOut(100, 5);
        assertEquals(50, printer.getPaper());
    }

    @Test
    public void cannotPrintNotEnoughToner() {
        Printer printerNoInk = new Printer(1000, 50);
        printerNoInk.printOut(100, 5);
        assertEquals(1000, printerNoInk.getPaper());
    }



}
