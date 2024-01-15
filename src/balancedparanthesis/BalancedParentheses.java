package balancedparanthesis;

import java.util.Stack;

public class BalancedParentheses {

    public static boolean balancedParentheses(String exp){
        Stack<Character> stack = new Stack<>();
        int n = exp.length();
        for (int i = 0; i < n; i++) {
            char a = exp.charAt(i);
            if (a == '(') {
                stack.push(a);
            }
            if (a == ')') {
                char b = stack.pop();
                if (b != '(') {
                    return false;
                }
            }
        }
        return true;
    }
}
