/*
 * XML Type:  Property
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Property
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Property(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class PropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Property {
  public PropertyImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName ZPID$0 = new javax.xml.namespace.QName("", "zpid");
  private static final javax.xml.namespace.QName LINKS$2 = new javax.xml.namespace.QName("", "links");
  private static final javax.xml.namespace.QName ADDRESS$4 = new javax.xml.namespace.QName("", "address");
  private static final javax.xml.namespace.QName FIPSCOUNTY$6 = new javax.xml.namespace.QName("", "FIPScounty");
  private static final javax.xml.namespace.QName USECODE$8 = new javax.xml.namespace.QName("", "useCode");
  private static final javax.xml.namespace.QName TAXASSESSMENTYEAR$10 = new javax.xml.namespace.QName("",
                                                                                                      "taxAssessmentYear");
  private static final javax.xml.namespace.QName TAXASSESSMENT$12 = new javax.xml.namespace.QName("", "taxAssessment");
  private static final javax.xml.namespace.QName YEARBUILT$14 = new javax.xml.namespace.QName("", "yearBuilt");
  private static final javax.xml.namespace.QName LOTSIZESQFT$16 = new javax.xml.namespace.QName("", "lotSizeSqFt");
  private static final javax.xml.namespace.QName FINISHEDSQFT$18 = new javax.xml.namespace.QName("", "finishedSqFt");
  private static final javax.xml.namespace.QName BATHROOMS$20 = new javax.xml.namespace.QName("", "bathrooms");
  private static final javax.xml.namespace.QName BEDROOMS$22 = new javax.xml.namespace.QName("", "bedrooms");
  private static final javax.xml.namespace.QName TOTALROOMS$24 = new javax.xml.namespace.QName("", "totalRooms");
  private static final javax.xml.namespace.QName LASTSOLDDATE$26 = new javax.xml.namespace.QName("", "lastSoldDate");
  private static final javax.xml.namespace.QName LASTSOLDPRICE$28 = new javax.xml.namespace.QName("", "lastSoldPrice");
  /**
   * Gets the "zpid" element
   */
  public long getZpid() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
      if (target == null) {
        return 0L;
      }
      return target.getLongValue();
    }
  }
  /**
   * Gets (as xml) the "zpid" element
   */
  public org.apache.xmlbeans.XmlUnsignedInt xgetZpid() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlUnsignedInt target = null;
      target = (org.apache.xmlbeans.XmlUnsignedInt) get_store().find_element_user(ZPID$0, 0);
      return target;
    }
  }
  /**
   * Sets the "zpid" element
   */
  public void setZpid(long zpid) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZPID$0);
      }
      target.setLongValue(zpid);
    }
  }
  /**
   * Sets (as xml) the "zpid" element
   */
  public void xsetZpid(org.apache.xmlbeans.XmlUnsignedInt zpid) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlUnsignedInt target = null;
      target = (org.apache.xmlbeans.XmlUnsignedInt) get_store().find_element_user(ZPID$0, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlUnsignedInt) get_store().add_element_user(ZPID$0);
      }
      target.set(zpid);
    }
  }
  /**
   * Gets the "links" element
   */
  public com.realtybaron.jillow.types.Links getLinks() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Links target = null;
      target = (com.realtybaron.jillow.types.Links) get_store().find_element_user(LINKS$2, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "links" element
   */
  public void setLinks(com.realtybaron.jillow.types.Links links) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Links target = null;
      target = (com.realtybaron.jillow.types.Links) get_store().find_element_user(LINKS$2, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Links) get_store().add_element_user(LINKS$2);
      }
      target.set(links);
    }
  }
  /**
   * Appends and returns a new empty "links" element
   */
  public com.realtybaron.jillow.types.Links addNewLinks() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Links target = null;
      target = (com.realtybaron.jillow.types.Links) get_store().add_element_user(LINKS$2);
      return target;
    }
  }
  /**
   * Gets the "address" element
   */
  public com.realtybaron.jillow.types.Address getAddress() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Address target = null;
      target = (com.realtybaron.jillow.types.Address) get_store().find_element_user(ADDRESS$4, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "address" element
   */
  public void setAddress(com.realtybaron.jillow.types.Address address) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Address target = null;
      target = (com.realtybaron.jillow.types.Address) get_store().find_element_user(ADDRESS$4, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Address) get_store().add_element_user(ADDRESS$4);
      }
      target.set(address);
    }
  }
  /**
   * Appends and returns a new empty "address" element
   */
  public com.realtybaron.jillow.types.Address addNewAddress() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Address target = null;
      target = (com.realtybaron.jillow.types.Address) get_store().add_element_user(ADDRESS$4);
      return target;
    }
  }
  /**
   * Gets the "FIPScounty" element
   */
  public java.lang.String getFIPScounty() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(FIPSCOUNTY$6, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "FIPScounty" element
   */
  public org.apache.xmlbeans.XmlString xgetFIPScounty() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(FIPSCOUNTY$6, 0);
      return target;
    }
  }
  /**
   * True if has "FIPScounty" element
   */
  public boolean isSetFIPScounty() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(FIPSCOUNTY$6) != 0;
    }
  }
  /**
   * Sets the "FIPScounty" element
   */
  public void setFIPScounty(java.lang.String fipScounty) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(FIPSCOUNTY$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(FIPSCOUNTY$6);
      }
      target.setStringValue(fipScounty);
    }
  }
  /**
   * Sets (as xml) the "FIPScounty" element
   */
  public void xsetFIPScounty(org.apache.xmlbeans.XmlString fipScounty) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(FIPSCOUNTY$6, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(FIPSCOUNTY$6);
      }
      target.set(fipScounty);
    }
  }
  /**
   * Unsets the "FIPScounty" element
   */
  public void unsetFIPScounty() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(FIPSCOUNTY$6, 0);
    }
  }
  /**
   * Gets the "useCode" element
   */
  public java.lang.String getUseCode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(USECODE$8, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "useCode" element
   */
  public org.apache.xmlbeans.XmlString xgetUseCode() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(USECODE$8, 0);
      return target;
    }
  }
  /**
   * True if has "useCode" element
   */
  public boolean isSetUseCode() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(USECODE$8) != 0;
    }
  }
  /**
   * Sets the "useCode" element
   */
  public void setUseCode(java.lang.String useCode) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(USECODE$8, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(USECODE$8);
      }
      target.setStringValue(useCode);
    }
  }
  /**
   * Sets (as xml) the "useCode" element
   */
  public void xsetUseCode(org.apache.xmlbeans.XmlString useCode) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(USECODE$8, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(USECODE$8);
      }
      target.set(useCode);
    }
  }
  /**
   * Unsets the "useCode" element
   */
  public void unsetUseCode() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(USECODE$8, 0);
    }
  }
  /**
   * Gets the "taxAssessmentYear" element
   */
  public java.lang.String getTaxAssessmentYear() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TAXASSESSMENTYEAR$10, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "taxAssessmentYear" element
   */
  public org.apache.xmlbeans.XmlString xgetTaxAssessmentYear() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TAXASSESSMENTYEAR$10, 0);
      return target;
    }
  }
  /**
   * True if has "taxAssessmentYear" element
   */
  public boolean isSetTaxAssessmentYear() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(TAXASSESSMENTYEAR$10) != 0;
    }
  }
  /**
   * Sets the "taxAssessmentYear" element
   */
  public void setTaxAssessmentYear(java.lang.String taxAssessmentYear) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TAXASSESSMENTYEAR$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(TAXASSESSMENTYEAR$10);
      }
      target.setStringValue(taxAssessmentYear);
    }
  }
  /**
   * Sets (as xml) the "taxAssessmentYear" element
   */
  public void xsetTaxAssessmentYear(org.apache.xmlbeans.XmlString taxAssessmentYear) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TAXASSESSMENTYEAR$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(TAXASSESSMENTYEAR$10);
      }
      target.set(taxAssessmentYear);
    }
  }
  /**
   * Unsets the "taxAssessmentYear" element
   */
  public void unsetTaxAssessmentYear() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(TAXASSESSMENTYEAR$10, 0);
    }
  }
  /**
   * Gets the "taxAssessment" element
   */
  public java.lang.String getTaxAssessment() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TAXASSESSMENT$12, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "taxAssessment" element
   */
  public org.apache.xmlbeans.XmlString xgetTaxAssessment() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TAXASSESSMENT$12, 0);
      return target;
    }
  }
  /**
   * True if has "taxAssessment" element
   */
  public boolean isSetTaxAssessment() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(TAXASSESSMENT$12) != 0;
    }
  }
  /**
   * Sets the "taxAssessment" element
   */
  public void setTaxAssessment(java.lang.String taxAssessment) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TAXASSESSMENT$12, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(TAXASSESSMENT$12);
      }
      target.setStringValue(taxAssessment);
    }
  }
  /**
   * Sets (as xml) the "taxAssessment" element
   */
  public void xsetTaxAssessment(org.apache.xmlbeans.XmlString taxAssessment) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TAXASSESSMENT$12, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(TAXASSESSMENT$12);
      }
      target.set(taxAssessment);
    }
  }
  /**
   * Unsets the "taxAssessment" element
   */
  public void unsetTaxAssessment() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(TAXASSESSMENT$12, 0);
    }
  }
  /**
   * Gets the "yearBuilt" element
   */
  public java.lang.String getYearBuilt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(YEARBUILT$14, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "yearBuilt" element
   */
  public org.apache.xmlbeans.XmlString xgetYearBuilt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(YEARBUILT$14, 0);
      return target;
    }
  }
  /**
   * True if has "yearBuilt" element
   */
  public boolean isSetYearBuilt() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(YEARBUILT$14) != 0;
    }
  }
  /**
   * Sets the "yearBuilt" element
   */
  public void setYearBuilt(java.lang.String yearBuilt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(YEARBUILT$14, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(YEARBUILT$14);
      }
      target.setStringValue(yearBuilt);
    }
  }
  /**
   * Sets (as xml) the "yearBuilt" element
   */
  public void xsetYearBuilt(org.apache.xmlbeans.XmlString yearBuilt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(YEARBUILT$14, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(YEARBUILT$14);
      }
      target.set(yearBuilt);
    }
  }
  /**
   * Unsets the "yearBuilt" element
   */
  public void unsetYearBuilt() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(YEARBUILT$14, 0);
    }
  }
  /**
   * Gets the "lotSizeSqFt" element
   */
  public java.lang.String getLotSizeSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LOTSIZESQFT$16, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "lotSizeSqFt" element
   */
  public org.apache.xmlbeans.XmlString xgetLotSizeSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LOTSIZESQFT$16, 0);
      return target;
    }
  }
  /**
   * True if has "lotSizeSqFt" element
   */
  public boolean isSetLotSizeSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(LOTSIZESQFT$16) != 0;
    }
  }
  /**
   * Sets the "lotSizeSqFt" element
   */
  public void setLotSizeSqFt(java.lang.String lotSizeSqFt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LOTSIZESQFT$16, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LOTSIZESQFT$16);
      }
      target.setStringValue(lotSizeSqFt);
    }
  }
  /**
   * Sets (as xml) the "lotSizeSqFt" element
   */
  public void xsetLotSizeSqFt(org.apache.xmlbeans.XmlString lotSizeSqFt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LOTSIZESQFT$16, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(LOTSIZESQFT$16);
      }
      target.set(lotSizeSqFt);
    }
  }
  /**
   * Unsets the "lotSizeSqFt" element
   */
  public void unsetLotSizeSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(LOTSIZESQFT$16, 0);
    }
  }
  /**
   * Gets the "finishedSqFt" element
   */
  public java.lang.String getFinishedSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(FINISHEDSQFT$18, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "finishedSqFt" element
   */
  public org.apache.xmlbeans.XmlString xgetFinishedSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(FINISHEDSQFT$18, 0);
      return target;
    }
  }
  /**
   * True if has "finishedSqFt" element
   */
  public boolean isSetFinishedSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(FINISHEDSQFT$18) != 0;
    }
  }
  /**
   * Sets the "finishedSqFt" element
   */
  public void setFinishedSqFt(java.lang.String finishedSqFt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(FINISHEDSQFT$18, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(FINISHEDSQFT$18);
      }
      target.setStringValue(finishedSqFt);
    }
  }
  /**
   * Sets (as xml) the "finishedSqFt" element
   */
  public void xsetFinishedSqFt(org.apache.xmlbeans.XmlString finishedSqFt) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(FINISHEDSQFT$18, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(FINISHEDSQFT$18);
      }
      target.set(finishedSqFt);
    }
  }
  /**
   * Unsets the "finishedSqFt" element
   */
  public void unsetFinishedSqFt() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(FINISHEDSQFT$18, 0);
    }
  }
  /**
   * Gets the "bathrooms" element
   */
  public java.lang.String getBathrooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(BATHROOMS$20, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "bathrooms" element
   */
  public org.apache.xmlbeans.XmlString xgetBathrooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(BATHROOMS$20, 0);
      return target;
    }
  }
  /**
   * True if has "bathrooms" element
   */
  public boolean isSetBathrooms() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(BATHROOMS$20) != 0;
    }
  }
  /**
   * Sets the "bathrooms" element
   */
  public void setBathrooms(java.lang.String bathrooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(BATHROOMS$20, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(BATHROOMS$20);
      }
      target.setStringValue(bathrooms);
    }
  }
  /**
   * Sets (as xml) the "bathrooms" element
   */
  public void xsetBathrooms(org.apache.xmlbeans.XmlString bathrooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(BATHROOMS$20, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(BATHROOMS$20);
      }
      target.set(bathrooms);
    }
  }
  /**
   * Unsets the "bathrooms" element
   */
  public void unsetBathrooms() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(BATHROOMS$20, 0);
    }
  }
  /**
   * Gets the "bedrooms" element
   */
  public java.lang.String getBedrooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(BEDROOMS$22, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "bedrooms" element
   */
  public org.apache.xmlbeans.XmlString xgetBedrooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(BEDROOMS$22, 0);
      return target;
    }
  }
  /**
   * True if has "bedrooms" element
   */
  public boolean isSetBedrooms() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(BEDROOMS$22) != 0;
    }
  }
  /**
   * Sets the "bedrooms" element
   */
  public void setBedrooms(java.lang.String bedrooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(BEDROOMS$22, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(BEDROOMS$22);
      }
      target.setStringValue(bedrooms);
    }
  }
  /**
   * Sets (as xml) the "bedrooms" element
   */
  public void xsetBedrooms(org.apache.xmlbeans.XmlString bedrooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(BEDROOMS$22, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(BEDROOMS$22);
      }
      target.set(bedrooms);
    }
  }
  /**
   * Unsets the "bedrooms" element
   */
  public void unsetBedrooms() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(BEDROOMS$22, 0);
    }
  }
  /**
   * Gets the "totalRooms" element
   */
  public java.lang.String getTotalRooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TOTALROOMS$24, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "totalRooms" element
   */
  public org.apache.xmlbeans.XmlString xgetTotalRooms() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TOTALROOMS$24, 0);
      return target;
    }
  }
  /**
   * True if has "totalRooms" element
   */
  public boolean isSetTotalRooms() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(TOTALROOMS$24) != 0;
    }
  }
  /**
   * Sets the "totalRooms" element
   */
  public void setTotalRooms(java.lang.String totalRooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(TOTALROOMS$24, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(TOTALROOMS$24);
      }
      target.setStringValue(totalRooms);
    }
  }
  /**
   * Sets (as xml) the "totalRooms" element
   */
  public void xsetTotalRooms(org.apache.xmlbeans.XmlString totalRooms) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(TOTALROOMS$24, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(TOTALROOMS$24);
      }
      target.set(totalRooms);
    }
  }
  /**
   * Unsets the "totalRooms" element
   */
  public void unsetTotalRooms() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(TOTALROOMS$24, 0);
    }
  }
  /**
   * Gets the "lastSoldDate" element
   */
  public java.lang.String getLastSoldDate() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LASTSOLDDATE$26, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "lastSoldDate" element
   */
  public org.apache.xmlbeans.XmlString xgetLastSoldDate() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LASTSOLDDATE$26, 0);
      return target;
    }
  }
  /**
   * True if has "lastSoldDate" element
   */
  public boolean isSetLastSoldDate() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(LASTSOLDDATE$26) != 0;
    }
  }
  /**
   * Sets the "lastSoldDate" element
   */
  public void setLastSoldDate(java.lang.String lastSoldDate) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LASTSOLDDATE$26, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LASTSOLDDATE$26);
      }
      target.setStringValue(lastSoldDate);
    }
  }
  /**
   * Sets (as xml) the "lastSoldDate" element
   */
  public void xsetLastSoldDate(org.apache.xmlbeans.XmlString lastSoldDate) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LASTSOLDDATE$26, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(LASTSOLDDATE$26);
      }
      target.set(lastSoldDate);
    }
  }
  /**
   * Unsets the "lastSoldDate" element
   */
  public void unsetLastSoldDate() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(LASTSOLDDATE$26, 0);
    }
  }
  /**
   * Gets the "lastSoldPrice" element
   */
  public com.realtybaron.jillow.types.Amount getLastSoldPrice() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(LASTSOLDPRICE$28, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * True if has "lastSoldPrice" element
   */
  public boolean isSetLastSoldPrice() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(LASTSOLDPRICE$28) != 0;
    }
  }
  /**
   * Sets the "lastSoldPrice" element
   */
  public void setLastSoldPrice(com.realtybaron.jillow.types.Amount lastSoldPrice) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(LASTSOLDPRICE$28, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(LASTSOLDPRICE$28);
      }
      target.set(lastSoldPrice);
    }
  }
  /**
   * Appends and returns a new empty "lastSoldPrice" element
   */
  public com.realtybaron.jillow.types.Amount addNewLastSoldPrice() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(LASTSOLDPRICE$28);
      return target;
    }
  }
  /**
   * Unsets the "lastSoldPrice" element
   */
  public void unsetLastSoldPrice() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(LASTSOLDPRICE$28, 0);
    }
  }
}
