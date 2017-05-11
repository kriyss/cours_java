package com.cesi.example;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static void main(String[] args) {
	// write your code here
    }

    public String execute(int i) {
        return execute(i, "");
    }

    public String[] execute(int[] ints, String decorator) {
        String[] result = new String[ints.length];
        for (int i = 0; i < ints.length; i++) {
            result[i] = execute(ints[i], decorator);
        }
        return result;
    }

    public String[] execute(int[] ints) {
        return execute(ints, "");
    }

    public String execute(int value, String decorator) {
        String res = "";
        if (isMultipleOf(value, 3)){
            res += FIZZ;
        }
        if (isMultipleOf(value, 5)) {
            res += BUZZ;
        }
        if (value == 0 || res.equals("")) {
            return decorator + value + decorator;
        } else {
            return res;
        }

    }

    private boolean isMultipleOf(int i, int modulo) {
        return i% modulo == 0;
    }

}