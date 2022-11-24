package calculator_app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Point;

public class calculator extends JFrame {	
	private static final long serialVersionUID = 1765864881286733766L;
	private JPanel contentPane;
	protected JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator frame = new calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
//	Adding math operators / calculations
	double num, ans;
	int calculation;
	
	public void arithmetic_operation() {
		switch(calculation) {
		
		case 1: // Addition
			ans = num + Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 2: // Subtraction
			ans = num - Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 3: // Multiplication
			ans = num * Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
			
		case 4: // Division
			ans = num / Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));
			break;
		
		}
	}

	/**
	 * Create the frame.
	 */
	public calculator() {
		setResizable(false);
		setTitle("Jethro's Calculator");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 305, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 27, 264, 35);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 24));
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton jButton17 = new JButton("<--");
		jButton17.setFont(new Font("Tahoma", Font.BOLD, 12));
		jButton17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				String store;
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store = back.toString();
					textField.setText(store);
				}
				
			}
		});
		jButton17.setBounds(89, 93, 55, 23);
		contentPane.add(jButton17);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setForeground(new Color(255, 128, 192));
		lblNewLabel.setBounds(219, 11, 55, 14);
		contentPane.add(lblNewLabel);
		
		JButton jButton16 = new JButton("C");
		jButton16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		jButton16.setFont(new Font("Tahoma", Font.BOLD, 14));
		jButton16.setBounds(154, 93, 55, 23);
		contentPane.add(jButton16);
		
		JButton jButton15 = new JButton("+");
		jButton15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num = Double.parseDouble(textField.getText());
				calculation = 1;
				textField.setText("");
				lblNewLabel.setText(num + "+");
			}
		});
		jButton15.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton15.setBounds(219, 93, 55, 23);
		contentPane.add(jButton15);
		
		JButton jButton7 = new JButton("7");
		jButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		jButton7.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton7.setBounds(20, 125, 55, 23);
		contentPane.add(jButton7);
		
		JButton jButton8 = new JButton("8");
		jButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		jButton8.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton8.setBounds(89, 125, 55, 23);
		contentPane.add(jButton8);
		
		JButton jButton9 = new JButton("9");
		jButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		jButton9.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton9.setBounds(154, 125, 55, 23);
		contentPane.add(jButton9);
		
		JButton jButton14 = new JButton("-");
		jButton14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num = Double.parseDouble(textField.getText());
				calculation = 2;
				textField.setText("");
				lblNewLabel.setText(num + "-");
				
			}
		});
		jButton14.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton14.setBounds(219, 125, 55, 23);
		contentPane.add(jButton14);
		
		JButton jButton4 = new JButton("4");
		jButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		jButton4.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton4.setBounds(20, 159, 55, 23);
		contentPane.add(jButton4);
		
		JButton jButton13 = new JButton("*");
		jButton13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num = Double.parseDouble(textField.getText());
				calculation = 3;
				textField.setText("");
				lblNewLabel.setText(num + "*");
				
			}
		});
		jButton13.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton13.setBounds(219, 159, 55, 23);
		contentPane.add(jButton13);
		
		JButton jButton6 = new JButton("6");
		jButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		jButton6.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton6.setBounds(154, 159, 55, 23);
		contentPane.add(jButton6);
		
		JButton jButton5 = new JButton("5");
		jButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		jButton5.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton5.setBounds(89, 159, 55, 23);
		contentPane.add(jButton5);
		
		JButton jButton1 = new JButton("1");
		jButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		jButton1.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton1.setBounds(20, 193, 55, 23);
		contentPane.add(jButton1);
		
		JButton jButton12 = new JButton("/");
		jButton12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num = Double.parseDouble(textField.getText());
				calculation = 4;
				textField.setText("");
				lblNewLabel.setText(num + "/");
				
			}
		});
		jButton12.setFont(new Font("Tahoma", Font.BOLD, 14));
		jButton12.setBounds(219, 193, 55, 23);
		contentPane.add(jButton12);
		
		JButton jButton3 = new JButton("3");
		jButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		jButton3.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton3.setBounds(154, 193, 55, 23);
		contentPane.add(jButton3);
		
		JButton jButton2 = new JButton("2");
		jButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		jButton2.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton2.setBounds(89, 193, 55, 23);
		contentPane.add(jButton2);
		
		JButton jButton0 = new JButton("0");
		jButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		jButton0.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton0.setBounds(20, 227, 55, 23);
		contentPane.add(jButton0);
		
		JButton jButton11 = new JButton("=");
		jButton11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				arithmetic_operation();
				lblNewLabel.setText("");
				
			}
		});
		jButton11.setFont(new Font("Tahoma", Font.BOLD, 18));
		jButton11.setBounds(154, 227, 120, 23);
		contentPane.add(jButton11);
		
		JButton jButton10 = new JButton(".");
		jButton10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		jButton10.setFont(new Font("Tahoma", Font.BOLD, 16));
		jButton10.setBounds(89, 227, 55, 23);
		contentPane.add(jButton10);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(20, 95, 45, 23);
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				lblNewLabel.setText("");
				textField.setEnabled(false);
				
				jButton0.setEnabled(false);
				jButton1.setEnabled(false);
				jButton2.setEnabled(false);
				jButton3.setEnabled(false);
				jButton4.setEnabled(false);
				jButton5.setEnabled(false);
				jButton6.setEnabled(false);
				jButton7.setEnabled(false);
				jButton8.setEnabled(false);
				jButton9.setEnabled(false);
				jButton10.setEnabled(false);
				jButton11.setEnabled(false);
				jButton12.setEnabled(false);
				jButton13.setEnabled(false);
				jButton14.setEnabled(false);
				jButton15.setEnabled(false);
				jButton16.setEnabled(false);
				jButton17.setEnabled(false);
			}
		});
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 69, 41, 23);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setEnabled(true);
				
				jButton0.setEnabled(true);
				jButton1.setEnabled(true);
				jButton2.setEnabled(true);
				jButton3.setEnabled(true);
				jButton4.setEnabled(true);
				jButton5.setEnabled(true);
				jButton6.setEnabled(true);
				jButton7.setEnabled(true);
				jButton8.setEnabled(true);
				jButton9.setEnabled(true);
				jButton10.setEnabled(true);
				jButton11.setEnabled(true);
				jButton12.setEnabled(true);
				jButton13.setEnabled(true);
				jButton14.setEnabled(true);
				jButton15.setEnabled(true);
				jButton16.setEnabled(true);
				jButton17.setEnabled(true);
			}
		});
		contentPane.add(rdbtnNewRadioButton);
		
	}
}
