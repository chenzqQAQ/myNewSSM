/**
 * Copyright (C),2015-2018
 * FileNmae: testLambda
 * Author:   Administrator
 * Date:     2018/10/24 19:24
 * History:
 * <author> <Time> <version> <desc>
 * 陈泽群  时间    版本号  描述
 */
package test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * testLambda
 * TODO(描述类的作用)
 *
 * @author 陈泽群
 * @date 2018/10/24 19:24
 */
public class testLambda {
    public static void main(String[] args) {
       /* Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .forEach(e -> System.out.println("Mapped value: " + e));*/
        // Integer[] a = {1, 2, 3, 5, 6, 7, 8, 3};
        /*List<Integer> list = Arrays.asList(a);
        list.stream().filter(x -> x < 5)
                .peek(System.out::println).toArray();*/
        // String ss = null;
        // print(ss);
        // System.out.println(length(ss));
        // System.out.println(Stream.of(a).reduce(Integer::sum).get());
     /*   Stream<List<Integer>> inputStream = Stream.of(
                Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.
                flatMap((childList) -> childList.stream());
        outputStream.forEach(System.out::println);*/
      /*  List<Integer> nums = Arrays.asList(1, 1, null, 2, 3, 4, null, 5, 5, 7, 9, 9, 10);
        Integer i = nums.stream().filter(x -> x != null).distinct().peek(System.out::println).reduce(Integer::sum).get();
        System.out.println("sum:" + i);*/
        List<Integer> nums = Arrays.asList(1, 1, null, 2, 3, 4, null, 5, 6, 7, 8, 9, 10);
        System.out.println("sum is:" + nums.stream().filter(num -> num != null)
                .distinct().mapToInt(num -> num * 2).peek(System.out::println).skip(2).limit(4).sum());


    }

    public static void print(String text) {
        Optional.ofNullable(text).ifPresent(System.out::println);
    }

    public static int length(String text) {
        return Optional.ofNullable(text).map(String::length).orElse(-1);
    }
}
