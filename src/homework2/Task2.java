package homework2;

public class Task2 {
    /* 9.13. Given a word. Display third symbol.
     * 9.14. Given a word. Display last symbol.
     * 9.15. Given a word. Display symbol at number k.
     * 9.64. Given a sentence. Determine how many identical symbols there are in it.
     * 9.100. Given a word. Swap it's second and fifth parts.
     */

    public static char getThirdChar(String string) {
        try {
            if (string.length() >= 3) {
                return string.charAt(2);
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

    public static char getLastChar(String string) {
        try {
            if (string.length() != 0) {
                return string.charAt(string.length() - 1);
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

    public static char getTargetChar(String string, int target) {
        try {
            if (string.length() >= target) {
                return string.charAt(target - 1);
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

    public static int getSummOfEqualsChars(String string) {
        try {
            if (string.length() != 0) {
                int count = 0;
                int sum = 0;
                for (int i = 0; i < string.length() - 1; i++) {
                    if (string.charAt(i) == string.charAt(i + 1)) {
                        count++;
                    } else if (string.charAt(i) != string.charAt(i + 1) && count > 0) {
                        sum = sum + 1 + count;
                        count = 0;
                    }
                }
                if (count != 0) {
                    sum = sum + 1 + count;
                }
                return sum;
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

    public static String swapSecondAndFifth(String string) {
        try {
            if (string.length() < 5) {
                char[] chars = string.toCharArray();
                char temp = chars[1];
                chars[1] = chars[4];
                chars[4] = temp;
                return String.copyValueOf(chars);
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

    public static String reverse(String string) {
        try {
            if (string.length() != 0) {
                char[] chars = string.toCharArray();
                char[] result = new char[chars.length];
                int resultIndex = 0;
                for (int i = chars.length - 1; i >= 0; i--) {
                    result[resultIndex] = chars[i];
                    resultIndex++;
                }
                return String.copyValueOf(result);
            } else {
                throw new IllegalArgumentException("Illegal argument");
            }
        } catch (NullPointerException e) {
            System.err.println("String is null");
        }
        throw new IllegalArgumentException("Illegal argument");
    }

}
