package homework2;

public class Zadanie {

    public static char getThirdChar(String string) {
        return string.charAt(2);
    }

    public static char getLastChar(String string) {
        return string.charAt(string.length() - 1);
    }

    public static char getTargetChar(String string, int target) {
        return string.charAt(target - 1);
    }

    public static int getSummOfEqualsChars(String string) {
        int count = 0;
        int summ = 0;
        string.toCharArray();
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                count++;
            } else if (string.charAt(i) != string.charAt(i + 1) && count > 0) {
                summ = summ + 1 + count;
                System.out.println();
                count = 0;
            }
        }
        return summ;
    }

    public static String swapSecondAndFifth(String string) {
        char[] chars = string.toCharArray();
        char temp = chars[1];
        chars[1] = chars[4];
        chars[4] = temp;
        String result = new String(chars);
        return result;
    }

}
