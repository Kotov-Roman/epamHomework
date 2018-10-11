package homework3.task4;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayOddOrEvenElementsTest {
    public static ArrayOddOrEvenElements arrayOddOrEvenElements = new ArrayOddOrEvenElements();

    @Test
    public void printEvenElementsStringsTest1() {
        String [][]arr = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}};
        arrayOddOrEvenElements.setArr(arr);
       assertEquals("000210122022", arrayOddOrEvenElements.printEvenElementsStrings());
    }

    @Test
    public void printOddElementsColumnTest1() {
        String [][]arr = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}};
        arrayOddOrEvenElements.setArr(arr);
        assertEquals("101112", arrayOddOrEvenElements.printOddElementsColumn());
    }

    @Test(expected = IllegalArgumentException.class)
    public void printOddElementsColumnTest2() {
        String [][]arr = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21"}};
        arrayOddOrEvenElements.setArr(arr);
        assertEquals("101112", arrayOddOrEvenElements.printOddElementsColumn());
    }
}