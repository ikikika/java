package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class calculator {

	private JFrame frame;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
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
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 268, 401);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisplay.setBounds(10, 11, 230, 41);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		//---------------------Row 1 ---------------------------
		JButton btnDel = new JButton("del");
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDel.setBounds(10, 60, 50, 50);
		frame.getContentPane().add(btnDel);
		
		JButton btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClear.setBounds(70, 60, 50, 50);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent = new JButton("%");
		btnPercent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPercent.setBounds(130, 60, 50, 50);
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPlus.setBounds(190, 60, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		//---------------------Row 2 ---------------------------
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		}); 
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn7.setBounds(10, 120, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn8.setBounds(70, 120, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn9.setBounds(130, 120, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnMinus.setBounds(190, 120, 50, 50);
		frame.getContentPane().add(btnMinus);
		
		//-----------------Row 3 --------------------------
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn4.setBounds(10, 180, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn5.setBounds(70, 180, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn6.setBounds(130, 180, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btnTimes = new JButton("*");
		btnTimes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTimes.setBounds(190, 180, 50, 50);
		frame.getContentPane().add(btnTimes);
		
		//-----------------Row 4 --------------------------
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn1.setBounds(10, 240, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn2.setBounds(70, 240, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn3.setBounds(130, 240, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDivide.setBounds(190, 240, 50, 50);
		frame.getContentPane().add(btnDivide);
		
		//-----------------Row 5 --------------------------
		JButton btnDot = new JButton(".");
		btnDot.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDot.setBounds(10, 300, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btn0.setBounds(70, 300, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnPM = new JButton("+-");
		btnPM.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnPM.setBounds(130, 300, 50, 50);
		frame.getContentPane().add(btnPM);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnEqual.setBounds(190, 300, 50, 50);
		frame.getContentPane().add(btnEqual);
	}
}
