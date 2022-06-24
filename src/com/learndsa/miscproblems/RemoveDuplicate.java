package com.learndsa.miscproblems;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Stream.of(1, 3, 4, 4, 5, 5, 6, 7).distinct().forEach(val -> System.out.printf(val+" "));
        System.out.println();
        Stream.of(1, 3, 4, 4, 5, 5, 6, 7).collect(Collectors.toSet()).forEach(val -> System.out.printf(val+" "));
    }
}
