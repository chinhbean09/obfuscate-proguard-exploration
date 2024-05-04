import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SimpleGUI extends JFrame {
    private JLabel a;

    private JTextArea a;

    private JScrollPane a;

    private JTextField a;

    private JButton a = (JButton)new JLabel( SimpleGUI v0.001 );

    private JButton b;

    private JButton c;

    private JButton d;

    public SimpleGUI() {
        super(SimpleGUI v0.001);
        this.a = (JButton)new JTextArea();
        this.a = (JButton)new JScrollPane(this.a);
        this.a = (JButton)new JTextField(30);
        this.a = new JButton(Add, new ImageIcon(iconsadd.gif));
        this.b = new JButton(Reset, new ImageIcon(iconsreset.gif));
        this.c = new JButton(About, new ImageIcon(iconshelp.gif));
        this.d = new JButton(Exit, new ImageIcon(iconsexit.png));
        setDefaultCloseOperation(3);
        setLayout(new BorderLayout());
        JPanel jPanel1 = new JPanel(new BorderLayout());
        JPanel jPanel2 = new JPanel(new FlowLayout(1));
        JPanel jPanel3 = new JPanel(new FlowLayout(1));
        JPanel jPanel4 = new JPanel(new FlowLayout(1));
        JPanel jPanel5 = new JPanel(new FlowLayout(1));
        simpleGUI.a.setFont(new Font(Monotype Corsiva, 1, 36));
        jPanel2.add(simpleGUI.a);
        jPanel3.add(new JLabel(Input ));
        jPanel3.add(simpleGUI.a);
        jPanel4.add(simpleGUI.a);
        jPanel4.add(simpleGUI.b);
        jPanel4.add(simpleGUI.c);
        jPanel4.add(simpleGUI.d);
        jPanel5.add(jPanel3);
        jPanel5.add(new JLabel(    ));
        jPanel5.add(jPanel4);
        jPanel1.add(jPanel2, North);
        jPanel1.add(simpleGUI.a, Center);
        jPanel1.add(jPanel5, South);
        simpleGUI.a.addActionListener(paramActionEvent - {
                SimpleGUI simpleGUI;
        (simpleGUI = this).a.append(simpleGUI.a.getText() + n);
        });
        simpleGUI.b.addActionListener(paramActionEvent - this.a.setText());
        simpleGUI.c.addActionListener(paramActionEvent - JOptionPane.showMessageDialog(this, SimpleGUI v0.001nby Moose, About ..., 1));
        simpleGUI.d.addActionListener(paramActionEvent - {
                System.out.println(Exiting application ... have a nice day !);
        System.exit(0);
        });
        SimpleGUI simpleGUI;
        (simpleGUI = this).add(jPanel1, Center);
    }

    public static void main(String[] paramArrayOfString) {
        SimpleGUI simpleGUI;
        (simpleGUI = new SimpleGUI()).setDefaultCloseOperation(3);
        simpleGUI.setLocation(15, 15);
        simpleGUI.setSize(950, 550);
        simpleGUI.setVisible(true);
    }
}
