package com.kibong;

import com.kibong.FunctionalInterface.DoFunction;
import com.kibong.FunctionalInterface.ReadFunction;
import java.util.function.Function;
import org.junit.Test;

public class FunctionalInterfaceTest {

    @Test
    public void doFunctional(){

        DoFunction doFunction = number -> number;

        System.out.println("doFunction return " + doFunction.doFunction(10));
    }

    @Test
    public void functionTest(){
        ReadFunction readFunction = new ReadFunction();
        Function<String, String> lamdaFunction = (s) -> "Read a " + s;
        Function<String, String> endFunction = (e) -> e + " end";
        Function<String, String> startFunction = (b) -> "People " + b;

        System.out.println(readFunction.apply("Narnia"));

        //람다식으로 표현
        System.out.println(lamdaFunction.apply("나니아 연대기"));

        //compose
        Function<String, String> composeFunction = startFunction.compose(lamdaFunction);
        System.out.println(composeFunction.apply("나니아 연대기"));

        //andThen
        Function<String, String> andThenFunction = lamdaFunction.andThen(endFunction);
        System.out.println(andThenFunction.apply("나니아 연대기"));
    }
}
