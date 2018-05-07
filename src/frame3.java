
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame3 extends JFrame {
    private JLabel Add = new JLabel("華氏度:");
    private JLabel Less = new JLabel("攝氏度");
    private JLabel Acc = new JLabel("-17");
    private JButton Exit = new JButton("Exit");
    private JButton  lab = new JButton("=");
    private JTextField lat =new JTextField("0");
    public  frame3(){
        init();
    }
    private  void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(Add);
        this.add(Less);
        this.add(Exit);
        this.add(lab);
        this.add(lat);
        this.add(Acc);
        this.setLocation(100,50);
        this.setSize(1280,960);
        Add.setLocation(440,130);
        Add.setSize(150,50);
        Less.setLocation(890,130);
        Less.setSize(150,50);
        Acc.setLocation(950,130);
        Acc.setSize(150,50);
        Exit.setLocation(790,230);
        Exit.setSize(150,50);
        lab.setLocation(740,130);
        lab.setSize(150,50);
        lat.setBounds(590,130,150,50);
        lab.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             Acc.setText(Integer.toString((Integer.parseInt(lat.getText())-32)*5/9));
        }
        });
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(EXIT_ON_CLOSE);
            }
        });
    }
}