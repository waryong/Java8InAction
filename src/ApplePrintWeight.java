/**
 * Created by waryong on 2016. 2. 17..
 */
public class ApplePrintWeight implements ApplePrintPredicate {
    @Override
    public String print(Apple apple) {
        return apple.getWeight().toString();
    }
}
