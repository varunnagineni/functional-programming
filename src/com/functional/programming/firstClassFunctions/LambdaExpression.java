package com.functional.programming.firstClassFunctions;

import java.util.function.Function;

public class LambdaExpression {

    public static void main(String[] args) {

        Function<Integer, Integer> absoluteValue =
                (x) -> x > 0 ?  x : -x;

        System.out.println(absoluteValue.apply(10));
    }
}
