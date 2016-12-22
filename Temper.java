import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;


public class Temper extends JFrame implements ActionListener{
    private Container pane;
    private JButton bF, bC;
    private JTextField t;

    
    public Temper() {
    this.setTitle("My first GUI");
    this.setSize(600,100);
    this.setLocation(100,100);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

     pane = this.getContentPane();
     pane.setLayout(new BorderLayout());

     

     bF = new JButton("ConvertF");
     bF.addActionListener(this);
     bF.setActionCommand("ConvertF");
     bC = new JButton("ConvertC");
     bC.addActionListener(this);
     bC.setActionCommand("ConvertC");
     t = new JTextField(12);
     pane.add(bF, BorderLayout.PAGE_START);
     pane.add(bC, BorderLayout.PAGE_END);
     pane.add(t, BorderLayout.CENTER);
     
    }

    public void actionPerformed(ActionEvent e) {
	String event = e.getActionCommand();
	if (event.equals("ConvertF")) {
	    String s = t.getText();
	    int i = Integer.parseInt(s);
	    t.setText(Double.toString(CtoF(i)));
	}
	if (event.equals("ConvertC")) {
	    String s = t.getText();
	    int i = Integer.parseInt(s);
	    t.setText(Double.toString(FtoC(i)));
	}
    }

    public static double FtoC(double t) {
	return (t - 32) * 5/9;
    }

    public static double CtoF(double t) {
	return t * 9/5 + 32;
    }

    public static void main(String[] args) {
     Temper g = new Temper();
     g.setVisible(true);
  }
}
