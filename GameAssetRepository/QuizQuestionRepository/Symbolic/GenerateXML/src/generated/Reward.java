//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.21 at 05:26:42 PM PST 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Reward complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reward">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="correct" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="partially_correct" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="incorrect" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reward", propOrder = {
    "correct",
    "partiallyCorrect",
    "incorrect"
})
public class Reward {

    @XmlElement(required = true)
    protected BigInteger correct;
    @XmlElement(name = "partially_correct", required = true)
    protected BigInteger partiallyCorrect;
    @XmlElement(required = true)
    protected BigInteger incorrect;

    /**
     * Gets the value of the correct property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCorrect() {
        return correct;
    }

    /**
     * Sets the value of the correct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCorrect(BigInteger value) {
        this.correct = value;
    }

    /**
     * Gets the value of the partiallyCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartiallyCorrect() {
        return partiallyCorrect;
    }

    /**
     * Sets the value of the partiallyCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartiallyCorrect(BigInteger value) {
        this.partiallyCorrect = value;
    }

    /**
     * Gets the value of the incorrect property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIncorrect() {
        return incorrect;
    }

    /**
     * Sets the value of the incorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIncorrect(BigInteger value) {
        this.incorrect = value;
    }

}
