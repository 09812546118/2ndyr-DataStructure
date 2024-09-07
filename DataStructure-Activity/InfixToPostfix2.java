import java.util.Stack;
import java.util.StringTokenizer;

public class InfixToPostfix2 {
    private String infix;

    public InfixToPostfix2(String infix) {
        this.infix = infix;
    }

    private boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '/' || ch == '*';
    }

    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return -1;
        }
    }

    public String convert() {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(infix, "*/+-", true);

        while (st.hasMoreTokens()) {
            String token = st.nextToken().trim();
            if (token.isEmpty()) continue;

            char ch = token.charAt(0);

            if (Character.isDigit(ch)) {
                sb.append(token).append(" ");
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }

    public double compute() {
        String postfix = convert();
        Stack<Double> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(postfix);

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            if (isOperator(token.charAt(0))) {
                double b = stack.pop();
                double a = stack.pop();
                char op = token.charAt(0);

                switch (op) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            } else {
                stack.push(Double.parseDouble(token));
            }
        }

        return stack.pop();
    }

    public static void main(String... args) {
        String infix = "1 - 2 * 3 + 4 / 5";
        InfixToPostfix2 itf = new InfixToPostfix2(infix); // Fixed class name here
        String postfix = itf.convert();
        System.out.println("Postfix Expression: " + postfix);
        System.out.println("Computed Result: " + itf.compute());
    }
}
