package homework3.task2;

import homework3.task1.FourCorners;

public class Main {
    public static void main(String[] args) {
        String[][] arr = {{"1", "2"},{}};
        SequencePrinter printer = new SequencePrinter();
        printer.setArr(arr);
        System.out.println(printer.PrintSequence(0, 0, 1));

    }
}
