package com.ant;

import java.io.Serializable;

/**
 * @author gaoxx gaoxx@fxiaoke.com
 * @ClassName: MyClass
 * @Description: MyClass
 * @datetime 2019/4/1 8:17
 * @Version 1.0
 */
public class MyClass extends Thread implements Serializable {
    private static Integer i = 1;
    private static String str = "str";

    public void getFoo(){
        System.out.println("foo");
    }

    public String getBar(){
        return "bar";
    }

}
