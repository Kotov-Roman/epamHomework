package homework3.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SequencePrinterTest {
    public static SequencePrinter sequencePrinter = new SequencePrinter();

    @Test
    public void printSequenceTest1() {
        String[][] arr = {{"10", "20", "30"}, {"10", "20", "30"}, {"40", "50"}};
        sequencePrinter.setArr(arr);
        assertEquals("102030", sequencePrinter.PrintSequence(1, 0, 2));
    }
    @Test
    public void printSequenceTest2() {
        String[][] arr = {{"10", "20", "30"}, {"10", "20", "30"}, {"40", "50"}};
        sequencePrinter.setArr(arr);
        assertEquals("10", sequencePrinter.PrintSequence(0, 0, 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void printSequenceTest3() {
        String[][] arr = {{}, {"10", "20", "30"}, {"40", "50"}};
        sequencePrinter.setArr(arr);
        assertEquals("10", sequencePrinter.PrintSequence(0, 0, 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void printSequenceTest4() {
        String[][] arr = {};
        sequencePrinter.setArr(arr);
        assertEquals("10", sequencePrinter.PrintSequence(0, 0, 0));
    }
}