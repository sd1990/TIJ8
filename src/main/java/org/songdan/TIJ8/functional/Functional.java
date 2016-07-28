package org.songdan.TIJ8.functional;

/**
 * 自定义函数接口
 * @author Songdan
 * @date 2016/6/21
 */
@FunctionalInterface
public interface Functional {
    void method();

    default void destroyMethod(){};
    default void defaultMethod(){};
}
