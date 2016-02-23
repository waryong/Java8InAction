/**
 * Created by waryong on 15. 9. 30..
 * 무거운 사과만 선택하는 ApplePredicate
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {

    public boolean test(Apple apple) {
        return apple.getWeight() > 150;
    }
}
