/*
 * XML Type:  Zestimate
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Zestimate
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML Zestimate(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface Zestimate extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("zestimatece39type");
  /**
   * Gets the "amount" element
   */
  com.realtybaron.jillow.types.Amount getAmount();
  /**
   * Sets the "amount" element
   */
  void setAmount(com.realtybaron.jillow.types.Amount amount);
  /**
   * Appends and returns a new empty "amount" element
   */
  com.realtybaron.jillow.types.Amount addNewAmount();
  /**
   * Gets the "last-updated" element
   */
  java.lang.String getLastUpdated();
  /**
   * Gets (as xml) the "last-updated" element
   */
  org.apache.xmlbeans.XmlString xgetLastUpdated();
  /**
   * True if has "last-updated" element
   */
  boolean isSetLastUpdated();
  /**
   * Sets the "last-updated" element
   */
  void setLastUpdated(java.lang.String lastUpdated);
  /**
   * Sets (as xml) the "last-updated" element
   */
  void xsetLastUpdated(org.apache.xmlbeans.XmlString lastUpdated);
  /**
   * Unsets the "last-updated" element
   */
  void unsetLastUpdated();
  /**
   * Gets the "oneWeekChange" element
   */
  com.realtybaron.jillow.types.AmountOptional getOneWeekChange();
  /**
   * Sets the "oneWeekChange" element
   */
  void setOneWeekChange(com.realtybaron.jillow.types.AmountOptional oneWeekChange);
  /**
   * Appends and returns a new empty "oneWeekChange" element
   */
  com.realtybaron.jillow.types.AmountOptional addNewOneWeekChange();
  /**
   * Gets the "valueChange" element
   */
  com.realtybaron.jillow.types.AmountOptional getValueChange();
  /**
   * Sets the "valueChange" element
   */
  void setValueChange(com.realtybaron.jillow.types.AmountOptional valueChange);
  /**
   * Appends and returns a new empty "valueChange" element
   */
  com.realtybaron.jillow.types.AmountOptional addNewValueChange();
  /**
   * Gets the "valuationRange" element
   */
  com.realtybaron.jillow.types.Zestimate.ValuationRange getValuationRange();
  /**
   * Sets the "valuationRange" element
   */
  void setValuationRange(com.realtybaron.jillow.types.Zestimate.ValuationRange valuationRange);
  /**
   * Appends and returns a new empty "valuationRange" element
   */
  com.realtybaron.jillow.types.Zestimate.ValuationRange addNewValuationRange();
  /**
   * Gets the "percentile" element
   */
  java.lang.String getPercentile();
  /**
   * Gets (as xml) the "percentile" element
   */
  org.apache.xmlbeans.XmlString xgetPercentile();
  /**
   * Sets the "percentile" element
   */
  void setPercentile(java.lang.String percentile);
  /**
   * Sets (as xml) the "percentile" element
   */
  void xsetPercentile(org.apache.xmlbeans.XmlString percentile);
  /**
   * An XML valuationRange(@).
   * <p/>
   * This is a complex type.
   */
  public interface ValuationRange extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("valuationrangebaf1elemtype");
    /**
     * Gets the "low" element
     */
    com.realtybaron.jillow.types.Amount getLow();
    /**
     * Sets the "low" element
     */
    void setLow(com.realtybaron.jillow.types.Amount low);
    /**
     * Appends and returns a new empty "low" element
     */
    com.realtybaron.jillow.types.Amount addNewLow();
    /**
     * Gets the "high" element
     */
    com.realtybaron.jillow.types.Amount getHigh();
    /**
     * Sets the "high" element
     */
    void setHigh(com.realtybaron.jillow.types.Amount high);
    /**
     * Appends and returns a new empty "high" element
     */
    com.realtybaron.jillow.types.Amount addNewHigh();
    /**
     * A factory class with static methods for creating instances of this type.
     */
    public static final class Factory {
      public static com.realtybaron.jillow.types.Zestimate.ValuationRange newInstance() {
        return (com.realtybaron.jillow.types.Zestimate.ValuationRange) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.types.Zestimate.ValuationRange newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.types.Zestimate.ValuationRange) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, options);
      }
      private Factory() { } // No instance of this class allowed
    }
  }
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.Zestimate newInstance() {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.Zestimate parse(java.lang.String xmlAsString) throws
                                                                                             org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.lang.String xmlAsString,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.File file) throws
                                                                                  org.apache.xmlbeans.XmlException,
                                                                                  java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.File file,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.net.URL u) throws
                                                                               org.apache.xmlbeans.XmlException,
                                                                               java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.net.URL u,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.InputStream is) throws
                                                                                       org.apache.xmlbeans.XmlException,
                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.InputStream is,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.Reader r) throws
                                                                                 org.apache.xmlbeans.XmlException,
                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(java.io.Reader r,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(javax.xml.stream.XMLStreamReader sr,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(org.w3c.dom.Node node) throws
                                                                                      org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.Zestimate parse(org.w3c.dom.Node node,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Zestimate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                  org.apache.xmlbeans.XmlException,
                                                                                                                  org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Zestimate parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                               org.apache.xmlbeans.XmlOptions options) throws
                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                       org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Zestimate) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                                               org.apache.xmlbeans.XmlException,
                                                                                                                                               org.apache.xmlbeans.xml.stream.XMLStreamException {
      return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                                    org.apache.xmlbeans.xml.stream.XMLStreamException {
      return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream(xis, type, options);
    }
    private Factory() { } // No instance of this class allowed
  }
}
