package com.kibong.FunctionalInterface;

import java.util.function.Function;

public class ReadFunction implements Function<String, String> {

    @Override
    public String apply(String book) {
        return "Read a " + book;
    }
}
