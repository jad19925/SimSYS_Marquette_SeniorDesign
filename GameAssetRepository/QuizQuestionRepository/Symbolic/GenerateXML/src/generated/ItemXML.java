//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.21 at 05:26:42 PM PST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Item_XML complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Item_XML">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="path_list" type="{}Path_List"/>
 *         &lt;element name="item_list" type="{}ItemList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item_XML", propOrder = {
    "pathList",
    "itemList"
})
public class ItemXML {

    @XmlElement(name = "path_list", required = true)
    protected PathList pathList;
    @XmlElement(name = "item_list", required = true)
    protected ItemList itemList;

    /**
     * Gets the value of the pathList property.
     * 
     * @return
     *     possible object is
     *     {@link PathList }
     *     
     */
    public PathList getPathList() {
        return pathList;
    }

    /**
     * Sets the value of the pathList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathList }
     *     
     */
    public void setPathList(PathList value) {
        this.pathList = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemList }
     *     
     */
    public ItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemList }
     *     
     */
    public void setItemList(ItemList value) {
        this.itemList = value;
    }

}