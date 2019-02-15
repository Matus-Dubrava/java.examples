package java_basics;

public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = true;

        if (!hungry) {
            System.out.println("Im starving");
        } else {
            System.out.println("I am not hungry");
        }

        int month = 3;
        String monthString = null;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "too late";
                break;
        }

        System.out.println(monthString);

    }

}
