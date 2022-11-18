package com.ant;


/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/13 11:02 下午
 **/
public class A {
    private B b = new B();

    public static void main(String[] args) {
        A a = new A();
        long num = 4321;

        long ret = a.b.test(num);

        System.out.println(ret);
    }
}
