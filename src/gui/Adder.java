package gui;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

public class Adder extends JPanel {
	
	WindowFrame frame;

	public Adder (WindowFrame frame) {
		this.frame= frame;
		
		JPanel panel =new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelname = new JLabel ("ID :" , JLabel.TRAILING );
		JTextField fieldname = new JTextField(10);
		labelname.setLabelFor(fieldname);
		panel.add(labelname); 
		panel.add(fieldname);
		
		
		JLabel labelamount = new JLabel ("ID :" , JLabel.TRAILING );
		JTextField fieldamount = new JTextField(10);
		labelamount.setLabelFor(fieldamount);
		panel.add(labelamount);
		panel.add(fieldamount);
		
		JLabel labelperiod = new JLabel ("ID :" , JLabel.TRAILING );
		JTextField fieldperiod = new JTextField(10);
		labelperiod.setLabelFor(fieldperiod);
		panel.add(labelperiod);
		panel.add(fieldperiod);
		
		JLabel labeltarget = new JLabel ("ID :" , JLabel.TRAILING );
		JTextField fieldtarget = new JTextField(10);
		labeltarget.setLabelFor(fieldtarget);
		panel.add(labeltarget);
		panel.add(fieldtarget);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));
		SpringUtilities.makeCompactGrid(panel, 3,2,6,6,6,6);
		
		
		this.add(panel);
		this.setVisible(true);
		
	}
}
