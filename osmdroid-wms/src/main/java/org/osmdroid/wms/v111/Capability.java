//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 10:00:55 PM EST 
//


package org.osmdroid.wms.v111;

////import javax.xml.bind.annotation.XmlAccessType;
////import javax.xml.bind.annotation.XmlAccessorType;
////import javax.xml.bind.annotation.XmlElement;
////import javax.xml.bind.annotation.XmlRootElement;
////import javax.xml.bind.annotation.XmlType;


/**
 * 

//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "", propOrder = {
    "request",
    "exception",
    "vendorSpecificCapabilities",
    "userDefinedSymbolization",
    "layer"
})
//@XmlRootElement(name = "Capability") */
public class Capability {

    ////@XmlElement(name = "Request", required = true)
    protected Request request;
    ////@XmlElement(name = "Exception", required = true)
    protected Exception exception;
    ////@XmlElement(name = "VendorSpecificCapabilities")
    protected VendorSpecificCapabilities vendorSpecificCapabilities;
    ////@XmlElement(name = "UserDefinedSymbolization")
    protected UserDefinedSymbolization userDefinedSymbolization;
    ////@XmlElement(name = "Layer")
    protected Layer layer;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link Request }
     *     
     */
    public Request getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link Request }
     *     
     */
    public void setRequest(Request value) {
        this.request = value;
    }

    /**
     * Gets the value of the exception property.
     * 
     * @return
     *     possible object is
     *     {@link Exception }
     *     
     */
    public Exception getException() {
        return exception;
    }

    /**
     * Sets the value of the exception property.
     * 
     * @param value
     *     allowed object is
     *     {@link Exception }
     *     
     */
    public void setException(Exception value) {
        this.exception = value;
    }

    /**
     * Gets the value of the vendorSpecificCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSpecificCapabilities }
     *     
     */
    public VendorSpecificCapabilities getVendorSpecificCapabilities() {
        return vendorSpecificCapabilities;
    }

    /**
     * Sets the value of the vendorSpecificCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSpecificCapabilities }
     *     
     */
    public void setVendorSpecificCapabilities(VendorSpecificCapabilities value) {
        this.vendorSpecificCapabilities = value;
    }

    /**
     * Gets the value of the userDefinedSymbolization property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedSymbolization }
     *     
     */
    public UserDefinedSymbolization getUserDefinedSymbolization() {
        return userDefinedSymbolization;
    }

    /**
     * Sets the value of the userDefinedSymbolization property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedSymbolization }
     *     
     */
    public void setUserDefinedSymbolization(UserDefinedSymbolization value) {
        this.userDefinedSymbolization = value;
    }

    /**
     * Gets the value of the layer property.
     * 
     * @return
     *     possible object is
     *     {@link Layer }
     *     
     */
    public Layer getLayer() {
        return layer;
    }

    /**
     * Sets the value of the layer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Layer }
     *     
     */
    public void setLayer(Layer value) {
        this.layer = value;
    }

}