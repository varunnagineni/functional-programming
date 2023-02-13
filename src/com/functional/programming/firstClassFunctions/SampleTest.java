package com.functional.programming.firstClassFunctions;

import static com.functional.programming.firstClassFunctions.SampleTest.method1;

public class SampleTest {

    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        method1(a);
        System.out.println(a);


    }

    public static int method1(int a) {
        a = 2;

        System.out.println(a);
        return a;
    }

}


