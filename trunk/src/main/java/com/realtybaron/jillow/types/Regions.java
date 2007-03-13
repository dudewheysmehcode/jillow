/*
 * XML Type:  Regions
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Regions
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML Regions(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface Regions extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("regionsb9bctype");
  /**
   * Gets the "zipcode-id" element
   */
  java.math.BigInteger getZipcodeId();
  /**
   * Gets (as xml) the "zipcode-id" element
   */
  org.apache.xmlbeans.XmlInteger xgetZipcodeId();
  /**
   * Sets the "zipcode-id" element
   */
  void setZipcodeId(java.math.BigInteger zipcodeId);
  /**
   * Sets (as xml) the "zipcode-id" element
   */
  void xsetZipcodeId(org.apache.xmlbeans.XmlInteger zipcodeId);
  /**
   * Gets the "city-id" element
   */
  java.math.BigInteger getCityId();
  /**
   * Gets (as xml) the "city-id" element
   */
  org.apache.xmlbeans.XmlInteger xgetCityId();
  /**
   * Sets the "city-id" element
   */
  void setCityId(java.math.BigInteger cityId);
  /**
   * Sets (as xml) the "city-id" element
   */
  void xsetCityId(org.apache.xmlbeans.XmlInteger cityId);
  /**
   * Gets the "county-id" element
   */
  java.math.BigInteger getCountyId();
  /**
   * Gets (as xml) the "county-id" element
   */
  org.apache.xmlbeans.XmlInteger xgetCountyId();
  /**
   * Sets the "county-id" element
   */
  void setCountyId(java.math.BigInteger countyId);
  /**
   * Sets (as xml) the "county-id" element
   */
  void xsetCountyId(org.apache.xmlbeans.XmlInteger countyId);
  /**
   * Gets the "state-id" element
   */
  java.math.BigInteger getStateId();
  /**
   * Gets (as xml) the "state-id" element
   */
  org.apache.xmlbeans.XmlInteger xgetStateId();
  /**
   * Sets the "state-id" element
   */
  void setStateId(java.math.BigInteger stateId);
  /**
   * Sets (as xml) the "state-id" element
   */
  void xsetStateId(org.apache.xmlbeans.XmlInteger stateId);
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.Regions newInstance() {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.Regions newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.Regions parse(java.lang.String xmlAsString) throws
                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.lang.String xmlAsString,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.Regions parse(java.io.File file) throws
                                                                                org.apache.xmlbeans.XmlException,
                                                                                java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.io.File file,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.net.URL u) throws
                                                                             org.apache.xmlbeans.XmlException,
                                                                             java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.net.URL u,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.io.InputStream is) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.io.InputStream is,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.io.Reader r) throws
                                                                               org.apache.xmlbeans.XmlException,
                                                                               java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(java.io.Reader r,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.Regions parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(javax.xml.stream.XMLStreamReader sr,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.Regions parse(org.w3c.dom.Node node) throws
                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.Regions parse(org.w3c.dom.Node node,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Regions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Regions) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Regions parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Regions) org.apache
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
