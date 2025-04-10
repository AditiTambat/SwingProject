
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

public class WelcomeFrame extends JFrame implements ActionListener{
	JLabel l1;
	JButton btnstart,btnexit;
	public WelcomeFrame() {
		setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		l1 = new JLabel("");
		l1.setMinimumSize(new Dimension(54, 0));
		l1.setIcon(new ImageIcon("C:\\Users\\aditi\\Downloads\\images.png"));
		l1.setBounds(163, 30, 370, 237);
		getContentPane().add(l1);
		
		btnstart = new JButton("Start");
		btnstart.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnstart.setBounds(129, 293, 131, 39);
		getContentPane().add(btnstart);
		
		btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnexit.setBounds(384, 293, 131, 39);
		getContentPane().add(btnexit);
		
		btnstart.addActionListener(this);
		btnexit.addActionListener(this);
		
		setSize(684,458);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Splash Screen");
	}
	public static void main(String[] args) {
		new WelcomeFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== btnstart) {
			this.dispose();
			new LoginFrame();
		}
		else {
			this.dispose();
		}
	}
}

