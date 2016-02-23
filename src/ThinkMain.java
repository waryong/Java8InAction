import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by waryong on 15. 10. 4..
 */
public class ThinkMain {

    public static void main(String[] args) {

        List<Apple> appleList = new TestDataCreate().createAppleList();

        List<Apple> redApples = filter(
                appleList,
                (a) -> "red".equals(a.getColor())
        );

        // 정렬할 경우 (Comparator의 익명클래스를 통해서 해결 )
        appleList.sort(
                new Comparator<Apple>() {
                    @Override
                    public int compare(Apple apple1, Apple apple2) {

                        return apple1.getWeight().compareTo(apple2.getWeight());
                    }
                }
        );

        appleList.sort(
                (a1,a2) -> a1.getWeight().compareTo(a2.getWeight())
        );

        for (Apple apple : appleList) {
            System.out.println(apple.getWeight());
        }

        Function<String, Integer> stringTiInteger = (String s) -> Integer.parseInt(s);
        Function<String, Integer> stringTiInteger2 = Integer::parseInt;

        BiPredicate<List<String> , String> contains = (list, element) -> list.contains(element);
        BiPredicate<List<String> , String> contains2 = List::contains;

        Supplier<Apple> supplier = Apple::new;
        Apple apple = supplier.get();

    }

    // 첫번째 시도 : 녹색사과 필터링
    public static List<Apple> filterGreenApples(List<Apple> inventory) {

        List<Apple> appleList = new ArrayList<>();

        for (Apple apple : inventory) {
            if ("green".equals(apple.getColor())) {
                appleList.add(apple);
            }
        }

        return appleList;
    }

    // 두번째시도 색을 파라미터로 받는다
    public static List<Apple> filterApplesColor(List<Apple> inventory , String color) {

        List<Apple> appleList = new ArrayList<>();

        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                appleList.add(apple);
            }
        }

        return appleList;
    }

    // 네번째 시도 추상적 조건으로 필터링
    public static List<Apple> filterApples(List<Apple> inventory , ApplePredicate applePredicate) {

        List<Apple> appleList = new ArrayList<>();

        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                appleList.add(apple);
            }
        }

        return appleList;
    }

    public static void prettyPrintApple(List<Apple> apples , ApplePrintPredicate printPredicate) {
        String printString = "";
        for (Apple apple : apples) {
            printString = printPredicate.print(apple);
            System.out.println(printString);
        }
    }

    // 일곱번째 리스트형식으로 일반
    public static <T> List<T> filter(List<T> list , Predicate<T> predicate) {
        List<T> resultList = new ArrayList<>();

        for (T e : list) {
            if (predicate.test(e)) {
                resultList.add(e);
            }
        }

        return resultList;
    }
}
