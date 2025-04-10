
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Font;
public class RegistrationFrame extends JFrame implements ActionListener {
    JLabel lblName, lblMobile, lblEmail,lblAddress, lblUsername, lblPassword;
    JTextField txtName, txtMobile, txtEmail,txtAddress, txtUsername;
    JPasswordField txtPassword;
    JButton btnRegister, btnCancel;
    JLabel lblimage ;
    RegistrationFrame() {
    	getContentPane().setMaximumSize(new Dimension(889, 811));
        lblName = new JLabel(" Enter Name:");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblName.setBounds(49, 182, 93, 24);
        txtName = new JTextField(20);
        txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtName.setBounds(149, 180, 166, 29);
        lblMobile = new JLabel(" Enter Mobile No.:");
        lblMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblMobile.setBounds(344, 178, 116, 29);
        txtMobile = new JTextField(20);
        txtMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtMobile.setBounds(470, 178, 166, 29);
        lblEmail = new JLabel("Enter Email ID:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(354, 221, 107, 24);
        txtEmail = new JTextField(20);
        txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtEmail.setBounds(470, 214, 166, 31);
        lblAddress = new JLabel(" Enter Address:");
        lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblAddress.setBounds(35, 215, 107, 24);
        txtAddress = new JTextField(20);
        txtAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtAddress.setBounds(149, 216, 166, 29);
        lblUsername = new JLabel(" Enter Username:");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblUsername.setBounds(22, 261, 120, 21);
        txtUsername = new JTextField(20);
        txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtUsername.setBounds(149, 259, 166, 29);
        lblPassword = new JLabel("Enter Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblPassword.setBounds(344, 260, 116, 23);
        txtPassword = new JPasswordField(20);
        txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
        txtPassword.setBounds(470, 254, 166, 29);
        btnRegister = new JButton("Register");
        btnRegister.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnRegister.setBounds(164, 329, 116, 47);
        btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 17));
        btnCancel.setBounds(385, 329, 106, 47);
        
        lblimage = new JLabel();
        lblimage.setIcon(new ImageIcon("C:\\Users\\aditi\\Downloads\\download.jpeg"));
        lblimage.setBounds(236, 10, 245, 151);
        getContentPane().setLayout(null);
        getContentPane().add(lblName);
        getContentPane().add(txtName);
        getContentPane().add(lblMobile);
        getContentPane().add(txtMobile);
        getContentPane().add(lblEmail);
        getContentPane().add(txtEmail);
        getContentPane().add(lblAddress);
        getContentPane().add(txtAddress);
        getContentPane().add(lblUsername);
        getContentPane().add(txtUsername);
        getContentPane().add(lblPassword);
        getContentPane().add(txtPassword);
        getContentPane().add(btnRegister);
        getContentPane().add(btnCancel);
        getContentPane().add(lblimage);
        
        
        btnRegister.addActionListener(this);
        btnCancel.addActionListener(this);
        
        setTitle("Registration Here ");
        setSize(699,455);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new RegistrationFrame();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRegister) {
        	String fn = txtName.getText();
        	String mb = txtMobile.getText();
        	String em = txtEmail.getText();
        	String un = txtUsername.getText();
        	String ps = new String(txtPassword.getPassword());
        	this.dispose();
        	JOptionPane.showMessageDialog(this, "Registration Successfull!! Login Now!");
        	new LoginFrame();
        }
        else if(e.getSource()==btnCancel){
        	this.dispose();
        }
    }
}
