package java_basics;

import someotherpackage.*;

public class LearningMethods {

    public static void main(String[] args) {
        MyUtils.printSomeJunk("this is some data");

        MyUtils.sum2Numbers(5, 10);

        int result = MyUtils.add10(99);
        System.out.println(result);

        ExampleClass.doSomething();

        MyUtils util = new MyUtils();
        System.out.println(util.add100(50));
    }
}
