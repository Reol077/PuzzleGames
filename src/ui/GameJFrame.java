package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏主界面

    public GameJFrame() {
        //窗口大小
        this.setSize(603, 680);
        //标题
        this.setTitle("拼图单机版 v1.0");
        //保持窗口前台
        this.setAlwaysOnTop(true);
        //页面居中
        this.setLocationRelativeTo(null);
        //关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu();
        JMenu aboutJMenu = new JMenu();
dvvf
        //显示窗口
        this.setVisible(true);
    }

}
