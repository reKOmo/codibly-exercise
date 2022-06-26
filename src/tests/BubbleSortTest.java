package tests;


import exercises.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {
    public static void main(String[] args) throws Exception {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    public static void test1() throws Exception {
        List<Comparable> input = List.of(1, 4, 5, 6, 8, 3, 8);
        List<Comparable> result = BubbleSort.sort(input);
        System.out.println(result);
    }

    public static void test2() throws Exception {
        List<Comparable> input = List.of(-9.3,0.2,4,0.1,5,9);
        List<Comparable> result = BubbleSort.sort(input);
        System.out.println(result);
    }

    public static void test3() throws Exception {
        List<Comparable> input = List.of();
        List<Comparable> result = BubbleSort.sort(input);
        System.out.println(result);
    }

    public static void test4() throws Exception {
        List<Comparable> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);
        List<Comparable> result = BubbleSort.sort(input);
        System.out.println(result);
    }

    public static void test5() throws Exception {
        List<Comparable> result = BubbleSort.sort(null);
        System.out.println(result);
    }

}
