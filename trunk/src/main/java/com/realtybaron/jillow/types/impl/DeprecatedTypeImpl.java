/*
 * XML Type:  DeprecatedType
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.DeprecatedType
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML DeprecatedType(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlString.
 */
public class DeprecatedTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.realtybaron.jillow.types.DeprecatedType {
  public DeprecatedTypeImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType, true);
  }
  protected DeprecatedTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b) {
    super(sType, b);
  }
  private static final javax.xml.namespace.QName DEPRECATED$0 = new javax.xml.namespace.QName("", "deprecated");
  /**
   * Gets the "deprecated" attribute
   */
  public boolean getDeprecated() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DEPRECATED$0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_default_attribute_value(DEPRECATED$0);
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
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_attribute_user(DEPRECATED$0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlBoolean) get_default_attribute_value(DEPRECATED$0);
      }
      return target;
    }
  }
  /**
   * Sets the "deprecated" attribute
   */
  public void setDeprecated(boolean deprecated) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(DEPRECATED$0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(DEPRECATED$0);
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
      target = (org.apache.xmlbeans.XmlBoolean) get_store().find_attribute_user(DEPRECATED$0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlBoolean) get_store().add_attribute_user(DEPRECATED$0);
      }
      target.set(deprecated);
    }
  }
}
