import java.util.Arrays; // Import Arrays class if needed for any utility methods

/***
 * MyStackArray - array implementation of the MyStack interface
 */
public class MyStackArray1 implements MyStack {
    // Define the data container
    // Encapsulate this property
    private Object[] items; // Array object variable
    private int top;

    // Constructor to instantiate the data container
    public MyStackArray1(int size) {
        this.items = new Object[size];
        this.top = 0; // Initialize top to 0
    }

    // Default constructor
    public MyStackArray1() {
        this(10); // The array of Object will be created with default size of 10 elements
    }

    // Constructor that accepts a pre-created array of String
    public MyStackArray1(String[] items) {
        // Instantiate the data container
        this(items.length);
        for (String item : items) { // Using enhanced for loop
            push(item);
        }
    }

    // Inherited methods
    // Sentinel methods
    @Override
    public boolean isFull() {
        return top == items.length;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    // Standard method names
    @Override
    public boolean push(Object item) {
        boolean ok = !isFull();
        if (ok) {
            items[top++] = item;
        }
        return ok;
    }

    @Override
    public Object pop() {
        Object item = peek();
        if (item != null) {
            items[--top] = null;
        }
        return item;
    }

    @Override
    public Object peek() {
        return (!isEmpty()) ? items[top - 1] : null;
    }

    // Override (re-code the inherited method) the toString()
    @Override
    public String toString() {
        // To display the content of the data container
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top - 1; i > -1; i--) {
            sb.append(items[i]);
            if (i > 0) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString(); // Convert the content of StringBuilder into a String
    }

    // Main method for testing
    public static void main(String... args) {
        MyStack stack = new MyStackArray1(new String[]{"a", "b", "c", "d", "e", "f", "g"});
        System.out.println(stack);

        /* Uncomment for additional testing
        MyStack stack = new MyStackArray1();
        System.out.println(stack.push("A"));
        System.out.println(stack.push("B"));
        System.out.println(stack.push("C"));
        System.out.println(stack.push("D"));
        System.out.println(stack.push("E"));
        System.out.println(stack);
        System.out.println(stack.push("F"));
        System.out.println(stack.push("G"));
        System.out.println(stack.push("H"));
        System.out.println(stack.push("I"));
        System.out.println(stack.push("J"));
        System.out.println(stack);
        System.out.println(stack.push("K"));
        System.out.println(stack.push("L"));
        System.out.println(stack.push("M"));
        System.out.println(stack.push("N"));
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        */
    }
}
