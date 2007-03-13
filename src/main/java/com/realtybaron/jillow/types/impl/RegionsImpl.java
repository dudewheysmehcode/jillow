/*
 * XML Type:  Regions
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Regions
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Regions(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class RegionsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Regions {
  public RegionsImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName ZIPCODEID$0 = new javax.xml.namespace.QName("", "zipcode-id");
  private static final javax.xml.namespace.QName CITYID$2 = new javax.xml.namespace.QName("", "city-id");
  private static final javax.xml.namespace.QName COUNTYID$4 = new javax.xml.namespace.QName("", "county-id");
  private static final javax.xml.namespace.QName STATEID$6 = new javax.xml.namespace.QName("", "state-id");
  /**
   * Gets the "zipcode-id" element
   */
  public java.math.BigInteger getZipcodeId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIPCODEID$0, 0);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "zipcode-id" element
   */
  public org.apache.xmlbeans.XmlInteger xgetZipcodeId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(ZIPCODEID$0, 0);
      return target;
    }
  }
  /**
   * Sets the "zipcode-id" element
   */
  public void setZipcodeId(java.math.BigInteger zipcodeId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIPCODEID$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZIPCODEID$0);
      }
      target.setBigIntegerValue(zipcodeId);
    }
  }
  /**
   * Sets (as xml) the "zipcode-id" element
   */
  public void xsetZipcodeId(org.apache.xmlbeans.XmlInteger zipcodeId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(ZIPCODEID$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_element_user(ZIPCODEID$0);
      }
      target.set(zipcodeId);
    }
  }
  /**
   * Gets the "city-id" element
   */
  public java.math.BigInteger getCityId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITYID$2, 0);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "city-id" element
   */
  public org.apache.xmlbeans.XmlInteger xgetCityId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(CITYID$2, 0);
      return target;
    }
  }
  /**
   * Sets the "city-id" element
   */
  public void setCityId(java.math.BigInteger cityId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITYID$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CITYID$2);
      }
      target.setBigIntegerValue(cityId);
    }
  }
  /**
   * Sets (as xml) the "city-id" element
   */
  public void xsetCityId(org.apache.xmlbeans.XmlInteger cityId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(CITYID$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_element_user(CITYID$2);
      }
      target.set(cityId);
    }
  }
  /**
   * Gets the "county-id" element
   */
  public java.math.BigInteger getCountyId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COUNTYID$4, 0);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "county-id" element
   */
  public org.apache.xmlbeans.XmlInteger xgetCountyId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(COUNTYID$4, 0);
      return target;
    }
  }
  /**
   * Sets the "county-id" element
   */
  public void setCountyId(java.math.BigInteger countyId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COUNTYID$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(COUNTYID$4);
      }
      target.setBigIntegerValue(countyId);
    }
  }
  /**
   * Sets (as xml) the "county-id" element
   */
  public void xsetCountyId(org.apache.xmlbeans.XmlInteger countyId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(COUNTYID$4, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_element_user(COUNTYID$4);
      }
      target.set(countyId);
    }
  }
  /**
   * Gets the "state-id" element
   */
  public java.math.BigInteger getStateId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATEID$6, 0);
      if (target == null) {
        return null;
      }
      return target.getBigIntegerValue();
    }
  }
  /**
   * Gets (as xml) the "state-id" element
   */
  public org.apache.xmlbeans.XmlInteger xgetStateId() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(STATEID$6, 0);
      return target;
    }
  }
  /**
   * Sets the "state-id" element
   */
  public void setStateId(java.math.BigInteger stateId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATEID$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(STATEID$6);
      }
      target.setBigIntegerValue(stateId);
    }
  }
  /**
   * Sets (as xml) the "state-id" element
   */
  public void xsetStateId(org.apache.xmlbeans.XmlInteger stateId) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlInteger target = null;
      target = (org.apache.xmlbeans.XmlInteger) get_store().find_element_user(STATEID$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlInteger) get_store().add_element_user(STATEID$6);
      }
      target.set(stateId);
    }
  }
}
