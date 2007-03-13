/*
 * XML Type:  AmountOptional
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.AmountOptional
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML AmountOptional(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlString.
 */
public class AmountOptionalImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.realtybaron.jillow.types.AmountOptional {
  public AmountOptionalImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType, true);
  }
  protected AmountOptionalImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
    super(sType, b);
  }
  private static final javax.xml.namespace.QName CURRENCY$0 = new javax.xml.namespace.QName("", "currency");
  private static final javax.xml.namespace.QName DURATION$2 = new javax.xml.namespace.QName("", "duration");
  private static final javax.xml.namespace.QName DEPRECATED$4 = new javax.xml.namespace.QName("", "deprecated");
  /**
   * Gets the "currency" attribute
   */
  public com.realtybaron.jillow.types.Currency.Enum getCurrency() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(CURRENCY$0);
      if (target == null) {
        return null;
      }
      return (com.realtybaron.jillow.types.Currency.Enum) target.getEnumValue();
    }
  }
  /**
   * Gets (as xml) the "currency" attribute
   */
  public com.realtybaron.jillow.types.Currency xgetCurrency() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Currency target = null;
      target = (com.realtybaron.jillow.types.Currency) get_store().find_attribute_user(CURRENCY$0);
      return target;
    }
  }
  /**
   * True if has "currency" attribute
   */
  public boolean isSetCurrency() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().find_attribute_user(CURRENCY$0) != null;
    }
  }
  /**
   * Sets the "currency" attribute
   */
  public void setCurrency(com.realtybaron.jillow.types.Currency.Enum currency) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(CURRENCY$0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(CURRENCY$0);
      }
      target.setEnumValue(currency);
    }
  }
  /**
   * Sets (as xml) the "currency" attribute
   */
  public void xsetCurrency(com.realtybaron.jillow.types.Currency currency) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Currency target = null;
      target = (com.realtybaron.jillow.types.Currency) get_store().find_attribute_user(CURRENCY$0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Currency) get_store().add_attribute_user(CURRENCY$0);
      }
      target.set(currency);
    }
  }
  /**
   * Unsets the "currency" attribute
   */
  public void unsetCurrency() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_attribute(CURRENCY$0);
    }
  }
  /**
   * Gets the "duration" attribute
   */
  public java.math.BigInteger getDuration() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DURATION$2);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "duration" attribute
   */
  public org.apache.xmlbeans.XmlInteger xgetDuration() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_attribute_user(DURATION$2);
      return target;
    }
  }
  /**
   * True if has "duration" attribute
   */
  public boolean isSetDuration() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().find_attribute_user(DURATION$2) != null;
    }
  }
  /**
   * Sets the "duration" attribute
   */
  public void setDuration(java.math.BigInteger duration) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DURATION$2);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(DURATION$2);
      }
      target.setBigIntegerValue(duration);
    }
  }
  /**
   * Sets (as xml) the "duration" attribute
   */
  public void xsetDuration(org.apache.xmlbeans.XmlInteger duration) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_attribute_user(DURATION$2);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_attribute_user(DURATION$2);
      }
      target.set(duration);
    }
  }
  /**
   * Unsets the "duration" attribute
   */
  public void unsetDuration() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_attribute(DURATION$2);
    }
  }
  /**
   * Gets the "deprecated" attribute
   */
  public boolean getDeprecated() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DEPRECATED$4);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_default_attribute_value(DEPRECATED$4);
      }
      if (target == null) {
        return false;
      }
      return target.getBooleanValue();
    }
  }
  /**
   * Gets (as xml) the "deprecated" attribute
   */
  public org.apache.xmlbeans.XmlBoolean xgetDeprecated() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlBoolean target = null;
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_attribute_user(DEPRECATED$4);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlBoolean) get_default_attribute_value(DEPRECATED$4);
      }
      return target;
    }
  }
  /**
   * True if has "deprecated" attribute
   */
  public boolean isSetDeprecated() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().find_attribute_user(DEPRECATED$4) != null;
    }
  }
  /**
   * Sets the "deprecated" attribute
   */
  public void setDeprecated(boolean deprecated) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DEPRECATED$4);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(DEPRECATED$4);
      }
      target.setBooleanValue(deprecated);
    }
  }
  /**
   * Sets (as xml) the "deprecated" attribute
   */
  public void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlBoolean target = null;
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_attribute_user(DEPRECATED$4);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlBoolean) get_store().add_attribute_user(DEPRECATED$4);
      }
      target.set(deprecated);
    }
  }
  /**
   * Unsets the "deprecated" attribute
   */
  public void unsetDeprecated() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_attribute(DEPRECATED$4);
    }
  }
}
