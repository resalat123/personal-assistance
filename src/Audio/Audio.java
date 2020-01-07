package Audio;

import javax.swing.*;

public class Audio{

    public Audio(){	
    	AudioWin aud = new AudioWin();
        aud.setSize(480,388);
        aud.setResizable(false);
        aud.setLocation(450,150);
        aud.setTitle("My Audios");
        aud.initGUI();
        aud.setVisible(true);
    }
}