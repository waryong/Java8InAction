/**
 * Created by waryong on 15. 9. 30..
 */
public class AppleGreenColorPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
