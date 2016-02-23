import java.util.Arrays;
import java.util.List;

/**
 * Created by waryong on 2016. 2. 17..
 */
public class TestDataCreate {

    public List<Apple> createAppleList() {
        List<Apple> list = Arrays.asList(new Apple(80,"green"),
                                         new Apple(155,"green"),
                new Apple(125,"red")
        );

        return list;

    }


}
