package practice_strings;

public class StringsPractice {
    public static void main(String[] args) {
        String str = "ABCDEFG";

        // ABC, BCD, CDE, DEF, EFG
        // ABCD, BCDE, CDEF, DEFG

        String[] substrings = getSubstrings(str, 4);

        printSubstrings(substrings);
    }

    public static String[] getSubstrings(String str, int size) {
        int numOfSubstrings = str.length() - size + 1;
        String[] substrings = new String[numOfSubstrings];

        for (int i = 0; i < numOfSubstrings; i++) {
            substrings[i] = str.substring(i, i + size);
        }

        return substrings;
    }

    public static void printSubstrings(String[] substrings) {
        for (int i = 0; i < substrings.length; i++) {
            if (i != substrings.length - 1) {
                System.out.print(substrings[i] + ", ");
            } else {
                System.out.println(substrings[i]);
                System.out.println();
            }
        }
    }
}
