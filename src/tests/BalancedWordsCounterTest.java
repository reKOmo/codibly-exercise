package tests;

import exercises.BalancedWordsCounter;
import exercises.BubbleSort;

import java.util.ArrayList;
import java.util.List;

public class BalancedWordsCounterTest {
    public static void main(String[] args) throws Exception {
        try {
            test1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            test2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            test3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            test4();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test1() throws Exception {
        String input = "aabbabcccba";
        int result = BalancedWordsCounter.count(input);
        System.out.println(result);
    }

    public static void test2() throws Exception {
        String input = "";
        int result = BalancedWordsCounter.count(input);
        System.out.println(result);
    }

    public static void test3() throws Exception {
        String input = "abababa1";
        int result = BalancedWordsCounter.count(input);
        System.out.println(result);
    }

    public static void test4() throws Exception {
        String input = null;
        int result = BalancedWordsCounter.count(input);
        System.out.println(result);
    }
}
