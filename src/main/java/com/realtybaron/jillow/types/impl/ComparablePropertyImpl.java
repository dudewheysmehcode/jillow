/*
 * XML Type:  ComparableProperty
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.ComparableProperty
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types.impl;

/**
 * An XML ComparableProperty(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public class ComparablePropertyImpl extends com.realtybaron.jillow.types.impl.SimplePropertyImpl implements com.realtybaron.jillow.types.ComparableProperty {
  public ComparablePropertyImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName SCORE$0 = new javax.xml.namespace.QName("", "score");
  /**
   * Gets the "score" attribute
   */
  public java.math.BigDecimal getScore() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(SCORE$0);
      if (target == null) {
        return null;
      }
      return target.getBigDecimalValue();
    }
  }
  /**
   * Gets (as xml) the "score" attribute
   */
  public org.apache.xmlbeans.XmlDecimal xgetScore() {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_attribute_user(SCORE$0);
      return target;
    }
  }
  /**
   * True if has "score" attribute
   */
  public boolean isSetScore() {
    synchronized (monitor()) {
      check_orphaned();
      return get_store().find_attribute_user(SCORE$0) != null;
    }
  }
  /**
   * Sets the "score" attribute
   */
  public void setScore(java.math.BigDecimal score) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.SimpleValue target = null;
      target = (org.apache.xmlbeans.SimpleValue) get_store().find_attribute_user(SCORE$0);
      if (target == null) {
        target = (org.apache.xmlbeans.SimpleValue) get_store().add_attribute_user(SCORE$0);
      }
      target.setBigDecimalValue(score);
    }
  }
  /**
   * Sets (as xml) the "score" attribute
   */
  public void xsetScore(org.apache.xmlbeans.XmlDecimal score) {
    synchronized (monitor()) {
      check_orphaned();
      org.apache.xmlbeans.XmlDecimal target = null;
      target = (org.apache.xmlbeans.XmlDecimal) get_store().find_attribute_user(SCORE$0);
      if (target == null) {
        target = (org.apache.xmlbeans.XmlDecimal) get_store().add_attribute_user(SCORE$0);
      }
      target.set(score);
    }
  }
  /**
   * Unsets the "score" attribute
   */
  public void unsetScore() {
    synchronized (monitor()) {
      check_orphaned();
      get_store().remove_attribute(SCORE$0);
    }
  }
}
