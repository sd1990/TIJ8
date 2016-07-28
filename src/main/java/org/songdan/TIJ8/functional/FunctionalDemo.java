package org.songdan.TIJ8.functional;

/**
 * @author Songdan
 * @date 2016/6/21
 */
public class FunctionalDemo {



    public static void work(Functional functional) {
        functional.method();
    }

    public static void main(String[] args) {
        work(()->System.out.println("hello world"));
    }



}
