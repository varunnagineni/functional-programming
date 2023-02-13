package com.functional.programming.firstClassFunctions;

import java.util.function.BiFunction;

/**
 * Pass Functions as arguments to the other Functions
 */
public class PassingFunctionsAsArgs {

    protected static class MyMath {

        public static Integer add (Integer x, Integer y) {
            return x + y;
        }

        public static Integer subtract (Integer x, Integer y) {
            return x - y;
        }

        //Function to accept Function as argument (Lambda and BiFunction)
        public static Integer acceptFunction (BiFunction<Integer, Integer, Integer> functionArg) {

            return functionArg.apply(2, 3);
        }
    }
    public static void main(String[] args) {

        System.out.println(MyMath.acceptFunction(MyMath::add));
        System.out.println(MyMath.acceptFunction(MyMath::subtract));

        System.out.println(MyMath.acceptFunction((x,y) -> 2 * x + 2 * y));
    }
}
