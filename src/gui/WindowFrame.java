package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	menuselection selection;
	

	Adder adder ;
	viewer view;
	
	public WindowFrame() {
		
		this.selection=new menuselection(this);
		this.adder =new Adder(this);
		this.view = new viewer(this);
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		this.setupPanel(selection);
		
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	public menuselection getSelection() {
		return selection;
	}

	public void setSelection(menuselection selection) {
		this.selection = selection;
	}

	public Adder getAdder() {
		return adder;
	}

	public void setAdder(Adder adder) {
		this.adder = adder;
	}

	public viewer getView() {
		return view;
	}

	public void setView(viewer view) {
		this.view = view;
	}
	
}
