package Video;

import javax.swing.*;

public class Video{

    public Video(){	
    	VideoWin vid = new VideoWin();
        vid.setSize(480,388);
        vid.setResizable(false);
        vid.setLocation(450,150);
        vid.setTitle("My Videos");
        vid.initGUI();
        vid.setVisible(true);
    }
} 