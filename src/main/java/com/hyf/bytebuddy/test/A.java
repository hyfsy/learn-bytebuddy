package com.hyf.bytebuddy.test;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.FixedValue;
import net.bytebuddy.matcher.ElementMatchers;

/**
 * @author baB_hyf
 * @date 2022/07/01
 */
public class A {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        DynamicType.Unloaded<Object> unloaded = new ByteBuddy()
                .subclass(Object.class)
                .method(ElementMatchers.named("toString"))
                .intercept(FixedValue.value("Hello World"))
                .make();
        Class<?> dynamicType = unloaded.load(A.class.getClassLoader()).getLoaded();
        System.out.println(dynamicType.newInstance().toString());

    }
}
