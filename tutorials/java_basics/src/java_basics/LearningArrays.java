package java_basics;

public class LearningArrays {

    public static void main(String[] args) {

        int[] values = new int[10];

        for (int i = 0; i < 10; i++) {
            values[i] = i;
        }


        for (int i = 0; i < 10; i++) {
            System.out.println(values[i]);
        }

        String[] words = new String[] { "My", "Name", "is" };

        for (String word : words) {
            System.out.println(word);
        }

    }

}
