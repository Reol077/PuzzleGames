package ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    //游戏主界面

    public GameJFrame() {
        initJFrame();

        initJMenuBar();
        //显示窗口
        this.setVisible(true);

    }

    private void initJMenuBar() {
        //初始化菜单
        JMenuBar jMenuBar = new JMenuBar();

        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
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
    }

}
