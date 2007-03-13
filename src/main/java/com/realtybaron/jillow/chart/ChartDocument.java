/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://www.zillow.com/static/xsd/Chart.xsd
 * Java type: com.realtybaron.jillow.chart.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.chart;

/**
 * A document containing one chart(@http://www.zillow.com/static/xsd/Chart.xsd) element.
 * <p/>
 * This is a complex type.
 */
public interface ChartDocument extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("chartae29doctype");
  /**
   * Gets the "chart" element
   */
  com.realtybaron.jillow.chart.ChartDocument.Chart getChart();
  /**
   * Sets the "chart" element
   */
  void setChart(com.realtybaron.jillow.chart.ChartDocument.Chart chart);
  /**
   * Appends and returns a new empty "chart" element
   */
  com.realtybaron.jillow.chart.ChartDocument.Chart addNewChart();
  /**
   * An XML chart(@http://www.zillow.com/static/xsd/Chart.xsd).
   * <p/>
   * This is a complex type.
   */
  public interface Chart extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("chart1f9felemtype");
    /**
     * Gets the "request" element
     */
    com.realtybaron.jillow.chart.ChartDocument.Chart.Request getRequest();
    /**
     * Sets the "request" element
     */
    void setRequest(com.realtybaron.jillow.chart.ChartDocument.Chart.Request request);
    /**
     * Appends and returns a new empty "request" element
     */
    com.realtybaron.jillow.chart.ChartDocument.Chart.Request addNewRequest();
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
    com.realtybaron.jillow.chart.ChartDocument.Chart.Response getResponse();
    /**
     * True if has "response" element
     */
    boolean isSetResponse();
    /**
     * Sets the "response" element
     */
    void setResponse(com.realtybaron.jillow.chart.ChartDocument.Chart.Response response);
    /**
     * Appends and returns a new empty "response" element
     */
    com.realtybaron.jillow.chart.ChartDocument.Chart.Response addNewResponse();
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
          .resolveHandle("requestfdb4elemtype");
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
       * Gets the "unit-type" element
       */
      java.lang.String getUnitType();
      /**
       * Gets (as xml) the "unit-type" element
       */
      org.apache.xmlbeans.XmlString xgetUnitType();
      /**
       * Sets the "unit-type" element
       */
      void setUnitType(java.lang.String unitType);
      /**
       * Sets (as xml) the "unit-type" element
       */
      void xsetUnitType(org.apache.xmlbeans.XmlString unitType);
      /**
       * Gets the "width" element
       */
      java.lang.String getWidth();
      /**
       * Gets (as xml) the "width" element
       */
      org.apache.xmlbeans.XmlString xgetWidth();
      /**
       * True if has "width" element
       */
      boolean isSetWidth();
      /**
       * Sets the "width" element
       */
      void setWidth(java.lang.String width);
      /**
       * Sets (as xml) the "width" element
       */
      void xsetWidth(org.apache.xmlbeans.XmlString width);
      /**
       * Unsets the "width" element
       */
      void unsetWidth();
      /**
       * Gets the "height" element
       */
      java.lang.String getHeight();
      /**
       * Gets (as xml) the "height" element
       */
      org.apache.xmlbeans.XmlString xgetHeight();
      /**
       * True if has "height" element
       */
      boolean isSetHeight();
      /**
       * Sets the "height" element
       */
      void setHeight(java.lang.String height);
      /**
       * Sets (as xml) the "height" element
       */
      void xsetHeight(org.apache.xmlbeans.XmlString height);
      /**
       * Unsets the "height" element
       */
      void unsetHeight();
      /**
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.chart.ChartDocument.Chart.Request newInstance() {
          return (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.chart.ChartDocument.Chart.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, options);
        }
        private Factory() { } // No instance of this class allowed
      }
    }
    /**
     * An XML response(@).
     * <p/>
     * This is a complex type.
     */
    public interface Response extends org.apache.xmlbeans.XmlObject {
      public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
          .system
          .s998C344FBF08CE4153FF8899A4788B33
          .TypeSystemHolder
          .typeSystem
          .resolveHandle("response24b2elemtype");
      /**
       * Gets the "url" element
       */
      java.lang.String getUrl();
      /**
       * Gets (as xml) the "url" element
       */
      org.apache.xmlbeans.XmlString xgetUrl();
      /**
       * Sets the "url" element
       */
      void setUrl(java.lang.String url);
      /**
       * Sets (as xml) the "url" element
       */
      void xsetUrl(org.apache.xmlbeans.XmlString url);
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
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.chart.ChartDocument.Chart.Response newInstance() {
          return (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.chart.ChartDocument.Chart.Response newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) org.apache
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
      public static com.realtybaron.jillow.chart.ChartDocument.Chart newInstance() {
        return (com.realtybaron.jillow.chart.ChartDocument.Chart) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.chart.ChartDocument.Chart newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.chart.ChartDocument.Chart) org.apache
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
    public static com.realtybaron.jillow.chart.ChartDocument newInstance() {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.lang.String xmlAsString) throws
                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.lang.String xmlAsString,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.File file) throws
                                                                                      org.apache.xmlbeans.XmlException,
                                                                                      java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.File file,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.net.URL u) throws
                                                                                   org.apache.xmlbeans.XmlException,
                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.net.URL u,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.InputStream is) throws
                                                                                           org.apache.xmlbeans.XmlException,
                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.InputStream is,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.Reader r) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(java.io.Reader r,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                        org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(javax.xml.stream.XMLStreamReader sr,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(org.w3c.dom.Node node) throws
                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.chart.ChartDocument parse(org.w3c.dom.Node node,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.chart.ChartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                      org.apache.xmlbeans.XmlException,
                                                                                                                      org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.chart.ChartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.chart.ChartDocument) org.apache
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
