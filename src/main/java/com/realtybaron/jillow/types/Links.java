/*
 * XML Type:  Links
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.Links
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML Links(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is a complex type.
 */
public interface Links extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("links0382type");
  /**
   * Gets the "homedetails" element
   */
  java.lang.String getHomedetails();
  /**
   * Gets (as xml) the "homedetails" element
   */
  org.apache.xmlbeans.XmlString xgetHomedetails();
  /**
   * Sets the "homedetails" element
   */
  void setHomedetails(java.lang.String homedetails);
  /**
   * Sets (as xml) the "homedetails" element
   */
  void xsetHomedetails(org.apache.xmlbeans.XmlString homedetails);
  /**
   * Gets the "graphsanddata" element
   */
  java.lang.String getGraphsanddata();
  /**
   * Gets (as xml) the "graphsanddata" element
   */
  org.apache.xmlbeans.XmlString xgetGraphsanddata();
  /**
   * Sets the "graphsanddata" element
   */
  void setGraphsanddata(java.lang.String graphsanddata);
  /**
   * Sets (as xml) the "graphsanddata" element
   */
  void xsetGraphsanddata(org.apache.xmlbeans.XmlString graphsanddata);
  /**
   * Gets the "mapthishome" element
   */
  java.lang.String getMapthishome();
  /**
   * Gets (as xml) the "mapthishome" element
   */
  org.apache.xmlbeans.XmlString xgetMapthishome();
  /**
   * Sets the "mapthishome" element
   */
  void setMapthishome(java.lang.String mapthishome);
  /**
   * Sets (as xml) the "mapthishome" element
   */
  void xsetMapthishome(org.apache.xmlbeans.XmlString mapthishome);
  /**
   * Gets the "myestimator" element
   */
  java.lang.String getMyestimator();
  /**
   * Gets (as xml) the "myestimator" element
   */
  org.apache.xmlbeans.XmlString xgetMyestimator();
  /**
   * Sets the "myestimator" element
   */
  void setMyestimator(java.lang.String myestimator);
  /**
   * Sets (as xml) the "myestimator" element
   */
  void xsetMyestimator(org.apache.xmlbeans.XmlString myestimator);
  /**
   * Gets the "myzestimator" element
   */
  com.realtybaron.jillow.types.DeprecatedType getMyzestimator();
  /**
   * Sets the "myzestimator" element
   */
  void setMyzestimator(com.realtybaron.jillow.types.DeprecatedType myzestimator);
  /**
   * Appends and returns a new empty "myzestimator" element
   */
  com.realtybaron.jillow.types.DeprecatedType addNewMyzestimator();
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.Links newInstance() {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.Links newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.Links parse(java.lang.String xmlAsString) throws
                                                                                         org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(java.lang.String xmlAsString,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.Links parse(java.io.File file) throws
                                                                              org.apache.xmlbeans.XmlException,
                                                                              java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(java.io.File file,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException,
                                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.Links parse(java.net.URL u) throws
                                                                           org.apache.xmlbeans.XmlException,
                                                                           java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(java.net.URL u,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException,
                                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.Links parse(java.io.InputStream is) throws
                                                                                   org.apache.xmlbeans.XmlException,
                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(java.io.InputStream is,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException,
                                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.Links parse(java.io.Reader r) throws
                                                                             org.apache.xmlbeans.XmlException,
                                                                             java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(java.io.Reader r,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException,
                                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.Links parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(javax.xml.stream.XMLStreamReader sr,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.Links parse(org.w3c.dom.Node node) throws
                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.Links parse(org.w3c.dom.Node node,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Links parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                              org.apache.xmlbeans.XmlException,
                                                                                                              org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Links) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.Links parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                           org.apache.xmlbeans.XmlOptions options) throws
                                                                                                   org.apache.xmlbeans.XmlException,
                                                                                                   org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.Links) org.apache
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
