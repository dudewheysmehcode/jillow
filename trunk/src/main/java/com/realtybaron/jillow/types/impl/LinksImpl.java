/*
 * XML Type:  Links
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Links
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Links(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class LinksImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Links {
  public LinksImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName HOMEDETAILS$0 = new javax.xml.namespace.QName("", "homedetails");
  private static final javax.xml.namespace.QName GRAPHSANDDATA$2 = new javax.xml.namespace.QName("", "graphsanddata");
  private static final javax.xml.namespace.QName MAPTHISHOME$4 = new javax.xml.namespace.QName("", "mapthishome");
  private static final javax.xml.namespace.QName MYESTIMATOR$6 = new javax.xml.namespace.QName("", "myestimator");
  private static final javax.xml.namespace.QName MYZESTIMATOR$8 = new javax.xml.namespace.QName("", "myzestimator");
  /**
   * Gets the "homedetails" element
   */
  public java.lang.String getHomedetails() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HOMEDETAILS$0, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "homedetails" element
   */
  public org.apache.xmlbeans.XmlString xgetHomedetails() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HOMEDETAILS$0, 0);
      return target;
    }
  }
  /**
   * Sets the "homedetails" element
   */
  public void setHomedetails(java.lang.String homedetails) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HOMEDETAILS$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(HOMEDETAILS$0);
      }
      target.setStringValue(homedetails);
    }
  }
  /**
   * Sets (as xml) the "homedetails" element
   */
  public void xsetHomedetails(org.apache.xmlbeans.XmlString homedetails) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HOMEDETAILS$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(HOMEDETAILS$0);
      }
      target.set(homedetails);
    }
  }
  /**
   * Gets the "graphsanddata" element
   */
  public java.lang.String getGraphsanddata() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(GRAPHSANDDATA$2, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "graphsanddata" element
   */
  public org.apache.xmlbeans.XmlString xgetGraphsanddata() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(GRAPHSANDDATA$2, 0);
      return target;
    }
  }
  /**
   * Sets the "graphsanddata" element
   */
  public void setGraphsanddata(java.lang.String graphsanddata) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(GRAPHSANDDATA$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(GRAPHSANDDATA$2);
      }
      target.setStringValue(graphsanddata);
    }
  }
  /**
   * Sets (as xml) the "graphsanddata" element
   */
  public void xsetGraphsanddata(org.apache.xmlbeans.XmlString graphsanddata) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(GRAPHSANDDATA$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(GRAPHSANDDATA$2);
      }
      target.set(graphsanddata);
    }
  }
  /**
   * Gets the "mapthishome" element
   */
  public java.lang.String getMapthishome() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MAPTHISHOME$4, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "mapthishome" element
   */
  public org.apache.xmlbeans.XmlString xgetMapthishome() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(MAPTHISHOME$4, 0);
      return target;
    }
  }
  /**
   * Sets the "mapthishome" element
   */
  public void setMapthishome(java.lang.String mapthishome) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MAPTHISHOME$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(MAPTHISHOME$4);
      }
      target.setStringValue(mapthishome);
    }
  }
  /**
   * Sets (as xml) the "mapthishome" element
   */
  public void xsetMapthishome(org.apache.xmlbeans.XmlString mapthishome) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(MAPTHISHOME$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(MAPTHISHOME$4);
      }
      target.set(mapthishome);
    }
  }
  /**
   * Gets the "myestimator" element
   */
  public java.lang.String getMyestimator() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MYESTIMATOR$6, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "myestimator" element
   */
  public org.apache.xmlbeans.XmlString xgetMyestimator() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(MYESTIMATOR$6, 0);
      return target;
    }
  }
  /**
   * Sets the "myestimator" element
   */
  public void setMyestimator(java.lang.String myestimator) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(MYESTIMATOR$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(MYESTIMATOR$6);
      }
      target.setStringValue(myestimator);
    }
  }
  /**
   * Sets (as xml) the "myestimator" element
   */
  public void xsetMyestimator(org.apache.xmlbeans.XmlString myestimator) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(MYESTIMATOR$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(MYESTIMATOR$6);
      }
      target.set(myestimator);
    }
  }
  /**
   * Gets the "myzestimator" element
   */
  public com.realtybaron.jillow.types.DeprecatedType getMyzestimator() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DeprecatedType target = null;
      target = (com.realtybaron.jillow.types.DeprecatedType) get_store().find_element_user(MYZESTIMATOR$8, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "myzestimator" element
   */
  public void setMyzestimator(com.realtybaron.jillow.types.DeprecatedType myzestimator) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DeprecatedType target = null;
      target = (com.realtybaron.jillow.types.DeprecatedType) get_store().find_element_user(MYZESTIMATOR$8, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.DeprecatedType) get_store().add_element_user(MYZESTIMATOR$8);
      }
      target.set(myzestimator);
    }
  }
  /**
   * Appends and returns a new empty "myzestimator" element
   */
  public com.realtybaron.jillow.types.DeprecatedType addNewMyzestimator() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.DeprecatedType target = null;
      target = (com.realtybaron.jillow.types.DeprecatedType) get_store().add_element_user(MYZESTIMATOR$8);
      return target;
    }
  }
}
