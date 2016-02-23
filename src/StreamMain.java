import java.util.Comparator;
import java.util.List;
import static java.util.stream.Collectors.toList;
/**
 * Created by waryong on 15. 9. 30..
 */

public class StreamMain {

    public static void main(String[] args) throws Exception {
        List<Dish> menu = Dish.menu;

        List<String> threeHighClaoriDishNames =
                menu.stream()
                .filter(d -> d.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .collect(toList());

        System.out.println(threeHighClaoriDishNames);


    }
}
