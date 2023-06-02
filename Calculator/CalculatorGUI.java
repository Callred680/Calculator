import javax.swing.*;
import java.awt.*;

public class CalculatorGUI {
    JFrame Screen;

    JLabel DisplayField = new JLabel();
    JTextField InputField = new JTextField();
    JButton Zero = new JButton("0");
    JButton One = new JButton("1");
    JButton Two = new JButton("2");
    JButton Three = new JButton("3");    
    JButton Four = new JButton("4");
    JButton Five = new JButton("5");
    JButton Six = new JButton("6");
    JButton Seven = new JButton("7");
    JButton Eight = new JButton("8");
    JButton Nine = new JButton("9");
    JButton Decimal = new JButton(".");
    JButton ClearEntry = new JButton("CE");
    JButton Delete = new JButton("DEL");
    JButton Equal = new JButton("=");
    JButton Multiply = new JButton("*");
    JButton Divide = new JButton("/");
    JButton Add = new JButton("+");
    JButton Subtract = new JButton("-");
    JButton Square = new JButton("x\u00B2");
    JButton Reciprocal = new JButton("1/x");
    JButton SquareRT = new JButton("\u221A");

    CalculatorGUI(){
        StartGUI(); //Starts the creation of the Calculator's GUI
        AddButtons(); //Add buttons to the GUI
    }

    public void StartGUI(){
        Screen = new JFrame();
        Screen.setTitle("Calculator"); //Title of the JFrame
        Screen.setSize(305,500); //Set Size of the JFrame
        Screen.getContentPane().setLayout(null); //Prevents components from taking over
        Screen.setBackground(Color.DARK_GRAY); //Set background color
        Screen.setVisible(true); //Setting visibility of JFrame
        Screen.setLocationRelativeTo(null); //Setting initial location of JFrame screen
        Screen.setResizable(false); //Prevents ability to resize window
        Screen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Setting default closing action of JFrame
    }

    public void AddButtons(){
        DisplayField.setBounds(250, 0, 50, 50);
        DisplayField.setForeground(Color.black);
        Screen.add(DisplayField);

        InputField.setBounds(10, 40, 270, 40);
        InputField.setFont(new Font("Garamond", Font.BOLD, 20));
        InputField.setEditable(true);
        InputField.setHorizontalAlignment(SwingConstants.RIGHT);
        Screen.add(InputField);

        Zero.setBounds(10, 410, 130, 40);
        Zero.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Zero);

        One.setBounds(10, 350, 60, 40);
        One.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(One);

        Two.setBounds(80, 350, 60, 40);
        Two.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Two);

        Three.setBounds(150, 350, 60, 40);
        Three.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Three);

        Four.setBounds(10, 290, 60, 40);
        Four.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Four);

        Five.setBounds(80, 290, 60, 40);
        Five.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Five);
        
        Six.setBounds(150, 290, 60, 40);
        Six.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Six);
        
        Seven.setBounds(10, 230, 60, 40);
        Seven.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Seven);
        
        Eight.setBounds(80, 230, 60, 40);
        Eight.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Eight);

        Nine.setBounds(150, 230, 60, 40);
        Nine.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Nine);

        Decimal.setBounds(150, 410, 60, 40);
        Decimal.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Decimal);

        ClearEntry.setBounds(80, 110, 60, 40);
        ClearEntry.setFont(new Font("Garamond", Font.BOLD, 15));
        Screen.add(ClearEntry);

        Delete.setBounds(150, 110, 60, 40);
        Delete.setFont(new Font("Garamond", Font.BOLD, 13));
        Screen.add(Delete);

        Equal.setBounds(220, 350, 60, 100);
        Equal.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Equal);

        Multiply.setBounds(220, 230, 60, 40);
        Multiply.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Multiply);

        Divide.setBounds(220, 110, 60, 40);
        Divide.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Divide);

        Add.setBounds(220, 290, 60, 40);
        Add.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Add);

        Subtract.setBounds(220, 170, 60, 40);
        Subtract.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Subtract);

        Square.setBounds(80, 170, 60, 40);
        Square.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(Square);

        Reciprocal.setBounds(150, 170, 60, 40);
        Reciprocal.setFont(new Font("Garamond", Font.BOLD, 15));
        Screen.add(Reciprocal);

        SquareRT.setBounds(10, 170, 60, 40);
        SquareRT.setFont(new Font("Garamond", Font.BOLD, 20));
        Screen.add(SquareRT);

    }
}
