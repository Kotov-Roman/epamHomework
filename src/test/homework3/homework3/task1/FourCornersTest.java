package homework3.task1;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class FourCornersTest {
    public static FourCorners fourCorners = new FourCorners();

    @Test
    public void printFourCornersTest1() {
        String[][] arr = {{"10", "20", "30"}, {"10", "20", "30"}, {"40", null}};
        fourCorners.setArr(arr);
        assertEquals("103040", fourCorners.printFourCorners());
    }
    @Test
    public void printFourCornersTest2() {
        String[][] arr = {{"10", "20", "30"}, {"10", "20", "30"}, {"40", "50"}};
        fourCorners.setArr(arr);
        assertEquals("10304050", fourCorners.printFourCorners());

    }
    @Test(expected = IllegalArgumentException.class)
    public void printFourCornersTest3() {
        String[][] arr = {{"10", "20", "30"}, {"10", "20", "30"}, {}};
        fourCorners.setArr(arr);
        assertEquals("10304050", fourCorners.printFourCorners());

    } @Test(expected = IllegalArgumentException.class)
    public void printFourCornersTest4() {
        String[][] arr = {};
        fourCorners.setArr(arr);
        assertEquals("10304050", fourCorners.printFourCorners());

    }


}