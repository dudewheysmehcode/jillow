/*
 * XML Type:  Zestimate
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Zestimate
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML Zestimate(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class ZestimateImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Zestimate {
  public ZestimateImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName AMOUNT$0 = new javax.xml.namespace.QName("", "amount");
  private static final javax.xml.namespace.QName LASTUPDATED$2 = new javax.xml.namespace.QName("", "last-updated");
  private static final javax.xml.namespace.QName ONEWEEKCHANGE$4 = new javax.xml.namespace.QName("", "oneWeekChange");
  private static final javax.xml.namespace.QName VALUECHANGE$6 = new javax.xml.namespace.QName("", "valueChange");
  private static final javax.xml.namespace.QName VALUATIONRANGE$8 = new javax.xml.namespace.QName("", "valuationRange");
  private static final javax.xml.namespace.QName PERCENTILE$10 = new javax.xml.namespace.QName("", "percentile");
  /**
   * Gets the "amount" element
   */
  public com.realtybaron.jillow.types.Amount getAmount() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(AMOUNT$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "amount" element
   */
  public void setAmount(com.realtybaron.jillow.types.Amount amount) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(AMOUNT$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(AMOUNT$0);
      }
      target.set(amount);
    }
  }
  /**
   * Appends and returns a new empty "amount" element
   */
  public com.realtybaron.jillow.types.Amount addNewAmount() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Amount target = null;
      target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(AMOUNT$0);
      return target;
    }
  }
  /**
   * Gets the "last-updated" element
   */
  public java.lang.String getLastUpdated() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LASTUPDATED$2, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "last-updated" element
   */
  public org.apache.xmlbeans.XmlString xgetLastUpdated() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LASTUPDATED$2, 0);
      return target;
    }
  }
  /**
   * True if has "last-updated" element
   */
  public boolean isSetLastUpdated() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().count_elements(LASTUPDATED$2) != 0;
    }
  }
  /**
   * Sets the "last-updated" element
   */
  public void setLastUpdated(java.lang.String lastUpdated) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(LASTUPDATED$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(LASTUPDATED$2);
      }
      target.setStringValue(lastUpdated);
    }
  }
  /**
   * Sets (as xml) the "last-updated" element
   */
  public void xsetLastUpdated(org.apache.xmlbeans.XmlString lastUpdated) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(LASTUPDATED$2, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(LASTUPDATED$2);
      }
      target.set(lastUpdated);
    }
  }
  /**
   * Unsets the "last-updated" element
   */
  public void unsetLastUpdated() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_element(LASTUPDATED$2, 0);
    }
  }
  /**
   * Gets the "oneWeekChange" element
   */
  public com.realtybaron.jillow.types.AmountOptional getOneWeekChange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().find_element_user(ONEWEEKCHANGE$4, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "oneWeekChange" element
   */
  public void setOneWeekChange(com.realtybaron.jillow.types.AmountOptional oneWeekChange) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().find_element_user(ONEWEEKCHANGE$4, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.AmountOptional) get_store().add_element_user(ONEWEEKCHANGE$4);
      }
      target.set(oneWeekChange);
    }
  }
  /**
   * Appends and returns a new empty "oneWeekChange" element
   */
  public com.realtybaron.jillow.types.AmountOptional addNewOneWeekChange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().add_element_user(ONEWEEKCHANGE$4);
      return target;
    }
  }
  /**
   * Gets the "valueChange" element
   */
  public com.realtybaron.jillow.types.AmountOptional getValueChange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().find_element_user(VALUECHANGE$6, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "valueChange" element
   */
  public void setValueChange(com.realtybaron.jillow.types.AmountOptional valueChange) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().find_element_user(VALUECHANGE$6, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.AmountOptional) get_store().add_element_user(VALUECHANGE$6);
      }
      target.set(valueChange);
    }
  }
  /**
   * Appends and returns a new empty "valueChange" element
   */
  public com.realtybaron.jillow.types.AmountOptional addNewValueChange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.AmountOptional target = null;
      target = (com.realtybaron.jillow.types.AmountOptional) get_store().add_element_user(VALUECHANGE$6);
      return target;
    }
  }
  /**
   * Gets the "valuationRange" element
   */
  public com.realtybaron.jillow.types.Zestimate.ValuationRange getValuationRange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate.ValuationRange target = null;
      target = (com.realtybaron.jillow.types.Zestimate.ValuationRange) get_store().find_element_user(VALUATIONRANGE$8,
                                                                                                     0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "valuationRange" element
   */
  public void setValuationRange(com.realtybaron.jillow.types.Zestimate.ValuationRange valuationRange) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate.ValuationRange target = null;
      target = (com.realtybaron.jillow.types.Zestimate.ValuationRange) get_store().find_element_user(VALUATIONRANGE$8,
                                                                                                     0);
      if (target == null) {
        target = (com.realtybaron.jillow.types.Zestimate.ValuationRange) get_store().add_element_user(VALUATIONRANGE$8);
      }
      target.set(valuationRange);
    }
  }
  /**
   * Appends and returns a new empty "valuationRange" element
   */
  public com.realtybaron.jillow.types.Zestimate.ValuationRange addNewValuationRange() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.types.Zestimate.ValuationRange target = null;
      target = (com.realtybaron.jillow.types.Zestimate.ValuationRange) get_store().add_element_user(VALUATIONRANGE$8);
      return target;
    }
  }
  /**
   * Gets the "percentile" element
   */
  public java.lang.String getPercentile() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PERCENTILE$10, 0);
      if (target == null) {
        return null;
      }
      return target.getStringValue();
    }
  }
  /**
   * Gets (as xml) the "percentile" element
   */
  public org.apache.xmlbeans.XmlString xgetPercentile() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PERCENTILE$10, 0);
      return target;
    }
  }
  /**
   * Sets the "percentile" element
   */
  public void setPercentile(java.lang.String percentile) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(PERCENTILE$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(PERCENTILE$10);
      }
      target.setStringValue(percentile);
    }
  }
  /**
   * Sets (as xml) the "percentile" element
   */
  public void xsetPercentile(org.apache.xmlbeans.XmlString percentile) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlString target = null;
      target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(PERCENTILE$10, 0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(PERCENTILE$10);
      }
      target.set(percentile);
    }
  }
  /**
   * An XML valuationRange(@).
   * <p/>
   * This is a complex type.
   */
  public static class ValuationRangeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.types.Zestimate.ValuationRange {
    public ValuationRangeImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName LOW$0 = new javax.xml.namespace.QName("", "low");
    private static final javax.xml.namespace.QName HIGH$2 = new javax.xml.namespace.QName("", "high");
    /**
     * Gets the "low" element
     */
    public com.realtybaron.jillow.types.Amount getLow() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(LOW$0, 0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "low" element
     */
    public void setLow(com.realtybaron.jillow.types.Amount low) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(LOW$0, 0);
        if (target == null) {
          target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(LOW$0);
        }
        target.set(low);
      }
    }
    /**
     * Appends and returns a new empty "low" element
     */
    public com.realtybaron.jillow.types.Amount addNewLow() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(LOW$0);
        return target;
      }
    }
    /**
     * Gets the "high" element
     */
    public com.realtybaron.jillow.types.Amount getHigh() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(HIGH$2, 0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "high" element
     */
    public void setHigh(com.realtybaron.jillow.types.Amount high) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().find_element_user(HIGH$2, 0);
        if (target == null) {
          target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(HIGH$2);
        }
        target.set(high);
      }
    }
    /**
     * Appends and returns a new empty "high" element
     */
    public com.realtybaron.jillow.types.Amount addNewHigh() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Amount target = null;
        target = (com.realtybaron.jillow.types.Amount) get_store().add_element_user(HIGH$2);
        return target;
      }
    }
  }
}
