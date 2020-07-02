package listener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.WindowFrame;
import gui.viewer;

public class viewbutton implements ActionListener{
	
	WindowFrame frame;
	
	public viewbutton(WindowFrame frame) {
		this.frame=frame;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b= (JButton) e.getSource(); 
		viewer view = frame.getView();
		frame.setupPanel(view);
		
	}
	
}
