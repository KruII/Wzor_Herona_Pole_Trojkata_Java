import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.*;

public class App implements ActionListener {
    private static JTextField boka;
    private static JTextField bokb;
    private static JTextField bokc;
    private static JLabel pprosto;
    public static void main(String[] args) throws Exception {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame("Wzor Herona");
    frame.setSize(1000, 1000);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(true);
    panel.setLayout(null);
	panel.setBounds(150,150,200,200);
    panel.setBackground(new Color(150,150,150));
    JLabel label1 = new JLabel("Pole Trojkata");
    label1.setBounds(425,20,150,25);
    panel.add(label1);

    JLabel label2 = new JLabel("Bok a:");
    label2.setBounds(400,50,100,25);
    panel.add(label2);

    boka = new JTextField(20);
    boka.setBounds(450, 50, 60, 25);
    panel.add(boka);
    
    JLabel b = new JLabel("Bok b:");
    b.setBounds(400,80,100,25);
    panel.add(b);

    bokb = new JTextField(20);
    bokb.setBounds(450, 80, 60, 25);
    panel.add(bokb);

    JLabel c = new JLabel("Bok c:");
    c.setBounds(400,110,100,25);
    panel.add(c);

    bokc = new JTextField(20);
    bokc.setBounds(450, 110, 60, 25);
    panel.add(bokc);
    
    pprosto = new JLabel("");
    pprosto.setBounds(300, 170, 200, 25);
    panel.add(pprosto);
    
    JButton sprosto = new JButton("Oblicz");
    sprosto.setBounds(425, 140, 100, 25);
    sprosto.addActionListener(new App());
    panel.add(sprosto);

	frame.add(panel);
    frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int abok = Integer.parseInt(boka.getText());
        int bbok = Integer.parseInt(bokb.getText());
        int cbok = Integer.parseInt(bokc.getText());
        double p1 = (0.5)*(abok+bbok+cbok);
        System.out.println(abok+" "+bbok+" "+cbok+" "+p1);
        if(((p1-abok>0)&&(p1-bbok>0))&&(p1-cbok>0)){
            double DuzeP = sqrt(p1*(p1-abok)*(p1-bbok)*(p1-cbok));
            pprosto.setText("Pole wynosi: "+DuzeP);
        }
        else{
            pprosto.setText("Nie istnieje");
        }
    }
}