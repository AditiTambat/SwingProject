import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Font;

public class ProjectFrame extends JFrame implements ActionListener{
	JLabel lblresult;
	JTextField txtno1,txtno2;
	JButton btnplus, btnminus,btnmult, btndiv,btnexit;
	private JLabel lblEnterFirstNumber;
	private JLabel lblEnterSecondNumber;
	
	ProjectFrame() {
		btnplus = new JButton("Addition");
		btnplus.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		btnplus.setBounds(216, 211, 244, 38);
		btnminus = new JButton("Subtraction");
		btnminus.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		btnminus.setBounds(216, 259, 244, 38);
		btnmult = new JButton("Multiplication");
		btnmult.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		btnmult.setBounds(216, 307, 244, 37);
		btndiv = new JButton("Division");
		btndiv.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		btndiv.setBounds(216, 354, 244, 37);
		btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 20));
		btnexit.setBounds(216, 401, 244, 30);
		getContentPane().setLayout(null);
		
		lblEnterFirstNumber = new JLabel("       Enter First Number");
		lblEnterFirstNumber.setFont(new Font("Cambria", Font.BOLD, 16));
		lblEnterFirstNumber.setBounds(57, 38, 194, 39);
		getContentPane().add(lblEnterFirstNumber);
		txtno1 = new JTextField(20);
		txtno1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtno1.setBounds(281, 39, 321, 38);
		getContentPane().add(txtno1);
		
		lblEnterSecondNumber = new JLabel("      Enter Second Number");
		lblEnterSecondNumber.setFont(new Font("Cambria", Font.BOLD, 16));
		lblEnterSecondNumber.setBounds(57, 87, 194, 38);
		getContentPane().add(lblEnterSecondNumber);
		txtno2 = new JTextField(20);
		txtno2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtno2.setBounds(281, 87, 323, 39);
		
		lblresult = new JLabel("   Result: ");
		lblresult.setFont(new Font("Cambria", Font.BOLD, 16));
		lblresult.setSize(212, 30);
		lblresult.setLocation(131, 147);
		getContentPane().add(lblresult);
		getContentPane().add(txtno2);
		getContentPane().add(btnplus);
		getContentPane().add(btnminus);
		getContentPane().add(btnmult);
		getContentPane().add(btndiv);
		getContentPane().add(btnexit);
		
		// register the buttons for event handling
		btnplus.addActionListener(this);
		btnminus.addActionListener(this);
		btnmult.addActionListener(this);
		btndiv.addActionListener(this);
		btnexit.addActionListener(this);
		
		// set all settings
		setTitle("Calculator Operation ");
        setSize(755,534);
        setVisible(true);
        setLocationRelativeTo(null);
		
	}

	//@Override
	public void actionPerformed(ActionEvent e) {
		try {
			 int no1, no2, result;
			  no1 = Integer.parseInt(txtno1.getText());
			  no2 = Integer.parseInt(txtno2.getText());
			  result = 0;
			if(e.getSource()==btnplus) {
				//code for addition
				result = no1 + no2;			
			}
			else if(e.getSource()== btnminus) {
				//code for subtraction
				result = no1 - no2;
			}
			else if(e.getSource()== btnmult) {
				//code for multiplication
				result = no1 * no2;
			}
			else if(e.getSource()== btndiv) {
				//code for division
				result = no1 / no2;
			}
			else if(e.getSource()== btnexit) {
				//code for exit
				this.dispose();
			}
			lblresult.setText("Result: " + result);
			
		}catch(NumberFormatException ex) {
			
			lblresult.setText("Error: Please enter valid numbers!");
		}
		
	}
	public static void main(String[] args) {
        new ProjectFrame();
    }
}
