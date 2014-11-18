package controller;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import model.DataAccess;
import model.PTT_DS;

/**
 * This class use for read out the XML
 * and parse it to the object(Unmarshall)
 * by using JAXB.
 * @author Natcha Chidchob 5510546026
 *
 */
public class Reader {
	/**The context of JAXB*/
	private JAXBContext context;
	/**Object who unmarshall XML*/
	private Unmarshaller unmarshaller;
	/**The PTT_DS object*/
	private PTT_DS ptt;
	/**String of xml which we get*/
	private String xml_str; 
	/**List of DataAccess object in this service*/
	private List<DataAccess> dataAccess;
	/**Oil information factory*/
	private PTTInfo factory;
	/**Soap of PTT oil service*/
	private PTTInfoSoap pttInfoSoap;
	
	/*
	 * Initial the Reader's component
	 */
	public Reader(){
		factory = new PTTInfo();
		pttInfoSoap = factory.getPTTInfoSoap();
		xml_str = pttInfoSoap.currentOilPrice("EN");
	}
	
	/*
	 * Read out xml and then parse it to object.
	 */
	public void readContext(){
		InputStream is = new ByteArrayInputStream(xml_str.getBytes());
		try {
			context = JAXBContext.newInstance(PTT_DS.class);
			unmarshaller = context.createUnmarshaller();
			ptt = (PTT_DS)unmarshaller.unmarshal(is);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		dataAccess = ptt.getDataAccess();
	}
	
	public List<DataAccess> getDataAccess(){
		return dataAccess;
	}
	
	public void setDataAccess(List<DataAccess> d){
		this.dataAccess = d;
	}
}
