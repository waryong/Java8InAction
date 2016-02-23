/**
 * Created by waryong on 15. 10. 4..
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }



    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
