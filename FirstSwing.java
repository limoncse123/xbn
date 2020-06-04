package swing;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.*;

public class FirstSwing {
	public static void main(String[] args)
	{
		JFrame F1=new JFrame();
		
		JLabel L1=new JLabel();
		JLabel L2=new JLabel();
		
		JButton B1=new JButton();
		JButton B2=new JButton();
		JButton B3=new JButton();
		JButton B4=new JButton();
		
		F1.setSize(500,500);
		
		F1.setTitle("Swing Layout");
		F1.setDefaultCloseOperation(F1.EXIT_ON_CLOSE);
		
		L1.setText("Enter the first number:");
		L2.setText("Enter second number: ");
		
		JTextField TF1 = new JTextField();
		JTextField TF2=new JTextField();
		
		TF1.setText("First Number: ");
		TF2.setText("Second Number: ");
		
		F1.setVisible(true);
		
		F1.setLayout(new FlowLayout(5,50,10));
		
		F1.add(L1);
		F1.add(TF1);
		F1.add(L2);
		F1.add(TF2);
		
		
	}

}
