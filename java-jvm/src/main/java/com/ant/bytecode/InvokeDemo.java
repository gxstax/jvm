package com.ant.bytecode;


/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/14 1:57 上午
 **/
public class InvokeDemo extends Abs implements I {

    static void staticMethod() {}

    private void privateMethod() {}

    public void publicMethod() {}

    @Override
    void abs() {
    }

    @Override
    public void inf() {
    }

    public static void main(String[] args) throws InterruptedException {
        InvokeDemo demo = new InvokeDemo();

        InvokeDemo.staticMethod();
        demo.abs();
        ((Abs) demo).abs();

        demo.inf();
        ((I) demo).inf();

        demo.privateMethod();
        demo.publicMethod();

        demo.infMethod();
        ((I) demo).infMethod();

        Thread.sleep(Integer.MAX_VALUE);
    }
}
