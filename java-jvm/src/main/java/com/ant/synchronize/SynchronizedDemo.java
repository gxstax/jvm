package com.ant.synchronize;


/**
 * <p>
 * TODO
 * </P>
 *
 * @author Ant
 * @since 2022/11/16 5:20 下午
 **/
public class SynchronizedDemo {

    final Object lock = new Object();

    synchronized void m1() {
        System.out.println("m1");
    }

    static synchronized void m2() {
        System.out.println("m2");
    }

    void doLock() {
        synchronized (lock) {
            System.out.println("lock");
        }
    }
}
