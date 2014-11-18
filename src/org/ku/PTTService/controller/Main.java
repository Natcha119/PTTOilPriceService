package org.ku.PTTService.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.xml.ws.WebServiceException;

import org.ku.PTTService.view.OilPriceView;

/*
 * Class to run the output as Desktop application
 * by initial Model side together with View side.
 * @author Natcha Chidchob 5510546026
 * @version 18.11.14
 */
public class Main {
	/**Interface of this application.*/
	private static OilPriceView view;
	public static void main(String[] args){
		Timer t = null;
		while(true){
			try{
				t = new Timer(5000, new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent arg0) {
						createAlertBox();
					}
				});
				t.start();
				Reader reader = new Reader(); 
				reader.readContext();
				view = new OilPriceView(reader);
				view.run();
				t.stop();
				return;
			}
			catch(WebServiceException e){
				createAlertBox();
				t.stop();
			}
			
		}
	}
	
	/*
	 * Create DialogBox for application when losing
	 * connection with service like when there is
	 * have internet connection problem.
	 */
	private static void createAlertBox() {
		Object[] options = {"Retry",
    	"Exit"};
		int n = JOptionPane.showOptionDialog(view,
				"Service cannot be contacted,\n please check internet connection.",
				"Attention",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE,
				null,
				options,
				options[1]);
		if(n == JOptionPane.NO_OPTION){
			System.exit(0);
		}
	}
}
