package org.ku.PTTService.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * This class is work as object of PTT_DS
 * which is the root of xml
 * and it also contain DataAccess.
 * @author Natcha Chidchob 5510546026
 *
 */
@XmlRootElement(name="PTT_DS")
@XmlAccessorType(XmlAccessType.FIELD)
public class PTT_DS {
	
		/**The DataAccess that contain oil price*/
		@XmlElement(name = "DataAccess")
		/**List of all DataAccess*/
		private List<DataAccess> dataAccess;
		
		public PTT_DS(){}

		public List<DataAccess> getDataAccess() {
			return dataAccess;
		}
}
