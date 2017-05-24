package com.cesi;

/**
 * Created by kriyss on 10/05/17.
 */
public class Modulo3 implements Regle {
    @Override
    public String convert(int param) {
        return param%3==0 ? "Fizz" : String.valueOf(param);
    }
}
