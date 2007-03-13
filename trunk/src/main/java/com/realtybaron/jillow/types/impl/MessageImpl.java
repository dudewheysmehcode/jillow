/*
 * XML Type:  Message
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Message
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Message(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class MessageImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Message {
  public MessageImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName TEXT$0 = new javax.xml.namespace.QName("", "text");
  private static final javax.xml.namespace.QName CODE$2 = new javax.xml.namespace.QName("", "code");
  private static final javax.xml.namespace.QName LIMITWARNING$4 = new javax.xml.namespace.QName("", "limit-warning");
  /**
   * Gets the "text" element
   */
  public java.lang.String getText() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TEXT$0, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "text" element
   */
  public org.apache.xmlbeans.XmlString xgetText() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TEXT$0, 0);
      return target;
    }
  }
  /**
   * Sets the "text" element
   */
  public void setText(java.lang.String text) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TEXT$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(TEXT$0);
      }
      target.setStringValue(text);
    }
  }
  /**
   * Sets (as xml) the "text" element
   */
  public void xsetText(org.apache.xmlbeans.XmlString text) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TEXT$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(TEXT$0);
      }
      target.set(text);
    }
  }
  /**
   * Gets the "code" element
   */
  public java.math.BigInteger getCode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CODE$2, 0);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "code" element
   */
  public org.apache.xmlbeans.XmlInteger xgetCode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(CODE$2, 0);
      return target;
    }
  }
  /**
   * Sets the "code" element
   */
  public void setCode(java.math.BigInteger code) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CODE$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CODE$2);
      }
      target.setBigIntegerValue(code);
    }
  }
  /**
   * Sets (as xml) the "code" element
   */
  public void xsetCode(org.apache.xmlbeans.XmlInteger code) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(CODE$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_element_user(CODE$2);
      }
      target.set(code);
    }
  }
  /**
   * Gets the "limit-warning" element
   */
  public boolean getLimitWarning() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LIMITWARNING$4, 0);
      if (target == null) {
        return false;
      }
      return target.getBooleanValue();
    }
  }
  /**
   * Gets (as xml) the "limit-warning" element
   */
  public org.apache.xmlbeans.XmlBoolean xgetLimitWarning() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlBoolean target = null;
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_element_user(LIMITWARNING$4, 0);
      return target;
    }
  }
  /**
   * True if has "limit-warning" element
   */
  public boolean isSetLimitWarning() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(LIMITWARNING$4) != 0;
    }
  }
  /**
   * Sets the "limit-warning" element
   */
  public void setLimitWarning(boolean limitWarning) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LIMITWARNING$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LIMITWARNING$4);
      }
      target.setBooleanValue(limitWarning);
    }
  }
  /**
   * Sets (as xml) the "limit-warning" element
   */
  public void xsetLimitWarning(org.apache.xmlbeans.XmlBoolean limitWarning) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlBoolean target = null;
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_element_user(LIMITWARNING$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlBoolean) get_store().add_element_user(LIMITWARNING$4);
      }
      target.set(limitWarning);
    }
  }
  /**
   * Unsets the "limit-warning" element
   */
  public void unsetLimitWarning() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(LIMITWARNING$4, 0);
    }
  }
}
