//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.12.21 at 05:26:42 PM PST 
//


package generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Question_List complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Question_List">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="question" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="question_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="topic_list" type="{}Topic_List"/>
 *                   &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="timer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="timer_event_list" type="{}Timer_Event_List"/>
 *                   &lt;element name="max_no_of_attempts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="reward" type="{}Reward"/>
 *                   &lt;element name="stem_lead-in_questions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="option_list" type="{}Option_List"/>
 *                   &lt;element name="follow_up" type="{}Follow_Up"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Question_List", propOrder = {
    "question"
})
public class QuestionList {

    @XmlElement(required = true)
    protected List<QuestionList.Question> question;

    /**
     * Gets the value of the question property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the question property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuestionList.Question }
     * 
     * 
     */
    public List<QuestionList.Question> getQuestion() {
        if (question == null) {
            question = new ArrayList<QuestionList.Question>();
        }
        return this.question;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="question_id" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="topic_list" type="{}Topic_List"/>
     *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="timer" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="timer_event_list" type="{}Timer_Event_List"/>
     *         &lt;element name="max_no_of_attempts" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="reward" type="{}Reward"/>
     *         &lt;element name="stem_lead-in_questions" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="option_list" type="{}Option_List"/>
     *         &lt;element name="follow_up" type="{}Follow_Up"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "questionId",
        "topicList",
        "depth",
        "timer",
        "timerEventList",
        "maxNoOfAttempts",
        "reward",
        "stemLeadInQuestions",
        "optionList",
        "followUp"
    })
    public static class Question {

        @XmlElement(name = "question_id", required = true)
        protected BigInteger questionId;
        @XmlElement(name = "topic_list", required = true)
        protected TopicList topicList;
        @XmlElement(required = true)
        protected String depth;
        @XmlElement(required = true)
        protected BigInteger timer;
        @XmlElement(name = "timer_event_list", required = true)
        protected TimerEventList timerEventList;
        @XmlElement(name = "max_no_of_attempts", required = true)
        protected BigInteger maxNoOfAttempts;
        @XmlElement(required = true)
        protected Reward reward;
        @XmlElement(name = "stem_lead-in_questions", required = true)
        protected String stemLeadInQuestions;
        @XmlElement(name = "option_list", required = true)
        protected OptionList optionList;
        @XmlElement(name = "follow_up", required = true)
        protected FollowUp followUp;

        /**
         * Gets the value of the questionId property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getQuestionId() {
            return questionId;
        }

        /**
         * Sets the value of the questionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setQuestionId(BigInteger value) {
            this.questionId = value;
        }

        /**
         * Gets the value of the topicList property.
         * 
         * @return
         *     possible object is
         *     {@link TopicList }
         *     
         */
        public TopicList getTopicList() {
            return topicList;
        }

        /**
         * Sets the value of the topicList property.
         * 
         * @param value
         *     allowed object is
         *     {@link TopicList }
         *     
         */
        public void setTopicList(TopicList value) {
            this.topicList = value;
        }

        /**
         * Gets the value of the depth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepth() {
            return depth;
        }

        /**
         * Sets the value of the depth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepth(String value) {
            this.depth = value;
        }

        /**
         * Gets the value of the timer property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTimer() {
            return timer;
        }

        /**
         * Sets the value of the timer property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTimer(BigInteger value) {
            this.timer = value;
        }

        /**
         * Gets the value of the timerEventList property.
         * 
         * @return
         *     possible object is
         *     {@link TimerEventList }
         *     
         */
        public TimerEventList getTimerEventList() {
            return timerEventList;
        }

        /**
         * Sets the value of the timerEventList property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimerEventList }
         *     
         */
        public void setTimerEventList(TimerEventList value) {
            this.timerEventList = value;
        }

        /**
         * Gets the value of the maxNoOfAttempts property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxNoOfAttempts() {
            return maxNoOfAttempts;
        }

        /**
         * Sets the value of the maxNoOfAttempts property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxNoOfAttempts(BigInteger value) {
            this.maxNoOfAttempts = value;
        }

        /**
         * Gets the value of the reward property.
         * 
         * @return
         *     possible object is
         *     {@link Reward }
         *     
         */
        public Reward getReward() {
            return reward;
        }

        /**
         * Sets the value of the reward property.
         * 
         * @param value
         *     allowed object is
         *     {@link Reward }
         *     
         */
        public void setReward(Reward value) {
            this.reward = value;
        }

        /**
         * Gets the value of the stemLeadInQuestions property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStemLeadInQuestions() {
            return stemLeadInQuestions;
        }

        /**
         * Sets the value of the stemLeadInQuestions property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStemLeadInQuestions(String value) {
            this.stemLeadInQuestions = value;
        }

        /**
         * Gets the value of the optionList property.
         * 
         * @return
         *     possible object is
         *     {@link OptionList }
         *     
         */
        public OptionList getOptionList() {
            return optionList;
        }

        /**
         * Sets the value of the optionList property.
         * 
         * @param value
         *     allowed object is
         *     {@link OptionList }
         *     
         */
        public void setOptionList(OptionList value) {
            this.optionList = value;
        }

        /**
         * Gets the value of the followUp property.
         * 
         * @return
         *     possible object is
         *     {@link FollowUp }
         *     
         */
        public FollowUp getFollowUp() {
            return followUp;
        }

        /**
         * Sets the value of the followUp property.
         * 
         * @param value
         *     allowed object is
         *     {@link FollowUp }
         *     
         */
        public void setFollowUp(FollowUp value) {
            this.followUp = value;
        }

    }

}
