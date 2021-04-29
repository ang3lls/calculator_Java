import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ui_calculadora {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel tela;
    private JTextField display;
    private JButton buttonDiv;
    private JButton buttonOne;
    private JButton buttonFour;
    private JButton buttonSeven;
    private JButton buttonEight;
    private JButton buttonFive;
    private JButton buttonTwo;
    private JButton buttonZero;
    private JButton buttonNine;
    private JButton buttonSix;
    private JButton buttonThree;
    private JButton buttonVirgula;
    private JButton buttonMult;
    private JButton buttonSub;
    private JButton buttonAd;
    private JButton buttonRes;
    private JButton buttonCE;

    public void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(display.getText());
        display.setText("");
    }

    public ui_calculadora() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonOneText = display.getText() + buttonOne.getText();
                display.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonTwoText = display.getText() + buttonTwo.getText();
                display.setText(buttonTwoText);
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonThreeText = display.getText() + buttonThree.getText();
                display.setText(buttonThreeText);
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFourText = display.getText() + buttonFour.getText();
                display.setText(buttonFourText);
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFiveText = display.getText() + buttonFive.getText();
                display.setText(buttonFiveText);
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSixText = display.getText() + buttonSix.getText();
                display.setText(buttonSixText);
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSevenText = display.getText() + buttonSeven.getText();
                display.setText(buttonSevenText);
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonEightText = display.getText() + buttonEight.getText();
                display.setText(buttonEightText);
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNineText = display.getText() + buttonNine.getText();
                display.setText(buttonNineText);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonZeroText = display.getText() + buttonZero.getText();
                display.setText(buttonZeroText);
            }
        });
        buttonVirgula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(display.getText().equals("")){
                    display.setText("0.");
                }
                else if(display.getText().contains(".")){
                    buttonVirgula.setEnabled(false);
                }
                else{
                    String buttonVirgulaText = display.getText() + buttonVirgula.getText();
                    display.setText(buttonVirgulaText);
                }
                buttonVirgula.setEnabled(true);
            }
        });
        buttonAd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                            String button_text = buttonAd.getText();
                            getOperator(button_text);
            }
        });
        buttonRes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(display.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(display.getText());
                        break;
                    case 'X':
                        total2  = total1 * Double.parseDouble(display.getText());
                        break;
                    case ':':
                        total2 = total1 / Double.parseDouble(display.getText());
                        break;
                }
                display.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        buttonCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                display.setText("");
            }
        });
        buttonSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonSub.getText();
                getOperator(button_text);
            }
        });
        buttonMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMult.getText();
                getOperator(button_text);
            }
        });
        buttonDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonDiv.getText();
                getOperator(button_text);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ui_calculadora");
        frame.setContentPane(new ui_calculadora().tela);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
