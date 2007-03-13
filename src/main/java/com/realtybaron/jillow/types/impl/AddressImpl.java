/*
 * XML Type:  Address
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Address
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Address(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class AddressImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Address {
  public AddressImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName STREET$0 = new javax.xml.namespace.QName("", "street");
  private static final javax.xml.namespace.QName ZIPCODE$2 = new javax.xml.namespace.QName("", "zipcode");
  private static final javax.xml.namespace.QName CITY$4 = new javax.xml.namespace.QName("", "city");
  private static final javax.xml.namespace.QName STATE$6 = new javax.xml.namespace.QName("", "state");
  private static final javax.xml.namespace.QName LATITUDE$8 = new javax.xml.namespace.QName("", "latitude");
  private static final javax.xml.namespace.QName LONGITUDE$10 = new javax.xml.namespace.QName("", "longitude");
  /**
   * Gets the "street" element
   */
  public java.lang.String getStreet() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STREET$0, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "street" element
   */
  public org.apache.xmlbeans.XmlString xgetStreet() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STREET$0, 0);
      return target;
    }
  }
  /**
   * Sets the "street" element
   */
  public void setStreet(java.lang.String street) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STREET$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(STREET$0);
      }
      target.setStringValue(street);
    }
  }
  /**
   * Sets (as xml) the "street" element
   */
  public void xsetStreet(org.apache.xmlbeans.XmlString street) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STREET$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(STREET$0);
      }
      target.set(street);
    }
  }
  /**
   * Gets the "zipcode" element
   */
  public java.lang.String getZipcode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIPCODE$2, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "zipcode" element
   */
  public org.apache.xmlbeans.XmlString xgetZipcode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZIPCODE$2, 0);
      return target;
    }
  }
  /**
   * Sets the "zipcode" element
   */
  public void setZipcode(java.lang.String zipcode) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIPCODE$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZIPCODE$2);
      }
      target.setStringValue(zipcode);
    }
  }
  /**
   * Sets (as xml) the "zipcode" element
   */
  public void xsetZipcode(org.apache.xmlbeans.XmlString zipcode) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZIPCODE$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(ZIPCODE$2);
      }
      target.set(zipcode);
    }
  }
  /**
   * Gets the "city" element
   */
  public java.lang.String getCity() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITY$4, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "city" element
   */
  public org.apache.xmlbeans.XmlString xgetCity() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITY$4, 0);
      return target;
    }
  }
  /**
   * Sets the "city" element
   */
  public void setCity(java.lang.String city) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITY$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CITY$4);
      }
      target.setStringValue(city);
    }
  }
  /**
   * Sets (as xml) the "city" element
   */
  public void xsetCity(org.apache.xmlbeans.XmlString city) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITY$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(CITY$4);
      }
      target.set(city);
    }
  }
  /**
   * Gets the "state" element
   */
  public java.lang.String getState() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATE$6, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "state" element
   */
  public org.apache.xmlbeans.XmlString xgetState() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STATE$6, 0);
      return target;
    }
  }
  /**
   * Sets the "state" element
   */
  public void setState(java.lang.String state) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATE$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(STATE$6);
      }
      target.setStringValue(state);
    }
  }
  /**
   * Sets (as xml) the "state" element
   */
  public void xsetState(org.apache.xmlbeans.XmlString state) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STATE$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(STATE$6);
      }
      target.set(state);
    }
  }
  /**
   * Gets the "latitude" element
   */
  public java.math.BigDecimal getLatitude() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LATITUDE$8, 0);
      if (target == null) {
        return null;
      }
      return target.getBigDecimalValue();
    }
  }
  /**
   * Gets (as xml) the "latitude" element
   */
  public org.apache.xmlbeans.XmlDecimal xgetLatitude() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_element_user(LATITUDE$8, 0);
      return target;
    }
  }
  /**
   * Sets the "latitude" element
   */
  public void setLatitude(java.math.BigDecimal latitude) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LATITUDE$8, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LATITUDE$8);
      }
      target.setBigDecimalValue(latitude);
    }
  }
  /**
   * Sets (as xml) the "latitude" element
   */
  public void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_element_user(LATITUDE$8, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlDecimal) get_store().add_element_user(LATITUDE$8);
      }
      target.set(latitude);
    }
  }
  /**
   * Gets the "longitude" element
   */
  public java.math.BigDecimal getLongitude() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LONGITUDE$10, 0);
      if (target == null) {
        return null;
      }
      return target.getBigDecimalValue();
    }
  }
  /**
   * Gets (as xml) the "longitude" element
   */
  public org.apache.xmlbeans.XmlDecimal xgetLongitude() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_element_user(LONGITUDE$10, 0);
      return target;
    }
  }
  /**
   * Sets the "longitude" element
   */
  public void setLongitude(java.math.BigDecimal longitude) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LONGITUDE$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LONGITUDE$10);
      }
      target.setBigDecimalValue(longitude);
    }
  }
  /**
   * Sets (as xml) the "longitude" element
   */
  public void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_element_user(LONGITUDE$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlDecimal) get_store().add_element_user(LONGITUDE$10);
      }
      target.set(longitude);
    }
  }
}
