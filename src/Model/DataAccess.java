package Model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * The DataAcces that contain the detail
 * of oil and its price.
 * @author Natcha Chidchob 5510546026
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class DataAccess {
	/**Date when changing or update oil price*/
	@XmlElement(name = "PRICE_DATE")
	private String date;
	/**The name of oil product.*/
	@XmlElement(name = "PRODUCT")
	private String product;
	/**Price of oil per litre*/
	@XmlElement(name = "PRICE")
	private double price;
	
	public DataAccess(){}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return getProduct();
	}
	
}
