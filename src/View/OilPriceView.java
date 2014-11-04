package View;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.DataAccess;
import controller.Reader;

/**
 * This class generate the view of Current oil price
 * Desktop application and let it interactive with user
 * by user interface
 * @author Natcha Chidchob 5510546026
 *
 */
public class OilPriceView extends JFrame {
	/**The current reader*/
	private Reader reader;
	/**Panel that contain all component*/
	private JPanel bigPane;
	/**The top panel with title*/
	private JPanel topPane;
	/**Panel where we choose product*/
	private JPanel productPane;
	/**Panel to show about price*/
	private JPanel pricePane;
	/**Panel of update area*/
	private JPanel updatePane;
	/**Title*/
	private JLabel titleLabel;
	/**Product name*/
	private JLabel productLabel;
	/**Where to choose product name*/
	private JComboBox oilName;
	/**The price*/
	private JLabel priceLabel;
	/**Oil price*/
	private JLabel price;
	/**Thai currency*/
	private JLabel bathLabel;
	/**Update*/
	private JLabel updateLabel;
	/**Update price time*/
	private JLabel time;
	
	/*
	 * Initial frame and use current reader
	 * @param r current reader
	 */
	public OilPriceView(Reader r){
		super("Oil Price");
		this.reader = r;
		initComponent();
	}

	/*
	 * Initial view component
	 */
	private void initComponent() {
		bigPane = new JPanel();
		bigPane.setLayout(new BoxLayout(bigPane,BoxLayout.Y_AXIS));
		createTilte();
		createProduct();
		createPrice();
		createUpdate();
		add(bigPane);
	}

	/*
	 * Build The title area
	 */
	private void createTilte() {
		topPane = new JPanel();
		titleLabel= new JLabel("PTT Current Oil Price");
		titleLabel.setFont(new Font("Serif", Font.BOLD,20));
		
		topPane.add(titleLabel);
		bigPane.add(topPane);
	}
	
	/*
	 * Make up choosing product zone
	 */
	private void createProduct() {
		productPane = new JPanel();
		productPane.setLayout(new BoxLayout(productPane, BoxLayout.X_AXIS));
		
		productLabel = new JLabel("Product      ");
		productLabel.setFont(new Font("Serif", Font.BOLD,16));
		
		oilName = new JComboBox(reader.getDataAccess().toArray());
		oilName.setMaximumSize(new Dimension(250,70));
		oilName.addActionListener (new ActionListener () {
		    public void actionPerformed(ActionEvent e) {
		    	DataAccess access = (DataAccess)oilName.getSelectedItem();
		    	if(access.getPrice() == 0)
		    		price.setText(" - ");
		    	else
		    		price.setText(access.getPrice()+"");
		    	time.setText("  :    "+access.getDate());
		    }
		});
			
		productPane.add(productLabel);
		productPane.add(oilName);
		bigPane.add(productPane);
	}
	
	/*
	 * Build the area to show oil price.
	 */
	private void createPrice() {
		pricePane = new JPanel();
		pricePane.setLayout(new BoxLayout(pricePane, BoxLayout.X_AXIS));
		priceLabel = new JLabel("Price        ");
		price = new JLabel(reader.getDataAccess().get(0).getPrice()+"");
		price.setFont(new Font("Serif", Font.BOLD,18));
		bathLabel = new JLabel("        Baht");

		pricePane.add(priceLabel);
		pricePane.add(price);
		pricePane.add(bathLabel);
		bigPane.add(pricePane);
	}
	
	/*
	 * Build area to show update time
	 */
	private void createUpdate() {
		updatePane = new JPanel();
		updatePane.setLayout(new BoxLayout(updatePane, BoxLayout.X_AXIS));
		updateLabel = new JLabel("Update");
		updateLabel.setFont(new Font("Serif", Font.BOLD,14));
		time = new JLabel("  :    "+reader.getDataAccess().get(0).getDate());
		
		updatePane.add(updateLabel);
		updatePane.add(time);
		bigPane.add(updatePane);
	}

	/*
	 * Run up the application
	 */
	public void run(){
		pack();
		setVisible(true);
		setSize(450, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
