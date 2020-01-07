package EBooks;

import javax.swing.*;

public class Pdf{

    public Pdf(){	
    	PdfWin aud = new PdfWin();
        aud.setSize(480,388);
        aud.setResizable(false);
        aud.setLocation(450,150);
        aud.setTitle("Essential Phone Numbers");
        aud.initGUI();
        aud.setVisible(true);
    }
}