/*
 * An XML document type.
 * Localname: zestimate
 * Namespace: http://www.zillow.com/static/xsd/Zestimate.xsd
 * Java type: com.realtybaron.jillow.zestimate.ZestimateDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.zestimate.impl;

/**
 * A document containing one zestimate(@http://www.zillow.com/static/xsd/Zestimate.xsd) element.
 * <p/>
 * This is a complex type.
 */
public class ZestimateDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.zestimate.ZestimateDocument {
  public ZestimateDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName ZESTIMATE$0 = new javax.xml.namespace.QName(
      "http://www.zillow.com/static/xsd/Zestimate.xsd",
      "zestimate");
  /**
   * Gets the "zestimate" element
   */
  public com.realtybaron.jillow.zestimate.ZestimateResultType getZestimate() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType) get_store().find_element_user(ZESTIMATE$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "zestimate" element
   */
  public void setZestimate(com.realtybaron.jillow.zestimate.ZestimateResultType zestimate) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType) get_store().find_element_user(ZESTIMATE$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.zestimate.ZestimateResultType) get_store().add_element_user(ZESTIMATE$0);
      }
      target.set(zestimate);
    }
  }
  /**
   * Appends and returns a new empty "zestimate" element
   */
  public com.realtybaron.jillow.zestimate.ZestimateResultType addNewZestimate() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType) get_store().add_element_user(ZESTIMATE$0);
      return target;
    }
  }
}
