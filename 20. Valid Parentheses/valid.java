import java.util.Stack;

public class valid {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        stack.push('*');
        for (char c : s.toCharArray()) {
            if (stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        stack.pop();
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s= "()[]{}";
        System.out.println(isValid(s));
    }
}
