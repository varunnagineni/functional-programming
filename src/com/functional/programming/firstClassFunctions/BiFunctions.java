package com.functional.programming.firstClassFunctions;

import java.util.function.BiFunction;
public class BiFunctions {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add =
                (x, y) -> x + y;
        System.out.println(add.apply(10, 30));

        TriFunction<Integer, Integer, Integer, Integer> triFunction =
                (x, y, z) -> x + y +z;
        System.out.println(triFunction.apply(10, 20, 30));

        NoArgFunction<String> noArgFunction = () -> "Hello";
        System.out.println(noArgFunction.apply());
    }
}
