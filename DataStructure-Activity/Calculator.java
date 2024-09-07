/***
   Simple Calculator, using Java GUI (Graphical User Interface)
**/
import java.awt.*;      //positioning, set color, set size,frame, etc...
import java.awt.event.*; //capture the GUI, usually initiated by the human user
import javax.swing.*;   //look and feel of the GUI (Graphical User Interface)

public class Calculator{
   //define the primary container of the widget (window gadgets i.e. TextField,Label,Button,etc...)
   JFrame frame = new JFrame();
   //define a container for the JButtons
   JPanel buttonContainer = new JPanel(new GridLayout(4,4));
   //define the result display
   JTextField txtResult = new JTextField("0.");
   //define the buttons
   JButton btnZero = new JButton("0");
   JButton btnOne = new JButton("1");
   JButton btnTwo = new JButton("2");
   JButton btnThree = new  JButton("3");
   JButton btnFour = new JButton("4");
   JButton btnFive = new JButton("5");
   JButton btnSix = new JButton("6");
   JButton btnSeven = new JButton("7");
   JButton btnEight = new JButton("8");
   JButton btnNine = new JButton("9");
   JButton btnAC = new JButton("AC");
   JButton btnEquals = new JButton("=");
   JButton btnMultiply = new JButton("*");
   JButton btnDivide = new JButton("÷");
   JButton btnAddition = new JButton("+");
   JButton btnSubtraction = new JButton("-");
   
   public Calculator(){
      //set the result textfield
      txtResult.setFont(new Font("Arial",Font.PLAIN,30));
      txtResult.setMargin(new Insets(10, 10, 10, 10));
      txtResult.setHorizontalAlignment(JTextField.RIGHT);
      //set the font size and color of each button
      btnOne.setFont(new Font("Arial", Font.BOLD, 30));
      btnOne.setForeground(Color.BLUE);
      btnTwo.setFont(new Font("Arial", Font.BOLD, 30));
      btnTwo.setForeground(Color.BLUE);
      btnThree.setFont(new Font("Arial", Font.BOLD, 30));
      btnThree.setForeground(Color.BLUE);
      btnFour.setFont(new Font("Arial", Font.BOLD, 30));
      btnFour.setForeground(Color.BLUE);
      btnFive.setFont(new Font("Arial", Font.BOLD, 30));
      btnFive.setForeground(Color.BLUE);
      btnSix.setFont(new Font("Arial", Font.BOLD, 30));
      btnSix.setForeground(Color.BLUE);
      btnSeven.setFont(new Font("Arial", Font.BOLD, 30));
      btnSeven.setForeground(Color.BLUE);
      btnEight.setFont(new Font("Arial", Font.BOLD, 30));
      btnEight.setForeground(Color.BLUE);
      btnNine.setFont(new Font("Arial", Font.BOLD, 30));
      btnNine.setForeground(Color.BLUE);
      btnZero.setFont(new Font("Arial", Font.BOLD, 30));
      btnZero.setForeground(Color.BLUE);
      ///
      btnAC.setFont(new Font("Arial", Font.BOLD, 30));
      btnAC.setForeground(Color.RED);
      btnEquals.setFont(new Font("Arial", Font.BOLD, 30));
      btnAC.setForeground(Color.BLACK);
      btnMultiply.setFont(new Font("Arial", Font.BOLD, 30));
      btnMultiply.setForeground(Color.BLACK);
      btnDivide.setFont(new Font("Arial", Font.BOLD, 30));
      btnDivide.setForeground(Color.BLACK);
      btnAddition.setFont(new Font("Arial", Font.BOLD, 30));
      btnAddition.setForeground(Color.BLACK);
      btnSubtraction.setFont(new Font("Arial", Font.BOLD, 30));
      btnSubtraction.setForeground(Color.BLACK);
     
      //assemble the buttons in the buttonContainer panel
      buttonContainer.add(btnOne);  buttonContainer.add(btnTwo); buttonContainer.add(btnThree); buttonContainer.add(btnMultiply);
      buttonContainer.add(btnFour); buttonContainer.add(btnFive); buttonContainer.add(btnSix); buttonContainer.add(btnDivide);
      buttonContainer.add(btnSeven); buttonContainer.add(btnEight); buttonContainer.add(btnNine); buttonContainer.add(btnAddition);
      buttonContainer.add(btnAC); buttonContainer.add(btnZero); buttonContainer.add(btnEquals); buttonContainer.add(btnSubtraction);
     
      frame.setLayout(new BorderLayout()); //set the layout of this container
      //add components to the frame
      frame.add(txtResult,BorderLayout.NORTH);
      frame.add(buttonContainer,BorderLayout.CENTER);
      //
      frame.setResizable(false); //do not the frame to be resized
      frame.setSize(400,400); //set the container size (400(horizontal)pixel x 400(vertical) pixel)
      frame.setLocationRelativeTo(null); //positioning of the container in the screen
      frame.setTitle("DURANO, Dennis S. BSCPE-4"); //set the title of the frame
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //dispose the JFrame and terminate the program
      frame.setVisible(true);//display the container
   }
   static public void main(String ...args){
      new Calculator();
   }
}//end of class