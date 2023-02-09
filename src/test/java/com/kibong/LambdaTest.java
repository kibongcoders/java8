package com.kibong;

import java.util.function.Consumer;
import java.util.function.IntConsumer;
import org.junit.Test;

public class LambdaTest {

    @Test
    public void testLambda() {
        run();
    }

    private void run() {
        final int variableNumber = 10;

        //로컬 클래스
        class LocalClass {

            void printNumber() {
                int variableNumber = 12; //익명 클래스
                System.out.println(variableNumber);
            }
        }

        //익명 클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                int variableNumber = integer;
                System.out.println(variableNumber);
            }
        };

        //람다
        IntConsumer printInt = (i) -> {
            System.out.println(variableNumber + i);
        };

        LocalClass localClass = new LocalClass();
        localClass.printNumber();

        integerConsumer.accept(20);
    }
}
