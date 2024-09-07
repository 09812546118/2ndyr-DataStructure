import java.util.Stack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ParenthesisChecker {
    public static void main(String... args) {
        // File name
        String filename = "yohoo.txt";

        // Create a stack to store open parentheses
        Stack<Character> stack = new Stack<>();

        try {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(new File(filename));
            System.out.println("Processing file: " + filename);

            // Process each line in the file
            while (scanner.hasNextLine()) {
                String yoho = scanner.nextLine();
                boolean isBalanced = true; // Assume balanced until proven otherwise

                // Process each character in the line
                for (int i = 0; i < yoho.length(); i++) {
                    char ch = yoho.charAt(i);

                    // If it's an opening parenthesis, push to the stack
                    if (ch == '<' || ch == '[' || ch == '{' || ch == '(') {
                        stack.push(ch);
                    } 
                    // If it's a closing parenthesis
                    else if (ch == '>' || ch == ']' || ch == '}' || ch == ')') {
                        if (stack.isEmpty()) {
                            isBalanced = false;
                            break;
                        }
                        char open = stack.pop();
                        // Check for matching pairs
                        if ((open == '(' && ch != ')') ||
                            (open == '[' && ch != ']') ||
                            (open == '{' && ch != '}') ||
                            (open == '<' && ch != '>')) {
                            isBalanced = false;
                            break;
                        }
                    }
                }

                // Check if stack is empty and isBalanced is true
                if (isBalanced && stack.isEmpty()) {
                    System.out.println(yoho + " = Balanced");
                } else {
                    System.out.println(yoho + " = Unbalanced");
                }
                // Clear the stack for the next line
                stack.clear();
            }

            // Close the scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found: " + filename);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
