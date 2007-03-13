/*
 * XML Type:  AmountOptional
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.AmountOptional
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML AmountOptional(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlString.
 */
public interface AmountOptional extends org.apache.xmlbeans.XmlString {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("amountoptional5fd1type");
  /**
   * Gets the "currency" attribute
   */
  com.realtybaron.jillow.types.Currency.Enum getCurrency();
  /**
   * Gets (as xml) the "currency" attribute
   */
  com.realtybaron.jillow.types.Currency xgetCurrency();
  /**
   * True if has "currency" attribute
   */
  boolean isSetCurrency();
  /**
   * Sets the "currency" attribute
   */
  void setCurrency(com.realtybaron.jillow.types.Currency.Enum currency);
  /**
   * Sets (as xml) the "currency" attribute
   */
  void xsetCurrency(com.realtybaron.jillow.types.Currency currency);
  /**
   * Unsets the "currency" attribute
   */
  void unsetCurrency();
  /**
   * Gets the "duration" attribute
   */
  java.math.BigInteger getDuration();
  /**
   * Gets (as xml) the "duration" attribute
   */
  org.apache.xmlbeans.XmlInteger xgetDuration();
  /**
   * True if has "duration" attribute
   */
  boolean isSetDuration();
  /**
   * Sets the "duration" attribute
   */
  void setDuration(java.math.BigInteger duration);
  /**
   * Sets (as xml) the "duration" attribute
   */
  void xsetDuration(org.apache.xmlbeans.XmlInteger duration);
  /**
   * Unsets the "duration" attribute
   */
  void unsetDuration();
  /**
   * Gets the "deprecated" attribute
   */
  boolean getDeprecated();
  /**
   * Gets (as xml) the "deprecated" attribute
   */
  org.apache.xmlbeans.XmlBoolean xgetDeprecated();
  /**
   * True if has "deprecated" attribute
   */
  boolean isSetDeprecated();
  /**
   * Sets the "deprecated" attribute
   */
  void setDeprecated(boolean deprecated);
  /**
   * Sets (as xml) the "deprecated" attribute
   */
  void xsetDeprecated(org.apache.xmlbeans.XmlBoolean deprecated);
  /**
   * Unsets the "deprecated" attribute
   */
  void unsetDeprecated();
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.AmountOptional newInstance() {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.AmountOptional parse(java.lang.String xmlAsString) throws
                                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.lang.String xmlAsString,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.File file) throws
                                                                                       org.apache.xmlbeans.XmlException,
                                                                                       java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.File file,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.net.URL u) throws
                                                                                    org.apache.xmlbeans.XmlException,
                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.net.URL u,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.InputStream is) throws
                                                                                            org.apache.xmlbeans.XmlException,
                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.InputStream is,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.Reader r) throws
                                                                                      org.apache.xmlbeans.XmlException,
                                                                                      java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(java.io.Reader r,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                         org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(javax.xml.stream.XMLStreamReader sr,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(org.w3c.dom.Node node) throws
                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.AmountOptional parse(org.w3c.dom.Node node,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.AmountOptional parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                       org.apache.xmlbeans.XmlException,
                                                                                                                       org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.AmountOptional parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                    org.apache.xmlbeans.XmlOptions options) throws
                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                            org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.AmountOptional) org.apache
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
