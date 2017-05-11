package com.cesi.example;

import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void should_assert_fizzbuzz_test_cases() {
        assertThat(fizzBuzz, 0, is("0"));
        assertThat(fizzBuzz, 2, is("2"));
        assertThat(fizzBuzz, 3, is("Fizz"));
        assertThat(fizzBuzz, 5, is("Buzz"));
        assertThat(fizzBuzz, 6, is("Fizz"));
        assertThat(fizzBuzz, 10, is("Buzz"));
        assertThat(fizzBuzz, 15, is("FizzBuzz"));
        assertThat(fizzBuzz, 30, is("FizzBuzz"));
    }

    private void assertThat(FizzBuzz fizzBuzz, int i, Matcher<String> fizz) {
        String result = fizzBuzz.execute(i);
        Assert.assertThat(result, fizz);
    }

}