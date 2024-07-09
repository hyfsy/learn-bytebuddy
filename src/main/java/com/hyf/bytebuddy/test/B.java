package com.hyf.bytebuddy.test;

import net.bytebuddy.agent.ByteBuddyAgent;

import java.lang.instrument.Instrumentation;

/**
 * @author baB_hyf
 * @date 2022/07/01
 */
public class B {

    public static void main(String[] args) {
        Instrumentation instrumentation = ByteBuddyAgent.install();
        System.out.println(instrumentation);
        instrumentation = ByteBuddyAgent.install();
        System.out.println(instrumentation);

    }
}
