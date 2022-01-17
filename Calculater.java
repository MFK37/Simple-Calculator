import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculater extends JFrame implements ActionListener{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculater frame = new Calculater();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JButton btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnDivition,btnMultiplication,btnAddition,btnSubstraction,btnDot,btnChangeSign,btnEqual,btnClear;
	JLabel lblNewLabel;
	double x,y;
	String opp = null;

	public Calculater() {
		setTitle("Calculater");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 262, 399);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(10, 59, 243, 290);
		contentPane.add(panel);
		panel.setLayout(null);
		

		
		// Buttons
		
		btn0 = new JButton("0");
		btn0.addActionListener(this);
		btn0.setBounds(60, 183, 50, 50);
		btn0.setFocusable(false);
		panel.add(btn0);
		
		btn1 = new JButton("1");
		btn1.addActionListener(this);
		btn1.setBounds(0, 122, 50, 50);
		btn1.setFocusable(false);
		panel.add(btn1);
		
		btn2 = new JButton("2");
		btn2.addActionListener(this);
		btn2.setBounds(60, 122, 50, 50);
		btn2.setFocusable(false);
		panel.add(btn2);
		
		btn3 = new JButton("3");
		btn3.addActionListener(this);
		btn3.setBounds(120, 122, 50, 50);
		btn3.setFocusable(false);
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(this);
		btn4.setBounds(0, 61, 50, 50);
		btn4.setFocusable(false);
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(this);
		btn5.setBounds(60, 61, 50, 50);
		btn5.setFocusable(false);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(this);
		btn6.setBounds(120, 61, 50, 50);
		btn6.setFocusable(false);
		panel.add(btn6);
		
		btn7 = new JButton("7");
		btn7.addActionListener(this);
		btn7.setBounds(0, 0, 50, 50);
		btn7.setFocusable(false);
		panel.add(btn7);
		
		btn8 = new JButton("8");
		btn8.addActionListener(this);
		btn8.setBounds(60, 0, 50, 50);
		btn8.setFocusable(false);
		panel.add(btn8);
		
		btn9 = new JButton("9");
		btn9.addActionListener(this);
		btn9.setBounds(120, 0, 50, 50);
		btn9.setFocusable(false);
		panel.add(btn9);
		
		btnDivition = new JButton("/");
		btnDivition.addActionListener(this);
		btnDivition.setBounds(180, 0, 50, 50);
		btnDivition.setFocusable(false);
		panel.add(btnDivition);
		
		btnMultiplication = new JButton("X");
		btnMultiplication.addActionListener(this);
		btnMultiplication.setBounds(180, 61, 50, 50);
		btnMultiplication.setFocusable(false);
		panel.add(btnMultiplication);
		
		btnAddition = new JButton("+");
		btnAddition.addActionListener(this);
		btnAddition.setBounds(180, 122, 50, 50);
		btnAddition.setFocusable(false);
		panel.add(btnAddition);
		
		btnSubstraction = new JButton("-");
		btnSubstraction.addActionListener(this);
		btnSubstraction.setBounds(180, 183, 50, 50);
		btnSubstraction.setFocusable(false);
		panel.add(btnSubstraction);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(this);
		btnDot.setBounds(120, 183, 50, 50);
		btnDot.setFocusable(false);
		panel.add(btnDot);
		
		btnChangeSign = new JButton("+/-");
		btnChangeSign.addActionListener(this);
		btnChangeSign.setBounds(0, 183, 50, 50);
		btnChangeSign.setFocusable(false);
		panel.add(btnChangeSign);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(this);
		btnEqual.setBounds(0, 240, 230, 50);
		btnEqual.setFocusable(false);
		panel.add(btnEqual);
		
		btnClear = new JButton("C");
		btnClear.setBounds(193, 11, 43, 43);
		btnClear.addActionListener(this);
		btnClear.setFocusable(false);
		contentPane.add(btnClear);
		
		// result label
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 11, 169, 43);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel = new JLabel("0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(10, 11, 206, 32);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblNewLabel);
		

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String doted = "no";
		
		if (e.getSource() == btn0) {
			addNumbers("0");
			
		}
		else if(e.getSource() == btn1) {
			addNumbers("1");
		}
		else if (e.getSource() == btn2) {
			addNumbers("2");
		}
		else if (e.getSource() == btn3) {
			addNumbers("3");
		}
		else if (e.getSource() == btn4) {
			addNumbers("4");
		}
		else if (e.getSource() == btn5) {
			addNumbers("5");
		}
		else if (e.getSource() == btn6) {
			addNumbers("6");
		}
		else if (e.getSource() == btn7) {
			addNumbers("7");
		}
		else if (e.getSource() == btn8) {
			addNumbers("8");
		}
		else if (e.getSource() == btn9) {
			addNumbers("9");
		}
		else if (e.getSource() == btnDivition) {
			opp = "divi";
			x = Double.parseDouble(lblNewLabel.getText());
			lblNewLabel.setText("0");
		}
		else if (e.getSource() == btnMultiplication) {
			opp = "multi";
			x = Double.parseDouble(lblNewLabel.getText());
			lblNewLabel.setText("0");
		}
		else if (e.getSource() == btnAddition) {
			opp = "add";
			x += Double.parseDouble(lblNewLabel.getText());
			lblNewLabel.setText("0");
		}
		else if (e.getSource() == btnSubstraction) {
			opp = "sub";
			x -= Double.parseDouble(lblNewLabel.getText());
			lblNewLabel.setText("0");
		}
		else if (e.getSource() == btnChangeSign) {
			if (!lblNewLabel.getText().equals("0") || !lblNewLabel.getText().equals("0.0")) {
				double value = Double.parseDouble(lblNewLabel.getText());
				value *= -1;
				String valueEdited = String.valueOf(value);
				lblNewLabel.setText(valueEdited);
			}
		}
		else if (e.getSource() == btnDot) {
			if (!lblNewLabel.getText().equals("0") || !lblNewLabel.getText().equals("0.0") && doted.equals("no")) {
				lblNewLabel.setText(lblNewLabel.getText()+".");
				doted = "yes";
			}
		}
		else if (e.getSource() == btnEqual) {
			double z = 0;
			y = Double.parseDouble(lblNewLabel.getText());
			
			if (opp.equals("add"))
				z = x + y;
			else if (opp.equals("sub"))
				z = x - y;
			else if (opp.equals("multi"))
				z = x * y;
			else {
				if (y == 0) {
					lblNewLabel.setText("error");
					return;
				}
				z = x / y;
			}
			String result = String.valueOf(z);
			lblNewLabel.setText(result);
		}
		else if (e.getSource() == btnClear) {
			x = 0;
			y = 0;
			doted = "no";
			lblNewLabel.setText("0");
		}
	}
	private void addNumbers (String number) {
		if (lblNewLabel.getText().equals("0"))
			lblNewLabel.setText(number);
		else
			lblNewLabel.setText(lblNewLabel.getText() + number);
	}
}
