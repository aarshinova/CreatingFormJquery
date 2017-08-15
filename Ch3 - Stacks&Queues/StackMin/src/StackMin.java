import java.util.Stack;

public class StackMin extends Stack<Integer> {

    Stack<Integer> minStack = new Stack<>();

    public Integer push(Integer item) {
        super.push(item);
        if (minStack.size() != 0) {
            Integer min = minStack.peek();
            if (min > item) {
                minStack.push(item);
            }
        }else{
            minStack.push(item);
        }

        return item;
    }

    public synchronized Integer pop() {
        Integer obj = super.pop();
        if (minStack.size() != 0) {
            Integer min = minStack.peek();
            if (obj == min)
                minStack.pop();
        }
        return obj;
    }

    public Integer getMin(){
        return minStack.peek();
    }


}
