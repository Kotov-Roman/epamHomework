package homework3.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayOddOrEvenElements arrayOddOrEvenElements = new ArrayOddOrEvenElements();
        String [][]arr = {
                {"00", "01", "02"},
                {"10", "11", "12"},
                {"20", "21", "22"}};
        arrayOddOrEvenElements.setArr(arr);
        System.out.println(arrayOddOrEvenElements.printEvenElementsStrings());
        System.out.println(arrayOddOrEvenElements.printOddElementsColumn());
    }
}
