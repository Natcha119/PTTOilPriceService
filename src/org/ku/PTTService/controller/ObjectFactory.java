
package org.ku.PTTService.controller;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pttplc.ptt_webservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pttplc.ptt_webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOilPrice }
     * 
     */
    public GetOilPrice createGetOilPrice() {
        return new GetOilPrice();
    }

    /**
     * Create an instance of {@link GetOilPriceResponse }
     * 
     */
    public GetOilPriceResponse createGetOilPriceResponse() {
        return new GetOilPriceResponse();
    }

    /**
     * Create an instance of {@link CurrentOilPriceResponse }
     * 
     */
    public CurrentOilPriceResponse createCurrentOilPriceResponse() {
        return new CurrentOilPriceResponse();
    }

    /**
     * Create an instance of {@link CurrentOilPrice }
     * 
     */
    public CurrentOilPrice createCurrentOilPrice() {
        return new CurrentOilPrice();
    }

}
