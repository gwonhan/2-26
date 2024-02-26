package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;

public class Application02 {
    public static void main(String[] args) {

        /*수업목표. LinkedHashedSet 에 대해 이해하고 사용할 수 있다. */

        LinkedHashSet<String> lset = new LinkedHashSet<>();

        lset.add("java ");
        lset.add("sadads");
        lset.add("asdasdf");
        lset.add("ffff");
        lset.add("fasfasf");

        System.out.println("lset = " + lset);

    }
}
