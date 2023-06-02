import javax.swing.*;
import javax.swing.text.DefaultStyledDocument.ElementSpec;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.DoubleBinaryOperator;

public class CalculatorFunctions implements ActionListener{
    private double Number, Answer;
    private int Operation;
    CalculatorGUI Screen;

    CalculatorFunctions(CalculatorGUI Screen){
        Screen.ClearEntry.addActionListener(this);
        Screen.Delete.addActionListener(this);
        Screen.Divide.addActionListener(this);
        Screen.Multiply.addActionListener(this);
        Screen.Add.addActionListener(this);
        Screen.Subtract.addActionListener(this);
        Screen.SquareRT.addActionListener(this);
        Screen.Square.addActionListener(this);
        Screen.Reciprocal.addActionListener(this);
        Screen.Equal.addActionListener(this);
        Screen.Zero.addActionListener(this);
        Screen.One.addActionListener(this);
        Screen.Two.addActionListener(this);
        Screen.Three.addActionListener(this);
        Screen.Four.addActionListener(this);
        Screen.Five.addActionListener(this);
        Screen.Six.addActionListener(this);
        Screen.Seven.addActionListener(this);
        Screen.Eight.addActionListener(this);
        Screen.Nine.addActionListener(this);
        Screen.Decimal.addActionListener(this);

        this.Screen = Screen;
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object Input = e.getSource();
        
        if(Input == Screen.ClearEntry){
            Screen.DisplayField.setText("");
            Screen.InputField.setText("");
        }else if(Input == Screen.Delete){
            int Length = Screen.InputField.getText().length();
            int Number = Length-1;

            if(Length > 0){
                StringBuilder Back = new StringBuilder(Screen.InputField.getText());
                Back.deleteCharAt(Number);
                Screen.InputField.setText(Back.toString());
            }
            if(Screen.InputField.getText().endsWith("")){
                Screen.DisplayField.setText("");
            }
        }else if(Input == Screen.Zero){
            if(Screen.InputField.getText().equals("0")){
                return;
            }else{
                Screen.InputField.setText(Screen.InputField.getText()+"0");
            }
        }else if(Input == Screen.One){
            Screen.InputField.setText(Screen.InputField.getText()+"1");
        }else if(Input == Screen.Two){
            Screen.InputField.setText(Screen.InputField.getText()+"2");
        }else if(Input == Screen.Three){
            Screen.InputField.setText(Screen.InputField.getText()+"3");
        }else if(Input == Screen.Four){
            Screen.InputField.setText(Screen.InputField.getText()+"4");
        }else if(Input == Screen.Five){
            Screen.InputField.setText(Screen.InputField.getText()+"5");
        }else if(Input == Screen.Six){
            Screen.InputField.setText(Screen.InputField.getText()+"6");
        }else if(Input == Screen.Seven){
            Screen.InputField.setText(Screen.InputField.getText()+"7");
        }else if(Input == Screen.Eight){
            Screen.InputField.setText(Screen.InputField.getText()+"8");
        }else if(Input == Screen.Nine){
            Screen.InputField.setText(Screen.InputField.getText()+"9");
        }else if(Input == Screen.Decimal){
            if(Screen.InputField.getText().contains(".")){
                return;
            }else{
                Screen.InputField.setText(Screen.InputField.getText()+".");
            }
        }else if(Input == Screen.Add){
            String Temp = Screen.InputField.getText();
            Number = Double.parseDouble(Screen.InputField.getText());
            Screen.InputField.setText("");
            Screen.DisplayField.setText(Temp+"+");
            Operation = 1;
        }else if(Input == Screen.Subtract){
            String Temp = Screen.InputField.getText();
            Number = Double.parseDouble(Screen.InputField.getText());
            Screen.InputField.setText("");
            Screen.DisplayField.setText(Temp+"-");
            Operation = 2;
        }else if(Input == Screen.Multiply){
            String Temp = Screen.InputField.getText();
            Number = Double.parseDouble(Screen.InputField.getText());
            Screen.InputField.setText("");
            Screen.DisplayField.setText(Temp+"*");
            Operation = 3;
        }else if(Input == Screen.Divide){
            String Temp = Screen.InputField.getText();
            Number = Double.parseDouble(Screen.InputField.getText());
            Screen.InputField.setText("");
            Screen.DisplayField.setText(Temp+"/");
            Operation = 4;
        }else if(Input == Screen.Square){
            String Prev = Screen.InputField.getText();
            Number = Double.parseDouble(Screen.InputField.getText());
            double Square = Math.pow(Number, 2);
            String Temp = Double.toString(Square);
            if(Temp.endsWith(".0")){
                Screen.InputField.setText(Temp.replace(".0",""));
            }else{
                Screen.InputField.setText(Temp);
            }
            Screen.DisplayField.setText("(sqr)"+Prev);
        }else if(Input == Screen.SquareRT){
            Number = Double.parseDouble(Screen.InputField.getText());
            double SquareRT = Math.sqrt(Number);
            Screen.InputField.setText(Double.toString(SquareRT));
        }else if(Input == Screen.Reciprocal){
            Number = Double.parseDouble(Screen.InputField.getText());
            double reciprocal = 1/Number;
            String Temp =  Double.toString(reciprocal);
            if(Temp.endsWith(".0")){
                Screen.InputField.setText(Temp.replace(".0", ""));
            }else{
                Screen.InputField.setText(Temp);
            }
        }else if(Input == Screen.Equal){
            switch(Operation){
                case 1:
                    Answer = Number + Double.parseDouble(Screen.InputField.getText());
                    if(Double.toString(Answer).endsWith(".0")){
                        Screen.InputField.setText(Double.toString(Answer).replace(".0",""));
                    }else{
                        Screen.InputField.setText(Double.toString(Answer));
                    }
                    Screen.DisplayField.setText("");
                    break;
                case 2:
                    Answer = Number - Double.parseDouble(Screen.InputField.getText());
                    if(Double.toString(Answer).endsWith(".0")){
                        Screen.InputField.setText(Double.toString(Answer).replace(".0",""));
                    }else{
                        Screen.InputField.setText(Double.toString(Answer));
                    }
                    Screen.DisplayField.setText("");
                    break;
                case 3:
                    Answer = Number * Double.parseDouble(Screen.InputField.getText());
                    if(Double.toString(Answer).endsWith(".0")){
                        Screen.InputField.setText(Double.toString(Answer).replace(".0",""));
                    }else{
                        Screen.InputField.setText(Double.toString(Answer));
                    }
                    Screen.DisplayField.setText("");
                    break;
                case 4:
                    Answer = Number / Double.parseDouble(Screen.InputField.getText());
                    if(Double.toString(Answer).endsWith(".0")){
                        Screen.InputField.setText(Double.toString(Answer).replace(".0",""));
                    }else{
                        Screen.InputField.setText(Double.toString(Answer));
                    }
                    Screen.DisplayField.setText("");
                    break;
            }
        }
    }

    
    public void Enable(){

    }

    public void Disable(){
        
    }
}
