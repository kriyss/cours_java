package com.cesi.example;

public class FizzBuzz {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static void main(String[] args) {
	// write your code here
    }

    public String execute(int i) {
        String res = "";
        if (isMultipleOf(i, 3)){
            res += FIZZ;
        }
        if (isMultipleOf(i, 5)) {
            res += BUZZ;
        }
        return (i==0 || res.equals("")) ? String.valueOf(i) : res;
    }

    private boolean isMultipleOf(int i, int modulo) {
        return i% modulo == 0;
    }

}