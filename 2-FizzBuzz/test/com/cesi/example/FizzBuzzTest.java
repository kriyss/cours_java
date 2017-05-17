package com.cesi.example;

import com.sun.deploy.util.StringUtils;
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

    @Test
    public void should_decorate_basic_input() {
        String result = fizzBuzz.execute(1, "/");
        Assert.assertThat(result, is("/1/"));
    }

    @Test
    public void should_decorate_basic_input_with_decorator() {
        String result = fizzBuzz.execute(1, new WithSlash());
        Assert.assertThat(result, is("/1/"));
    }

    @Test
    public void should_call_with_array() {
        String[] result = fizzBuzz.execute(new int[]{1,2,3,4,5,6});
        Assert.assertThat(result[0], is("1"));
        Assert.assertThat(result[1], is("2"));
        Assert.assertThat(result[2], is("Fizz"));
        Assert.assertThat(result[3], is("4"));
        Assert.assertThat(result[4], is("Buzz"));
        Assert.assertThat(result[5], is("Fizz"));
    }

    public class WithSlash implements Decorator {

        @Override
        public String apply(String value) {
            return "/" + value + "/";
        }
    }

    public class UpperCase implements Decorator {

        @Override
        public String apply(String value) {
            return value.toUpperCase();
        }
    }

    @Test
    public void should_call_with_array_and_decorate() {
        String[] result = fizzBuzz.execute(new int[]{1,2}, "#");
        Assert.assertThat(result[0], is("#1#"));
        Assert.assertThat(result[1], is("#2#"));
    }

    private void assertThat(FizzBuzz fizzBuzz, int i, Matcher<String> fizz) {
        String result = fizzBuzz.execute(i);
        Assert.assertThat(result, fizz);
    }
}