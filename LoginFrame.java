 
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
 
public class LoginFrame extends JFrame implements ActionListener {
	JLabel lblusername, lblpassword,lblshowmsg;
	JTextField txtusername;
	JPasswordField txtpassword;
	JButton btnlogin, btncancel, btnregister;
	JLabel lblimage ;
	
	
    LoginFrame() {
		
		lblusername = new JLabel("Enter user Name ");
		lblusername.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblusername.setBounds(172, 165, 130, 26);
		lblpassword = new JLabel("Enter Password ");
		lblpassword.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblpassword.setBounds(172, 200, 119, 32);
		txtusername = new JTextField(20);
		txtusername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtusername.setBounds(330, 165, 176, 32);
		txtpassword = new JPasswordField(20);
		txtpassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpassword.setBounds(330, 207, 176, 30);
		lblshowmsg = new JLabel();
		lblshowmsg.setText("           ");
		lblshowmsg.setBounds(209, 247, 280, 26);
		lblshowmsg.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		btnlogin = new JButton("Login");
		btnlogin.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnlogin.setBounds(187, 285, 85, 29);
		btnlogin.setSelected(true);
		btncancel = new JButton("Cancel");
		btncancel.setBackground(new Color(240, 240, 240));
		btncancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btncancel.setBounds(372, 283, 96, 32);
		btncancel.setSelected(true);
		lblimage = new JLabel();
		lblimage.setIcon(new ImageIcon("C:\\Users\\aditi\\Downloads\\download.png"));
		lblimage.setSize(246, 145);
		lblimage.setLocation(222, 10);
		btnregister = new JButton("New User? Register Now");
		btnregister.setBackground(new Color(102, 182, 253));
		btnregister.setBorder(null);
		btnregister.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnregister.setSize(222, 41);
		btnregister.setLocation(221, 344);
		
		getContentPane().setLayout(null);
		getContentPane().add(btnregister);
		getContentPane().add(lblimage);
		getContentPane().add(lblusername);
		getContentPane().add(txtusername);
		getContentPane().add(lblpassword);
		getContentPane().add(txtpassword);
		getContentPane().add(lblshowmsg);
		getContentPane().add(btnlogin);
		getContentPane().add(btncancel);
		
		// Register the button for event handling
		btnlogin.addActionListener(this);
		btncancel.addActionListener(this);
		btnregister.addActionListener(this);
		
		
		setSize(699,469);
		setVisible(true);
		setTitle("Login Here ");
		setLocationRelativeTo(null);
	}

	 public static void main(String[] args) {
		LoginFrame f1 = new LoginFrame();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btnlogin) {
				String un = txtusername.getText();
				String pwd = txtpassword.getText();
				if(un.equals("student") && pwd.equals("student")) {
					lblpassword.setText("Login Successfull");
					dispose();
					new ProjectFrame();
				}
				else {
					lblshowmsg.setText("Invalid Username or Password");
				}
				
			}
			else if(e.getSource()==btncancel)
				dispose();
			else if(e.getSource()==btnregister) {
				dispose();
				new RegistrationFrame();
			}
		}
	}
