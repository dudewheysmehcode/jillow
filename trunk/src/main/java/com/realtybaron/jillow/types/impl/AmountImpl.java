/*
 * XML Type:  Amount
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Amount
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Amount(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlInteger.
 */
public class AmountImpl extends org.apache.xmlbeans.impl.values.JavaIntegerHolderEx implements com.realtybaron.jillow.types.Amount {
  public AmountImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType, true);
  }
  protected AmountImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
    super(sType, b);
  }
  private static final javax.xml.namespace.QName CURRENCY$0 = new javax.xml.namespace.QName("", "currency");
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
}
