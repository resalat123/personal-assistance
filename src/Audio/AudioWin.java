package Audio;

import javax.swing.*;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class AudioWin extends JFrame implements ActionListener {

	public AudioWin() {
		super();
	}
	JTextField[] jtf = new JTextField[3];
	Font font1 = new Font("Georgia", Font.BOLD, 14);
	JButton[] text = new JButton[15];

	public JButton newJF() {
		JButton textF = new JButton();
		textF.setBackground(Color.decode("#05beca"));
		textF.setForeground(Color.decode("#FFFFFF"));
		textF.setFont(font1);
		return textF;
	}
	
	public JTextField newJTF(){
    	JTextField textF=new JTextField();
        textF.setEditable(false);
        textF.setBackground(Color.decode("#05beca"));
        textF.setForeground(Color.decode("#FFFFFF"));
        textF.setFont(font1);
        textF.setHorizontalAlignment(JTextField.CENTER);
        return textF;
    }

	public void initGUI() {

		super.setLayout(null);
		for(int i=0; i<3; i++){
			jtf[i]=newJTF();
			super.add(jtf[i]);
		}
		jtf[0].setFont(new Font("Tahoma",Font.BOLD,20));
		jtf[0].setText("My Audios");
		jtf[0].setBounds(0,0,480,60);
		jtf[1].setBounds(15, 80, 210, 40);
		jtf[2].setBounds(249, 80, 210, 40);
		jtf[1].setText("MP3");
		jtf[2].setText("MP4");
		for (int i = 0; i < 12; i++)
			text[i] = newJF();
		text[2].setBounds(45, 130, 150, 35);
		text[3].setBounds(279, 130, 150, 35);
		text[4].setBounds(45, 175, 150, 35);
		text[5].setBounds(279, 175, 150, 35);
		text[6].setBounds(45, 220, 150, 35);
		text[7].setBounds(279, 220, 150, 35);
		text[8].setBounds(45, 265, 150, 35);
		text[9].setBounds(279, 265, 150, 35);
		text[10].setBounds(45, 310, 150, 35);
		text[11].setBounds(279, 310, 150, 35);
		for (int i = 2; i < 12; i++) {
			if(i%2==0)
				text[i].setText("MP3 #" + i/2);
			else
				text[i].setText("MP4 #" + i/2);
			super.add(text[i]);
			text[i].addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == text[2]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio1.mp3");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[3]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio2.mp4");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[4]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio3.mp3");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[5]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio4.mp4");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[6]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio5.mp3");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[7]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio6.mp4");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[8]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio7.mp3");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[9]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio8.mp4");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[10]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio9.mp3");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		else if (e.getSource() == text[11]) {
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "audios\\audio10.mp4");
			} 
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
