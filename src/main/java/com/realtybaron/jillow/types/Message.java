/*
 * XML Type:  Message
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Message
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML Message(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface Message extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("messagea2b4type");
  /**
   * Gets the "text" element
   */
  java.lang.String getText();
  /**
   * Gets (as xml) the "text" element
   */
  org.apache.xmlbeans.XmlString xgetText();
  /**
   * Sets the "text" element
   */
  void setText(java.lang.String text);
  /**
   * Sets (as xml) the "text" element
   */
  void xsetText(org.apache.xmlbeans.XmlString text);
  /**
   * Gets the "code" element
   */
  java.math.BigInteger getCode();
  /**
   * Gets (as xml) the "code" element
   */
  org.apache.xmlbeans.XmlInteger xgetCode();
  /**
   * Sets the "code" element
   */
  void setCode(java.math.BigInteger code);
  /**
   * Sets (as xml) the "code" element
   */
  void xsetCode(org.apache.xmlbeans.XmlInteger code);
  /**
   * Gets the "limit-warning" element
   */
  boolean getLimitWarning();
  /**
   * Gets (as xml) the "limit-warning" element
   */
  org.apache.xmlbeans.XmlBoolean xgetLimitWarning();
  /**
   * True if has "limit-warning" element
   */
  boolean isSetLimitWarning();
  /**
   * Sets the "limit-warning" element
   */
  void setLimitWarning(boolean limitWarning);
  /**
   * Sets (as xml) the "limit-warning" element
   */
  void xsetLimitWarning(org.apache.xmlbeans.XmlBoolean limitWarning);
  /**
   * Unsets the "limit-warning" element
   */
  void unsetLimitWarning();
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.Message newInstance() {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.Message newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.Message parse(java.lang.String xmlAsString) throws
                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(java.lang.String xmlAsString,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.Message parse(java.io.File file) throws
                                                                                org.apache.xmlbeans.XmlException,
                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(java.io.File file,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.Message parse(java.net.URL u) throws
                                                                             org.apache.xmlbeans.XmlException,
                                                                             java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(java.net.URL u,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.Message parse(java.io.InputStream is) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(java.io.InputStream is,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.Message parse(java.io.Reader r) throws
                                                                               org.apache.xmlbeans.XmlException,
                                                                               java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(java.io.Reader r,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.Message parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(javax.xml.stream.XMLStreamReader sr,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.Message parse(org.w3c.dom.Node node) throws
                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.Message parse(org.w3c.dom.Node node,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Message parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Message) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Message parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Message) org.apache
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
