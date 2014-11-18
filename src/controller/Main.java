package controller;

import javax.swing.JOptionPane;
import javax.xml.ws.WebServiceException;

import view.OilPriceView;

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
		while(true){
			try{
				Reader reader = new Reader(); 
				reader.readContext();
				view = new OilPriceView(reader);
				view.run();
				return;
			}
			catch(WebServiceException e){
				createAlertBox();
			}
		}
	}
	
	/*
	 * Create DialogBox for application when losing
	 * connection with service like when there is
	 * no internet connection.
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
