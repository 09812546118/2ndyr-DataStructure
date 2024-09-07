import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyCalc extends JFrame implements ActionListener {
    String[] btnLabels = new String[]{
        "1", "2", "3", "*",
        "4", "5", "6", "/",
        "7", "8", "9", "+",
        "AC", "0", "=", "-"
    };
    JButton[] button = new JButton[btnLabels.length];
    JTextField txtOutput = new JTextField("0");
    JPanel buttonPanel = new JPanel(new GridLayout(4, 4));
    StringBuilder sb = new StringBuilder();

    public MyCalc() {
        // Set the JFrame layout
        setLayout(new BorderLayout());
        // Assemble the button on the containing panel
        for (int i = 0; i < btnLabels.length; i++) {
            button[i] = new JButton(btnLabels[i]);
            if(btnLabels[i].equals("AC") || btnLabels[i].equals("=")){
               button[i].setForeground(Color.BLUE);
            }
            
            if(btnLabels[i].equals("+") || btnLabels[i].equals("*") || btnLabels[i].equals("/") || btnLabels[i].equals("-")){
               button[i].setForeground(Color.GREEN);
            }

            
            button[i].setFont(new Font("Verdana", Font.PLAIN, 20));
            button[i].addActionListener(this);
            buttonPanel.add(button[i]);
             
        }
        // Add the result textfield at BorderLayout.NORTH
        txtOutput.setFont(new Font("Verdana", Font.PLAIN, 22));
        txtOutput.setHorizontalAlignment(JTextField.RIGHT);
        txtOutput.setMargin(new Insets(10, 10, 10, 10));
        add(txtOutput, BorderLayout.NORTH);
        // Add the button panel at BorderLayout.CENTER
        add(buttonPanel, BorderLayout.CENTER);
        // Setup the main container
        setTitle("Calculator v1.0");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String label = e.getActionCommand();
        switch (label) {
            case "AC":
                sb = new StringBuilder();
                txtOutput.setText("0");
                break;
            case "=":
                try {
                    InfixToPostfix2 itf = new InfixToPostfix2(sb.toString());
                    String result = String.valueOf(itf.compute());
                    txtOutput.setText(result);
                } catch (Exception ex) {
                    txtOutput.setText("Error");
                }
                sb = new StringBuilder(); // Reset the input buffer
                break;
            default:
                if (sb.length() == 1 && sb.charAt(0) == '0' && !label.equals(".")) {
                    sb.setLength(0); // Remove leading zero
                }
                sb.append(label);
                txtOutput.setText(sb.toString());
                break;
        }
    }

    public static void main(String... args) {
        new MyCalc();
    }
}
