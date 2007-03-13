/*
 * XML Type:  SimpleProperty
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.SimpleProperty
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML SimpleProperty(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class SimplePropertyImpl extends com.realtybaron.jillow.types.impl.PropertyImpl implements com.realtybaron.jillow.types.SimpleProperty {
  public SimplePropertyImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName ZESTIMATE$0 = new javax.xml.namespace.QName("", "zestimate");
  /**
   * Gets the "zestimate" element
   */
  public com.realtybaron.jillow.types.Zestimate getZestimate() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate target = null;
      target = (com.realtybaron.jillow.types.Zestimate) get_store().find_element_user(ZESTIMATE$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "zestimate" element
   */
  public void setZestimate(com.realtybaron.jillow.types.Zestimate zestimate) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate target = null;
      target = (com.realtybaron.jillow.types.Zestimate) get_store().find_element_user(ZESTIMATE$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Zestimate) get_store().add_element_user(ZESTIMATE$0);
      }
      target.set(zestimate);
    }
  }
  /**
   * Appends and returns a new empty "zestimate" element
   */
  public com.realtybaron.jillow.types.Zestimate addNewZestimate() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate target = null;
      target = (com.realtybaron.jillow.types.Zestimate) get_store().add_element_user(ZESTIMATE$0);
      return target;
    }
  }
}
