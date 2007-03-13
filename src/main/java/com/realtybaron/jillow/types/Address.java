/*
 * XML Type:  Address
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Address
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML Address(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface Address extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("address3267type");
  /**
   * Gets the "street" element
   */
  java.lang.String getStreet();
  /**
   * Gets (as xml) the "street" element
   */
  org.apache.xmlbeans.XmlString xgetStreet();
  /**
   * Sets the "street" element
   */
  void setStreet(java.lang.String street);
  /**
   * Sets (as xml) the "street" element
   */
  void xsetStreet(org.apache.xmlbeans.XmlString street);
  /**
   * Gets the "zipcode" element
   */
  java.lang.String getZipcode();
  /**
   * Gets (as xml) the "zipcode" element
   */
  org.apache.xmlbeans.XmlString xgetZipcode();
  /**
   * Sets the "zipcode" element
   */
  void setZipcode(java.lang.String zipcode);
  /**
   * Sets (as xml) the "zipcode" element
   */
  void xsetZipcode(org.apache.xmlbeans.XmlString zipcode);
  /**
   * Gets the "city" element
   */
  java.lang.String getCity();
  /**
   * Gets (as xml) the "city" element
   */
  org.apache.xmlbeans.XmlString xgetCity();
  /**
   * Sets the "city" element
   */
  void setCity(java.lang.String city);
  /**
   * Sets (as xml) the "city" element
   */
  void xsetCity(org.apache.xmlbeans.XmlString city);
  /**
   * Gets the "state" element
   */
  java.lang.String getState();
  /**
   * Gets (as xml) the "state" element
   */
  org.apache.xmlbeans.XmlString xgetState();
  /**
   * Sets the "state" element
   */
  void setState(java.lang.String state);
  /**
   * Sets (as xml) the "state" element
   */
  void xsetState(org.apache.xmlbeans.XmlString state);
  /**
   * Gets the "latitude" element
   */
  java.math.BigDecimal getLatitude();
  /**
   * Gets (as xml) the "latitude" element
   */
  org.apache.xmlbeans.XmlDecimal xgetLatitude();
  /**
   * Sets the "latitude" element
   */
  void setLatitude(java.math.BigDecimal latitude);
  /**
   * Sets (as xml) the "latitude" element
   */
  void xsetLatitude(org.apache.xmlbeans.XmlDecimal latitude);
  /**
   * Gets the "longitude" element
   */
  java.math.BigDecimal getLongitude();
  /**
   * Gets (as xml) the "longitude" element
   */
  org.apache.xmlbeans.XmlDecimal xgetLongitude();
  /**
   * Sets the "longitude" element
   */
  void setLongitude(java.math.BigDecimal longitude);
  /**
   * Sets (as xml) the "longitude" element
   */
  void xsetLongitude(org.apache.xmlbeans.XmlDecimal longitude);
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.Address newInstance() {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.Address newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.Address parse(java.lang.String xmlAsString) throws
                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(java.lang.String xmlAsString,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.Address parse(java.io.File file) throws
                                                                                org.apache.xmlbeans.XmlException,
                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(java.io.File file,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.Address parse(java.net.URL u) throws
                                                                             org.apache.xmlbeans.XmlException,
                                                                             java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(java.net.URL u,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.Address parse(java.io.InputStream is) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(java.io.InputStream is,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.Address parse(java.io.Reader r) throws
                                                                               org.apache.xmlbeans.XmlException,
                                                                               java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(java.io.Reader r,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.Address parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(javax.xml.stream.XMLStreamReader sr,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.Address parse(org.w3c.dom.Node node) throws
                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.Address parse(org.w3c.dom.Node node,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Address) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Address parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Address) org.apache
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
