import com.sun.tools.classfile.StackMapTable_attribute;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) throws Exception {

        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"),new Apple(120, "red"));



        List<Apple> resultLlist = filterApples(inventory, (Apple apple2) -> "red".equals(apple2.getColor()));

        for (Apple reApple : resultLlist) {
            System.out.println(reApple.getColor());
        }
        Apple teAp = new Apple("busa", new Integer(150),"green");
        System.out.println(testLanda(teAp ,Apple::getName));

        Function<String,Integer> stringToInteger =
                (String s) -> Integer.parseInt(s);

    }

    public static void process(Runnable r) {
        r.run();
    }

    public static String processFile(BufferdReaderProcessor bufferdReaderProcessor) throws IOException {
        try (
            BufferedReader br = new BufferedReader(new FileReader("data.txt"))
            )
        {
                return br.readLine();
            }

    }


    /*
    color 를 받아서. 사과를 필터링

     */
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color) {

        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }

        return result;
    }

    /*
        무게로 사과를 필터링
     */
    public static List<Apple> filterApplesByWeight(List<Apple> inventory, int weight) {

        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory , ApplePredicate predicate) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterApples(List<Apple> inventory , Predicate predicate) {
        List<Apple> result = new ArrayList<Apple>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static String testLanda (Apple apple , Function<Apple,String> f) {

        return f.apply(apple);

    }



}
