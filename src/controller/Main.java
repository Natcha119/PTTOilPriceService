package controller;

import View.OilPriceView;

/*
 * Class to run the output as Desktop application
 * by initial Model side together with View side.
 * @author Natcha Chidchob 5510546026
 */
public class Main {
	public static void main(String[] args){
		Reader reader = new Reader(); 
		reader.readContext();
		OilPriceView view = new OilPriceView(reader);
		view.run();
	}
}
