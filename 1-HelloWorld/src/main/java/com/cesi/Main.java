package com.cesi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        FizzBuzz fizzbuzz = new FizzBuzz(
                Arrays.asList(1, 2 , 3, 4 ,5 ,6),
                "#");

        fizzbuzz.register(new Modulo3());

        fizzbuzz
                .register(param -> param%3 == 0 ?
                        "Fizz" : String.valueOf(param));

        fizzbuzz
                .register(param -> param%5 == 0 ?
                        "Buzz" : String.valueOf(param));




        System.out.println(getHelloWorld());
    }

    public static String getHelloWorld() {
        return "Hello World";
    }
}
