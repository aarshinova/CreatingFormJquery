import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        LinkedList<Character> list1 = new LinkedList<>();
        list1.add('B');
        list1.add('A');
        list1.add('R');
        list1.add('A');
        list1.add('B');
        list1.add('A');
        list1.add('S');

        checkIfPalindrome(list1);
        LinkedList<Character> list2 = new LinkedList<>();
        list2.add('T');
        list2.add('A');
        list2.add('C');
        list2.add('O');
        list2.add('C');
        list2.add('A');
        list2.add('T');

        checkIfPalindrome(list2);
    }

    public static void checkIfPalindrome(LinkedList<Character> list){
        Stack<Character> stack = new Stack<>();

        for (int i =0; i<list.size(); i++){
            stack.push(list.get(i));
        }

        boolean isPalindrome = true;
        while(stack.size()!=0){
            Character ch1 = stack.pop();
            Character ch2 = list.pop();
            if (!ch1.equals(ch2)){
                System.out.println("Not a palindrome");
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("It is a palindrome");
    }
}
