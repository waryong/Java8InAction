/**
 * Created by waryong on 15. 10. 4..
 */
public class GenericContainer<T extends Apple> {
    private T a;

    public void setObject(T a) {
        this.a = a;
    }

    public T getA() {
        return a;
    }
}
