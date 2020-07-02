package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.Adder;
import gui.WindowFrame;
import gui.viewer;

public class addbutton implements ActionListener{
WindowFrame frame;
	
	public addbutton(WindowFrame frame) {
		this.frame=frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b= (JButton) e.getSource(); 
		Adder adder = frame.getAdder();
		frame.setupPanel(adder);
		
	}
}
