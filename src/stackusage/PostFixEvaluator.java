package stackusage;

import java.util.Stack;

public class PostFixEvaluator {
    static boolean isOperator(char ch) {
        return (ch == '+' || ch == '-' || ch == '*' || ch == '/');
    }

    public static void evaluatePostfix(String exp) {
        Stack<Integer> postFix = new Stack<>();
        int n = exp.length();

        for (int i = 0; i < n; i++) {
            if (isOperator(exp.charAt(i))) {

                int op1 = postFix.pop();
                int op2 = postFix.pop();

                switch (exp.charAt(i)) {
                    case '+' -> postFix.push(op2 + op1);
                    case '-' -> postFix.push(op2 - op1);
                    case '*' -> postFix.push(op2 * op1);
                    case '/' -> postFix.push(op2 / op1);
                }

            }
            else {
                int operand = exp.charAt(i) - '0';
                postFix.push(operand);
            }
        }

        System.out.println(postFix.pop());
    }

    public String convertPostfixToInfix(String postfixstring)
    {
        Stack<String> s = new Stack<>();
        for (int i = 0; i < postfixstring.length(); i++)
        {
            char ch = postfixstring.charAt(i);
            if (isOperator(ch))
            {
                String b = s.pop();
                String a = s.pop();
                s.push("(" + a + ch + b + ")");
            }
            else
                s.push("" + ch);
        }
        return s.pop();
    }
}