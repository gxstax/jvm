package com.ant;


/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/13 11:01 下午
 **/
public class B {
    private int a = 1234;

    static long C = 1111;

    public long test(long num) {
        long ret = this.a + num + C;
        return ret;
    }
}
