import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by waryong on 15. 10. 4..
 */
public class GenericMethod {
    public <T> void f(T x) {

        System.out.println(x.getClass().getName());
    }

    public <U> U getRe(U u) {

        return u;
    }

    public static void main(String[] args) {

        // 와일드카드 문자는 공변(covariance)를 허용한다.
        List<? extends Apple> fList = new ArrayList<AppleChild>();
//        fList.add((Apple)new AppleChild());

        List<Apple> listApple = new ArrayList<Apple>();
        listApple.add(new Apple());

        // 이건 통
        fList = listApple;

        List<AppleChild> listDish = new ArrayList<AppleChild>();
        listDish.add(new AppleChild());

        fList = listDish;







//        fList.add(new Apple());




    }
}
