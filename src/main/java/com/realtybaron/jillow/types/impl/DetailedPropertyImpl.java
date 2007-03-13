/*
 * XML Type:  DetailedProperty
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.DetailedProperty
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML DetailedProperty(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class DetailedPropertyImpl extends com.realtybaron.jillow.types.impl.SimplePropertyImpl implements com.realtybaron.jillow.types.DetailedProperty {
  public DetailedPropertyImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName REGIONS$0 = new javax.xml.namespace.QName("", "regions");
  /**
   * Gets the "regions" element
   */
  public com.realtybaron.jillow.types.Regions getRegions() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Regions target = null;
      target = (com.realtybaron.jillow.types.Regions) get_store().find_element_user(REGIONS$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "regions" element
   */
  public void setRegions(com.realtybaron.jillow.types.Regions regions) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Regions target = null;
      target = (com.realtybaron.jillow.types.Regions) get_store().find_element_user(REGIONS$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Regions) get_store().add_element_user(REGIONS$0);
      }
      target.set(regions);
    }
  }
  /**
   * Appends and returns a new empty "regions" element
   */
  public com.realtybaron.jillow.types.Regions addNewRegions() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Regions target = null;
      target = (com.realtybaron.jillow.types.Regions) get_store().add_element_user(REGIONS$0);
      return target;
    }
  }
}
