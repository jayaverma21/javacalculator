import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Insets;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double First;
	double Second;
	double Result;
	String Operation;
	String Answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 21));
		frame.setBounds(100, 100, 304, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ScienficCalculator");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 10, 242, 28);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(10, 48, 274, 45);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnR = new JButton("\u221A");
		btnR.setEnabled(false);
		btnR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnR.setFont(new Font("Arial", Font.BOLD, 25));
		btnR.setBounds(10, 127, 52, 45);
		frame.getContentPane().add(btnR);
		
		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setMargin(new Insets(2, 6, 2, 6));
		btnLog.setFont(new Font("Arial", Font.BOLD, 18));
		btnLog.setBounds(65, 127, 52, 45);
		frame.getContentPane().add(btnLog);
		
		JButton btnS = new JButton("sin");
		btnS.setEnabled(false);
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnS.setMargin(new Insets(2, 6, 2, 6));
		btnS.setFont(new Font("Arial", Font.BOLD, 18));
		btnS.setBounds(120, 127, 52, 45);
		frame.getContentPane().add(btnS);
		
		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setMargin(new Insets(2, 6, 2, 6));
		btnEx.setFont(new Font("Arial", Font.BOLD, 18));
		btnEx.setBounds(10, 171, 52, 45);
		frame.getContentPane().add(btnEx);
		
		JButton btnX = new JButton("1/x");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setMargin(new Insets(2, 6, 2, 6));
		btnX.setFont(new Font("Arial", Font.BOLD, 18));
		btnX.setBounds(65, 171, 52, 45);
		frame.getContentPane().add(btnX);
		
		JButton btnXy = new JButton("x^y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="x^y" ;
				
			}
		});
		btnXy.setMargin(new Insets(2, 6, 2, 6));
		btnXy.setFont(new Font("Arial", Font.PLAIN, 18));
		btnXy.setBounds(10, 215, 52, 45);
		frame.getContentPane().add(btnXy);
		
		JButton btnModule = new JButton("%");
		btnModule.setEnabled(false);
		btnModule.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="%" ;
			}
		});
		btnModule.setFont(new Font("Arial", Font.PLAIN, 20));
		btnModule.setBounds(65, 215, 52, 45);
		frame.getContentPane().add(btnModule);
		
		JButton btnCl = new JButton("C");
		btnCl.setEnabled(false);
		btnCl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnCl.setFont(new Font("Arial", Font.PLAIN, 25));
		btnCl.setBounds(120, 215, 52, 45);
		frame.getContentPane().add(btnCl);
		
		JButton btnB = new JButton("\uF0E7");
		btnB.setEnabled(false);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setFont(new Font("Wingdings", Font.PLAIN, 16));
		btnB.setBounds(175, 215, 52, 45);
		frame.getContentPane().add(btnB);
		
		JButton btnDevide = new JButton("/");
		btnDevide.setEnabled(false);
		btnDevide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="/" ;
			}
		});
		btnDevide.setFont(new Font("Arial", Font.BOLD, 25));
		btnDevide.setBounds(232, 215, 52, 45);
		frame.getContentPane().add(btnDevide);
		
		JButton btnx3 = new JButton("x^3");
		btnx3.setEnabled(false);
		btnx3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx3.setMargin(new Insets(2, 6, 2, 6));
		btnx3.setFont(new Font("Arial", Font.PLAIN, 18));
		btnx3.setBounds(10, 261, 52, 45);
		frame.getContentPane().add(btnx3);
		
		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Algerian", Font.BOLD, 25));
		btn7.setBounds(65, 261, 52, 45);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Algerian", Font.BOLD, 25));
		btn8.setBounds(120, 261, 52, 45);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Algerian", Font.BOLD, 25));
		btn9.setBounds(175, 261, 52, 45);
		frame.getContentPane().add(btn9);
		
		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="*" ;
			}
		});
		btnMul.setFont(new Font("Arial", Font.BOLD, 25));
		btnMul.setBounds(232, 261, 52, 45);
		frame.getContentPane().add(btnMul);
		
		JButton btnx2 = new JButton("x^2");
		btnx2.setEnabled(false);
		btnx2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnx2.setMargin(new Insets(2, 6, 2, 6));
		btnx2.setFont(new Font("Arial", Font.PLAIN, 18));
		btnx2.setBounds(10, 307, 52, 45);
		frame.getContentPane().add(btnx2);
		
		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Algerian", Font.BOLD, 25));
		btn4.setBounds(65, 307, 52, 45);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Algerian", Font.BOLD, 25));
		btn5.setBounds(120, 307, 52, 45);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Algerian", Font.BOLD, 25));
		btn6.setBounds(175, 307, 52, 45);
		frame.getContentPane().add(btn6);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setEnabled(false);
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="-" ;
			}
		});
		btnMinus.setFont(new Font("Arial", Font.BOLD, 25));
		btnMinus.setBounds(232, 307, 52, 45);
		frame.getContentPane().add(btnMinus);
		
		JButton btnN = new JButton("n!");
		btnN.setEnabled(false);
		btnN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);
				
			}
		});
		btnN.setFont(new Font("Arial", Font.PLAIN, 20));
		btnN.setBounds(10, 354, 52, 45);
		frame.getContentPane().add(btnN);
		
		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Algerian", Font.BOLD, 25));
		btn1.setBounds(65, 354, 52, 45);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Algerian", Font.BOLD, 25));
		btn2.setBounds(120, 354, 52, 45);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Algerian", Font.BOLD, 25));
		btn3.setBounds(175, 354, 52, 45);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setEnabled(false);
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				First=Double.parseDouble(textField.getText());
				textField.setText(" ");
				Operation="+" ;
			}
		});
		btnPlus.setFont(new Font("Arial", Font.BOLD, 25));
		btnPlus.setBounds(232, 354, 52, 45);
		frame.getContentPane().add(btnPlus);
		
		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnPlusMinus.setFont(new Font("Arial", Font.BOLD, 15));
		btnPlusMinus.setBounds(10, 395, 52, 45);
		frame.getContentPane().add(btnPlusMinus);
		
		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Algerian", Font.BOLD, 25));
		btn0.setBounds(65, 395, 107, 45);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.setEnabled(false);
		btnDot.setFont(new Font("Algerian", Font.BOLD, 25));
		btnDot.setBounds(175, 395, 52, 45);
		frame.getContentPane().add(btnDot);
		
		JButton btnequal = new JButton("=");
		btnequal.setEnabled(false);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Second=Double.parseDouble(textField.getText());
				if(Operation=="+")
				{
					Result=First+Second;
					Answer=String.format("%.2f", Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="-")
				{
					Result=First-Second;
					Answer=String.format("%.2f", Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="*")
				{
					Result=First*Second;
					Answer=String.format("%.2f", Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="/")
				{
					Result=First/Second;
					Answer=String.format("%.2f", Result);
					textField.setText(Answer);
					
				}
				else if(Operation=="%")
				{
					Result=First%Second;
					Answer=String.format("%.2f", Result);
					textField.setText(Answer);
					
				}	
				else if(Operation=="x^y")
				{
					double resultt=1;
					for(int i=0;i<Second;i++)
					{
						resultt=First*resultt;
					}
					Answer=String.format("%.2f", resultt);
					textField.setText(Answer);
					
				}	
			}
		});
		btnequal.setFont(new Font("Arial", Font.BOLD, 25));
		btnequal.setBounds(232, 395, 52, 45);
		frame.getContentPane().add(btnequal);
		
		JButton btnC = new JButton("cos");
		btnC.setEnabled(false);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnC.setMargin(new Insets(2, 6, 2, 6));
		btnC.setFont(new Font("Arial", Font.BOLD, 18));
		btnC.setBounds(175, 127, 52, 45);
		frame.getContentPane().add(btnC);
		
		JButton btnT = new JButton("tan");
		btnT.setEnabled(false);
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnT.setMargin(new Insets(2, 6, 2, 6));
		btnT.setFont(new Font("Arial", Font.BOLD, 18));
		btnT.setBounds(232, 127, 52, 45);
		frame.getContentPane().add(btnT);
		
		JButton btnSh = new JButton("sinh");
		btnSh.setEnabled(false);
		btnSh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSh.setMargin(new Insets(2, 5, 2, 5));
		btnSh.setFont(new Font("Arial", Font.PLAIN, 18));
		btnSh.setBounds(120, 171, 52, 45);
		frame.getContentPane().add(btnSh);
		
		JButton btnCh = new JButton("cosh");
		btnCh.setEnabled(false);
		btnCh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCh.setMargin(new Insets(2, 5, 2, 5));
		btnCh.setFont(new Font("Arial", Font.PLAIN, 16));
		btnCh.setBounds(175, 171, 52, 45);
		frame.getContentPane().add(btnCh);
		
		JButton btnTh = new JButton("tanh");
		btnTh.setEnabled(false);
		btnTh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTh.setMargin(new Insets(2, 5, 2, 5));
		btnTh.setFont(new Font("Arial", Font.PLAIN, 18));
		btnTh.setBounds(232, 171, 52, 45);
		frame.getContentPane().add(btnTh);
		
		JRadioButton rdoOn = new JRadioButton("ON");
		rdoOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);
				btnDot.setEnabled(true);
				btnPlus.setEnabled(true);
				btnMinus.setEnabled(true);
				btnMul.setEnabled(true);
				btnDevide.setEnabled(true);
				btnPlusMinus.setEnabled(true);
				btnS.setEnabled(true);
				btnT.setEnabled(true);
				btnC.setEnabled(true);
				btnSh.setEnabled(true);
				btnTh.setEnabled(true);
				btnCh.setEnabled(true);
				btnX.setEnabled(true);
				btnN.setEnabled(true);
				btnx2.setEnabled(true);
				btnx3.setEnabled(true);
				btnXy.setEnabled(true);
				btnB.setEnabled(true);
				btnR.setEnabled(true);
				btnEx.setEnabled(true);
				btnModule.setEnabled(true);
				btnLog.setEnabled(true);
				btnCl.setEnabled(true);
				btnequal.setEnabled(true);
			}
		});
		buttonGroup.add(rdoOn);
		rdoOn.setFont(new Font("Arial Black", Font.BOLD, 12));
		rdoOn.setBounds(10, 99, 52, 22);
		frame.getContentPane().add(rdoOn);
		
		JRadioButton rdoOff = new JRadioButton("OFF");
		rdoOff.setSelected(true);
		rdoOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);
				btnDot.setEnabled(false);
				btnPlus.setEnabled(false);
				btnMinus.setEnabled(false);
				btnMul.setEnabled(false);
				btnDevide.setEnabled(false);
				btnPlusMinus.setEnabled(false);
				btnS.setEnabled(false);
				btnT.setEnabled(false);
				btnC.setEnabled(false);
				btnSh.setEnabled(false);
				btnTh.setEnabled(false);
				btnCh.setEnabled(false);
				btnX.setEnabled(false);
				btnN.setEnabled(false);
				btnx2.setEnabled(false);
				btnx3.setEnabled(false);
				btnXy.setEnabled(false);
				btnB.setEnabled(false);
				btnR.setEnabled(false);
				btnEx.setEnabled(false);
				btnModule.setEnabled(false);
				btnLog.setEnabled(false);
				btnCl.setEnabled(false);
				btnequal.setEnabled(false);
				
			}
		});
		buttonGroup.add(rdoOff);
		rdoOff.setFont(new Font("Arial Black", Font.BOLD, 10));
		rdoOff.setBounds(65, 99, 52, 22);
		frame.getContentPane().add(rdoOff);
	}
}
