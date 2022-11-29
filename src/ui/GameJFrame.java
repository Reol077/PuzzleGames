package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏主界面

    public GameJFrame(){
        this.setSize(603,680);
        this.setTitle("拼图单机版 v1.0");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
    }

}
