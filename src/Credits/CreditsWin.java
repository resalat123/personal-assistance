package Credits;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class CreditsWin extends JFrame{

	public CreditsWin() {
		super();
	}
	JTextField[] jl = new JTextField[10];
	Font font1 = new Font("Courier", Font.BOLD, 20);

	public JTextField newJTF(){
    	JTextField textF=new JTextField();
        textF.setEditable(false);
        textF.setBackground(Color.decode("#000000"));
        textF.setForeground(Color.decode("#00CCCC"));
        textF.setFont(font1);
        textF.setHorizontalAlignment(JTextField.CENTER);
        return textF;
    }

	public void initGUI(){
		super.setLayout(null);
		for(int i=0; i<10; i++)
			jl[i]=newJTF();
		jl[0].setBounds(90,50,300,35);
		jl[0].setText("Developed By");
		jl[1].setBounds(90,110,300,35);
		jl[1].setText("M. A. Muhiminul Islam");
		jl[2].setBounds(90,160,300,35);
		jl[2].setText("1521781642");
		jl[3].setBounds(90,210,300,35);
		jl[3].setText("Mehedy Hasan");
		jl[4].setBounds(90,260,300,35);
		jl[4].setText("1521214642");
		super.add(jl[0]);
		super.add(jl[1]);
		super.add(jl[2]);
		super.add(jl[3]);
		super.add(jl[4]);
	}
}
