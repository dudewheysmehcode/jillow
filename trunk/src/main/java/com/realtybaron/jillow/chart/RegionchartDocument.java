/*
 * An XML document type.
 * Localname: regionchart
 * Namespace: http://www.zillow.com/static/xsd/RegionChart.xsd
 * Java type: com.realtybaron.jillow.chart.RegionchartDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.chart;

/**
 * A document containing one regionchart(@http://www.zillow.com/static/xsd/RegionChart.xsd) element.
 * <p/>
 * This is a complex type.
 */
public interface RegionchartDocument extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("regionchart5ec9doctype");
  /**
   * Gets the "regionchart" element
   */
  com.realtybaron.jillow.chart.RegionchartDocument.Regionchart getRegionchart();
  /**
   * Sets the "regionchart" element
   */
  void setRegionchart(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart regionchart);
  /**
   * Appends and returns a new empty "regionchart" element
   */
  com.realtybaron.jillow.chart.RegionchartDocument.Regionchart addNewRegionchart();
  /**
   * An XML regionchart(@http://www.zillow.com/static/xsd/RegionChart.xsd).
   * <p/>
   * This is a complex type.
   */
  public interface Regionchart extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("regionchart6a33elemtype");
    /**
     * Gets the "request" element
     */
    com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request getRequest();
    /**
     * Sets the "request" element
     */
    void setRequest(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request request);
    /**
     * Appends and returns a new empty "request" element
     */
    com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request addNewRequest();
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
    com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response getResponse();
    /**
     * True if has "response" element
     */
    boolean isSetResponse();
    /**
     * Sets the "response" element
     */
    void setResponse(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response response);
    /**
     * Appends and returns a new empty "response" element
     */
    com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response addNewResponse();
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
          .resolveHandle("requestcd08elemtype");
      /**
       * Gets the "city" element
       */
      java.lang.String getCity();
      /**
       * Gets (as xml) the "city" element
       */
      org.apache.xmlbeans.XmlString xgetCity();
      /**
       * True if has "city" element
       */
      boolean isSetCity();
      /**
       * Sets the "city" element
       */
      void setCity(java.lang.String city);
      /**
       * Sets (as xml) the "city" element
       */
      void xsetCity(org.apache.xmlbeans.XmlString city);
      /**
       * Unsets the "city" element
       */
      void unsetCity();
      /**
       * Gets the "state" element
       */
      java.lang.String getState();
      /**
       * Gets (as xml) the "state" element
       */
      org.apache.xmlbeans.XmlString xgetState();
      /**
       * True if has "state" element
       */
      boolean isSetState();
      /**
       * Sets the "state" element
       */
      void setState(java.lang.String state);
      /**
       * Sets (as xml) the "state" element
       */
      void xsetState(org.apache.xmlbeans.XmlString state);
      /**
       * Unsets the "state" element
       */
      void unsetState();
      /**
       * Gets the "zip" element
       */
      java.lang.String getZip();
      /**
       * Gets (as xml) the "zip" element
       */
      org.apache.xmlbeans.XmlString xgetZip();
      /**
       * True if has "zip" element
       */
      boolean isSetZip();
      /**
       * Sets the "zip" element
       */
      void setZip(java.lang.String zip);
      /**
       * Sets (as xml) the "zip" element
       */
      void xsetZip(org.apache.xmlbeans.XmlString zip);
      /**
       * Unsets the "zip" element
       */
      void unsetZip();
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
       * Gets the "chartDuration" element
       */
      com.realtybaron.jillow.types.ChartDuration.Enum getChartDuration();
      /**
       * Gets (as xml) the "chartDuration" element
       */
      com.realtybaron.jillow.types.SimpleChartDuration xgetChartDuration();
      /**
       * True if has "chartDuration" element
       */
      boolean isSetChartDuration();
      /**
       * Sets the "chartDuration" element
       */
      void setChartDuration(com.realtybaron.jillow.types.ChartDuration.Enum chartDuration);
      /**
       * Sets (as xml) the "chartDuration" element
       */
      void xsetChartDuration(com.realtybaron.jillow.types.SimpleChartDuration chartDuration);
      /**
       * Unsets the "chartDuration" element
       */
      void unsetChartDuration();
      /**
       * Gets the "chartVariant" element
       */
      com.realtybaron.jillow.types.ChartVariant.Enum getChartVariant();
      /**
       * Gets (as xml) the "chartVariant" element
       */
      com.realtybaron.jillow.types.ChartVariant xgetChartVariant();
      /**
       * True if has "chartVariant" element
       */
      boolean isSetChartVariant();
      /**
       * Sets the "chartVariant" element
       */
      void setChartVariant(com.realtybaron.jillow.types.ChartVariant.Enum chartVariant);
      /**
       * Sets (as xml) the "chartVariant" element
       */
      void xsetChartVariant(com.realtybaron.jillow.types.ChartVariant chartVariant);
      /**
       * Unsets the "chartVariant" element
       */
      void unsetChartVariant();
      /**
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request newInstance() {
          return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) org.apache
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
          .resolveHandle("response7086elemtype");
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
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response newInstance() {
          return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) org.apache
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
      public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart newInstance() {
        return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.chart.RegionchartDocument.Regionchart newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) org.apache
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
    public static com.realtybaron.jillow.chart.RegionchartDocument newInstance() {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.lang.String xmlAsString) throws
                                                                                                       org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.lang.String xmlAsString,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.File file) throws
                                                                                            org.apache.xmlbeans.XmlException,
                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.File file,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.net.URL u) throws
                                                                                         org.apache.xmlbeans.XmlException,
                                                                                         java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.net.URL u,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.InputStream is) throws
                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.InputStream is,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.Reader r) throws
                                                                                           org.apache.xmlbeans.XmlException,
                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(java.io.Reader r,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                                 java.io.IOException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                              org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(javax.xml.stream.XMLStreamReader sr,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(org.w3c.dom.Node node) throws
                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(org.w3c.dom.Node node,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                            org.apache.xmlbeans.XmlException,
                                                                                                                            org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.chart.RegionchartDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                         org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                 org.apache.xmlbeans.XmlException,
                                                                                                                 org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.chart.RegionchartDocument) org.apache
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
