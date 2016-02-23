/**
 * Created by waryong on 15. 10. 4..
 */
public class LinkedStack<T> {

    private static class Node<U> {
        U item;
        Node<U> next;

        public Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>(); // 스택끝 표시

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop()  {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

}
