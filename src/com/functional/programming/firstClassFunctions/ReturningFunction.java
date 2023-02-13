package com.functional.programming.firstClassFunctions;

import java.util.function.Function;

public class ReturningFunction {

    protected static class MyMath {

        // Repetition of the below code
        public static Integer timesTwo(Integer x) {
            return x * 2;
        }

        public static Integer timesThree(Integer x) {
            return x * 3;
        }

        public static Integer timesFour(Integer x) {
            return x * 4;
        }

        //The above code can be replaced with the first class function as below
        public static Function<Integer, Integer> createMultiplier (Integer y){
            return (Integer x) -> x * y;
        }

    }
    public static void main (String[] args) {

        //Returns a function, so createPrinter will have function and need to re-apply()
        NoArgFunction<NoArgFunction<String>> createPrinter = () -> () -> "Hello Functional";

        NoArgFunction<String> greeter = createPrinter.apply();
        System.out.println(greeter.apply());

        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timeThree = MyMath.createMultiplier(3);
        Function<Integer, Integer> timeFour = MyMath.createMultiplier(4);

        System.out.println(timesTwo.apply(10));
        System.out.println(timeThree.apply(10));
        System.out.println(timeFour.apply(5));
    }
}
