/*
 * XML Type:  zestimateResultType
 * Namespace: http://www.zillow.com/static/xsd/Zestimate.xsd
 * Java type: com.realtybaron.jillow.zestimate.ZestimateResultType
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.zestimate.impl;

/**
 * An XML zestimateResultType(@http://www.zillow.com/static/xsd/Zestimate.xsd).
 * <p/>
 * This is a complex type.
 */
public class ZestimateResultTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.zestimate.ZestimateResultType {
  public ZestimateResultTypeImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName REQUEST$0 = new javax.xml.namespace.QName("", "request");
  private static final javax.xml.namespace.QName MESSAGE$2 = new javax.xml.namespace.QName("", "message");
  private static final javax.xml.namespace.QName RESPONSE$4 = new javax.xml.namespace.QName("", "response");
  /**
   * Gets the "request" element
   */
  public com.realtybaron.jillow.zestimate.ZestimateResultType.Request getRequest() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType.Request target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) get_store().find_element_user(REQUEST$0,
                                                                                                            0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "request" element
   */
  public void setRequest(com.realtybaron.jillow.zestimate.ZestimateResultType.Request request) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType.Request target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) get_store().find_element_user(REQUEST$0,
                                                                                                            0);
      if (target == null) {
        target = (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) get_store().add_element_user(REQUEST$0);
      }
      target.set(request);
    }
  }
  /**
   * Appends and returns a new empty "request" element
   */
  public com.realtybaron.jillow.zestimate.ZestimateResultType.Request addNewRequest() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.zestimate.ZestimateResultType.Request target = null;
      target = (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) get_store().add_element_user(REQUEST$0);
      return target;
    }
  }
  /**
   * Gets the "message" element
   */
  public com.realtybaron.jillow.types.Message getMessage() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Message target = null;
      target = (com.realtybaron.jillow.types.Message) get_store().find_element_user(MESSAGE$2, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "message" element
   */
  public void setMessage(com.realtybaron.jillow.types.Message message) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Message target = null;
      target = (com.realtybaron.jillow.types.Message) get_store().find_element_user(MESSAGE$2, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Message) get_store().add_element_user(MESSAGE$2);
      }
      target.set(message);
    }
  }
  /**
   * Appends and returns a new empty "message" element
   */
  public com.realtybaron.jillow.types.Message addNewMessage() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Message target = null;
      target = (com.realtybaron.jillow.types.Message) get_store().add_element_user(MESSAGE$2);
      return target;
    }
  }
  /**
   * Gets the "response" element
   */
  public com.realtybaron.jillow.types.DetailedProperty getResponse() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DetailedProperty target = null;
      target = (com.realtybaron.jillow.types.DetailedProperty) get_store().find_element_user(RESPONSE$4, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * True if has "response" element
   */
  public boolean isSetResponse() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(RESPONSE$4) != 0;
    }
  }
  /**
   * Sets the "response" element
   */
  public void setResponse(com.realtybaron.jillow.types.DetailedProperty response) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DetailedProperty target = null;
      target = (com.realtybaron.jillow.types.DetailedProperty) get_store().find_element_user(RESPONSE$4, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.DetailedProperty) get_store().add_element_user(RESPONSE$4);
      }
      target.set(response);
    }
  }
  /**
   * Appends and returns a new empty "response" element
   */
  public com.realtybaron.jillow.types.DetailedProperty addNewResponse() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DetailedProperty target = null;
      target = (com.realtybaron.jillow.types.DetailedProperty) get_store().add_element_user(RESPONSE$4);
      return target;
    }
  }
  /**
   * Unsets the "response" element
   */
  public void unsetResponse() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(RESPONSE$4, 0);
    }
  }
  /**
   * An XML request(@).
   * <p/>
   * This is a complex type.
   */
  public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.zestimate.ZestimateResultType.Request {
    public RequestImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName ZPID$0 = new javax.xml.namespace.QName("", "zpid");
    /**
     * Gets the "zpid" element
     */
    public java.lang.String getZpid() {
      synchronized (monitor()) {
        check_orphaned();
        org.apache.xmlbeans.SimpleValue target = null;
        target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
        if (target == null) {
          return null;
        }
        return target.getStringValue();
      }
    }
    /**
     * Gets (as xml) the "zpid" element
     */
    public org.apache.xmlbeans.XmlString xgetZpid() {
      synchronized (monitor()) {
        check_orphaned();
        org.apache.xmlbeans.XmlString target = null;
        target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZPID$0, 0);
        return target;
      }
    }
    /**
     * Sets the "zpid" element
     */
    public void setZpid(java.lang.String zpid) {
      synchronized (monitor()) {
        check_orphaned();
        org.apache.xmlbeans.SimpleValue target = null;
        target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
        if (target == null) {
          target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZPID$0);
        }
        target.setStringValue(zpid);
      }
    }
    /**
     * Sets (as xml) the "zpid" element
     */
    public void xsetZpid(org.apache.xmlbeans.XmlString zpid) {
      synchronized (monitor()) {
        check_orphaned();
        org.apache.xmlbeans.XmlString target = null;
        target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZPID$0, 0);
        if (target == null) {
          target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(ZPID$0);
        }
        target.set(zpid);
      }
    }
  }
}
