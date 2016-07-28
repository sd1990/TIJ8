package org.songdan.TIJ8.lambda;

import java.util.Arrays;
import java.util.function.Consumer;

/**
 * @author Songdan
 * @date 2016/6/21
 */
public class LambdaDemo {

    public static void main(String[] args) {
        Arrays.asList("a","b","c","d").forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        Arrays.asList("a","b","c","d").forEach(e -> System.out.println(e));
        String seperator = "<>";
        Arrays.asList("a","b","c","d").forEach(e -> System.out.println(e+seperator));
        Arrays.asList("a","b","c","d").sort((e1,e2)->
            e1.compareTo(e2)
        );
    }

    public void testForeach() {
        Arrays.asList("a","b","c","d").forEach(e -> System.out.println(e));
    }

}
