import javax.swing.*;

public class Level2 extends JFrame{
    private ImageIcon cardBack;

    private ImageIcon sun;
    private ImageIcon moon;
    private ImageIcon mercury;
    private ImageIcon venus;
    private ImageIcon earth;

    private ImageIcon mars;
    private ImageIcon jupiter;
    private ImageIcon saturn;
    private ImageIcon uranus;
    private ImageIcon neptune;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JLabel label14;
    private JLabel label15;
    private JLabel label16;
    private JLabel label17;
    private JLabel label18;
    private JLabel label19;
    private JLabel label20;

    public Level2(){
        cardBack = new ImageIcon("Pictures/cardBack.png");
        sun = new ImageIcon("Pictures/Sun.png");
        moon = new ImageIcon("Pictures/Moon.png");
        mercury = new ImageIcon("Pictures/Mercury.png");
        venus = new ImageIcon("Pictures/Venus.png");
        earth = new ImageIcon("Pictures/Earth.png");
        jupiter = new ImageIcon("Pictures/Jupiter.png");
        saturn = new ImageIcon("Pictures/Saturn.png");
        uranus = new ImageIcon("Pictures/Uranus.png");
        neptune = new ImageIcon("Pictures/Neptune.png");





        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(770, 950);
        this.setResizable(true);
        this.setVisible(true);
    }
}
