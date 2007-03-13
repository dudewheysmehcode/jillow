/*
 * XML Type:  zestimateResultType
 * Namespace: http://www.zillow.com/static/xsd/Zestimate.xsd
 * Java type: com.realtybaron.jillow.zestimate.ZestimateResultType
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.zestimate;

/**
 * An XML zestimateResultType(@http://www.zillow.com/static/xsd/Zestimate.xsd).
 * <p/>
 * This is a complex type.
 */
public interface ZestimateResultType extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("zestimateresulttypeee62type");
  /**
   * Gets the "request" element
   */
  com.realtybaron.jillow.zestimate.ZestimateResultType.Request getRequest();
  /**
   * Sets the "request" element
   */
  void setRequest(com.realtybaron.jillow.zestimate.ZestimateResultType.Request request);
  /**
   * Appends and returns a new empty "request" element
   */
  com.realtybaron.jillow.zestimate.ZestimateResultType.Request addNewRequest();
  /**
   * Gets the "message" element
   */
  com.realtybaron.jillow.types.Message getMessage();
  /**
   * Sets the "message" element
   */
  void setMessage(com.realtybaron.jillow.types.Message message);
  /**
   * Appends and returns a new empty "message" element
   */
  com.realtybaron.jillow.types.Message addNewMessage();
  /**
   * Gets the "response" element
   */
  com.realtybaron.jillow.types.DetailedProperty getResponse();
  /**
   * True if has "response" element
   */
  boolean isSetResponse();
  /**
   * Sets the "response" element
   */
  void setResponse(com.realtybaron.jillow.types.DetailedProperty response);
  /**
   * Appends and returns a new empty "response" element
   */
  com.realtybaron.jillow.types.DetailedProperty addNewResponse();
  /**
   * Unsets the "response" element
   */
  void unsetResponse();
  /**
   * An XML request(@).
   * <p/>
   * This is a complex type.
   */
  public interface Request extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("requestf637elemtype");
    /**
     * Gets the "zpid" element
     */
    java.lang.String getZpid();
    /**
     * Gets (as xml) the "zpid" element
     */
    org.apache.xmlbeans.XmlString xgetZpid();
    /**
     * Sets the "zpid" element
     */
    void setZpid(java.lang.String zpid);
    /**
     * Sets (as xml) the "zpid" element
     */
    void xsetZpid(org.apache.xmlbeans.XmlString zpid);
    /**
     * A factory class with static methods for creating instances of this type.
     */
    public static final class Factory {
      public static com.realtybaron.jillow.zestimate.ZestimateResultType.Request newInstance() {
        return (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.zestimate.ZestimateResultType.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.zestimate.ZestimateResultType.Request) org.apache
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
    public static com.realtybaron.jillow.zestimate.ZestimateResultType newInstance() {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.lang.String xmlAsString) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.lang.String xmlAsString,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.File file) throws
                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.File file,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.net.URL u) throws
                                                                                             org.apache.xmlbeans.XmlException,
                                                                                             java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.net.URL u,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.InputStream is) throws
                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.InputStream is,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.Reader r) throws
                                                                                               org.apache.xmlbeans.XmlException,
                                                                                               java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(java.io.Reader r,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                                  org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(javax.xml.stream.XMLStreamReader sr,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(org.w3c.dom.Node node) throws
                                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(org.w3c.dom.Node node,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                                org.apache.xmlbeans.XmlException,
                                                                                                                                org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.zestimate.ZestimateResultType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                             org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.zestimate.ZestimateResultType) org.apache
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
