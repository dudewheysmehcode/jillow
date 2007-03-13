/*
 * XML Type:  ComparableProperty
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.ComparableProperty
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML ComparableProperty(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface ComparableProperty extends com.realtybaron.jillow.types.SimpleProperty {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("comparablepropertyfc3atype");
  /**
   * Gets the "score" attribute
   */
  java.math.BigDecimal getScore();
  /**
   * Gets (as xml) the "score" attribute
   */
  org.apache.xmlbeans.XmlDecimal xgetScore();
  /**
   * True if has "score" attribute
   */
  boolean isSetScore();
  /**
   * Sets the "score" attribute
   */
  void setScore(java.math.BigDecimal score);
  /**
   * Sets (as xml) the "score" attribute
   */
  void xsetScore(org.apache.xmlbeans.XmlDecimal score);
  /**
   * Unsets the "score" attribute
   */
  void unsetScore();
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.ComparableProperty newInstance() {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.lang.String xmlAsString) throws
                                                                                                      org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.lang.String xmlAsString,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.File file) throws
                                                                                           org.apache.xmlbeans.XmlException,
                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.File file,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.net.URL u) throws
                                                                                        org.apache.xmlbeans.XmlException,
                                                                                        java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.net.URL u,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.InputStream is) throws
                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.InputStream is,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.Reader r) throws
                                                                                          org.apache.xmlbeans.XmlException,
                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(java.io.Reader r,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                             org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(javax.xml.stream.XMLStreamReader sr,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(org.w3c.dom.Node node) throws
                                                                                               org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.ComparableProperty parse(org.w3c.dom.Node node,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.ComparableProperty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                                           org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.ComparableProperty parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                        org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.ComparableProperty) org.apache
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
