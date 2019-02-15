package loops;

public class LoopsPractice {

    public static void main(String[] args) {

        String str = "We have a large inventory of things in our warehouse falling in "
                + "the category:apparel and the slightly "
                + "more in demand category:makeup along with the category:furniture and ... .";

        String str2 = "abcdefgh";

        printCategories2(str);

        System.out.println();

        printInReverse(str2);

        System.out.println();

        printEven(0, 20);

        System.out.println();

        System.out.println(reverseRec(str2));
    }

    // extract all categories from the string argument
    public static void printCategories(String str) {
        int index = 0;

        while (true) {

            int step = 9;
            String category = "";

            index = str.indexOf("category", index);

            if (index >= 0) {
                for (int i = index + step; ; i++) {
                    if (str.charAt(i) != ' ' & i < str.length()) {
                        category += str.charAt(i);
                    } else {
                        index = i;
                        break;
                    }
                }
            } else {
                break;
            }

            System.out.println(category);
        }
    }

    public static void printCategories2(String str) {
        String[] strs = str.split( " ");

        for (String s : strs) {
            if (s.startsWith("category")) {
                System.out.println(s.substring(9));
            }
        }
    }

    public static void printInReverse(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(str.length() - i - 1));
        }
        System.out.println();
    }

    public static String reverseRec(String str) {
        if (str.length() <= 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseRec(str.substring(0, str.length() - 1));
        }
    }

    public static void printEven(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
