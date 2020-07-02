package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class viewer extends JPanel{
	
	WindowFrame frame;
	
	public viewer(WindowFrame frame) {
		
		this.frame= frame;
		
		DefaultTableModel model =new  DefaultTableModel();
		model.addColumn("name");
		model.addColumn("amount");
		model.addColumn("period");
		model.addColumn("target");
		//String column [] = {"name", "amount","period","target" };
		JTable table = new JTable (model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
	}
	
}
