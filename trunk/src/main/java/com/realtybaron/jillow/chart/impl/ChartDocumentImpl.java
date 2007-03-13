/*
 * An XML document type.
 * Localname: chart
 * Namespace: http://www.zillow.com/static/xsd/Chart.xsd
 * Java type: com.realtybaron.jillow.chart.ChartDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.chart.impl;

/**
 * A document containing one chart(@http://www.zillow.com/static/xsd/Chart.xsd) element.
 * <p/>
 * This is a complex type.
 */
public class ChartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.ChartDocument {
  public ChartDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName CHART$0 = new javax.xml.namespace.QName(
      "http://www.zillow.com/static/xsd/Chart.xsd",
      "chart");
  /**
   * Gets the "chart" element
   */
  public com.realtybaron.jillow.chart.ChartDocument.Chart getChart() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.ChartDocument.Chart target = null;
      target = (com.realtybaron.jillow.chart.ChartDocument.Chart) get_store().find_element_user(CHART$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "chart" element
   */
  public void setChart(com.realtybaron.jillow.chart.ChartDocument.Chart chart) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.ChartDocument.Chart target = null;
      target = (com.realtybaron.jillow.chart.ChartDocument.Chart) get_store().find_element_user(CHART$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart) get_store().add_element_user(CHART$0);
      }
      target.set(chart);
    }
  }
  /**
   * Appends and returns a new empty "chart" element
   */
  public com.realtybaron.jillow.chart.ChartDocument.Chart addNewChart() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.ChartDocument.Chart target = null;
      target = (com.realtybaron.jillow.chart.ChartDocument.Chart) get_store().add_element_user(CHART$0);
      return target;
    }
  }
  /**
   * An XML chart(@http://www.zillow.com/static/xsd/Chart.xsd).
   * <p/>
   * This is a complex type.
   */
  public static class ChartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.ChartDocument.Chart {
    public ChartImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName REQUEST$0 = new javax.xml.namespace.QName("", "request");
    private static final javax.xml.namespace.QName MESSAGE$2 = new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName RESPONSE$4 = new javax.xml.namespace.QName("", "response");
    /**
     * Gets the "request" element
     */
    public com.realtybaron.jillow.chart.ChartDocument.Chart.Request getRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Request target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) get_store().find_element_user(REQUEST$0, 0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "request" element
     */
    public void setRequest(com.realtybaron.jillow.chart.ChartDocument.Chart.Request request) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Request target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) get_store().find_element_user(REQUEST$0, 0);
        if (target == null) {
          target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) get_store().add_element_user(REQUEST$0);
        }
        target.set(request);
      }
    }
    /**
     * Appends and returns a new empty "request" element
     */
    public com.realtybaron.jillow.chart.ChartDocument.Chart.Request addNewRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Request target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Request) get_store().add_element_user(REQUEST$0);
        return target;
      }
    }
    /**
     * Gets the "message" element
     */
    public com.realtybaron.jillow.types.Message getMessage() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Message target = null;
        target = (com.realtybaron.jillow.types.Message) get_store().find_element_user(MESSAGE$2, 0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "message" element
     */
    public void setMessage(com.realtybaron.jillow.types.Message message) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Message target = null;
        target = (com.realtybaron.jillow.types.Message) get_store().find_element_user(MESSAGE$2, 0);
        if (target == null) {
          target = (com.realtybaron.jillow.types.Message) get_store().add_element_user(MESSAGE$2);
        }
        target.set(message);
      }
    }
    /**
     * Appends and returns a new empty "message" element
     */
    public com.realtybaron.jillow.types.Message addNewMessage() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.types.Message target = null;
        target = (com.realtybaron.jillow.types.Message) get_store().add_element_user(MESSAGE$2);
        return target;
      }
    }
    /**
     * Gets the "response" element
     */
    public com.realtybaron.jillow.chart.ChartDocument.Chart.Response getResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Response target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) get_store().find_element_user(RESPONSE$4,
                                                                                                           0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * True if has "response" element
     */
    public boolean isSetResponse() {
      synchronized (monitor()) {
        check_orphaned();
        return get_store().count_elements(RESPONSE$4) != 0;
      }
    }
    /**
     * Sets the "response" element
     */
    public void setResponse(com.realtybaron.jillow.chart.ChartDocument.Chart.Response response) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Response target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) get_store().find_element_user(RESPONSE$4,
                                                                                                           0);
        if (target == null) {
          target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) get_store().add_element_user(RESPONSE$4);
        }
        target.set(response);
      }
    }
    /**
     * Appends and returns a new empty "response" element
     */
    public com.realtybaron.jillow.chart.ChartDocument.Chart.Response addNewResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.ChartDocument.Chart.Response target = null;
        target = (com.realtybaron.jillow.chart.ChartDocument.Chart.Response) get_store().add_element_user(RESPONSE$4);
        return target;
      }
    }
    /**
     * Unsets the "response" element
     */
    public void unsetResponse() {
      synchronized (monitor()) {
        check_orphaned();
        get_store().remove_element(RESPONSE$4, 0);
      }
    }
    /**
     * An XML request(@).
     * <p/>
     * This is a complex type.
     */
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.ChartDocument.Chart.Request {
      public RequestImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName ZPID$0 = new javax.xml.namespace.QName("", "zpid");
      private static final javax.xml.namespace.QName UNITTYPE$2 = new javax.xml.namespace.QName("", "unit-type");
      private static final javax.xml.namespace.QName WIDTH$4 = new javax.xml.namespace.QName("", "width");
      private static final javax.xml.namespace.QName HEIGHT$6 = new javax.xml.namespace.QName("", "height");
      /**
       * Gets the "zpid" element
       */
      public java.lang.String getZpid() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "zpid" element
       */
      public org.apache.xmlbeans.XmlString xgetZpid() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZPID$0, 0);
          return target;
        }
      }
      /**
       * Sets the "zpid" element
       */
      public void setZpid(java.lang.String zpid) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZPID$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZPID$0);
          }
          target.setStringValue(zpid);
        }
      }
      /**
       * Sets (as xml) the "zpid" element
       */
      public void xsetZpid(org.apache.xmlbeans.XmlString zpid) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZPID$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(ZPID$0);
          }
          target.set(zpid);
        }
      }
      /**
       * Gets the "unit-type" element
       */
      public java.lang.String getUnitType() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(UNITTYPE$2, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "unit-type" element
       */
      public org.apache.xmlbeans.XmlString xgetUnitType() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(UNITTYPE$2, 0);
          return target;
        }
      }
      /**
       * Sets the "unit-type" element
       */
      public void setUnitType(java.lang.String unitType) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(UNITTYPE$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(UNITTYPE$2);
          }
          target.setStringValue(unitType);
        }
      }
      /**
       * Sets (as xml) the "unit-type" element
       */
      public void xsetUnitType(org.apache.xmlbeans.XmlString unitType) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(UNITTYPE$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(UNITTYPE$2);
          }
          target.set(unitType);
        }
      }
      /**
       * Gets the "width" element
       */
      public java.lang.String getWidth() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WIDTH$4, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "width" element
       */
      public org.apache.xmlbeans.XmlString xgetWidth() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(WIDTH$4, 0);
          return target;
        }
      }
      /**
       * True if has "width" element
       */
      public boolean isSetWidth() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(WIDTH$4) != 0;
        }
      }
      /**
       * Sets the "width" element
       */
      public void setWidth(java.lang.String width) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WIDTH$4, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(WIDTH$4);
          }
          target.setStringValue(width);
        }
      }
      /**
       * Sets (as xml) the "width" element
       */
      public void xsetWidth(org.apache.xmlbeans.XmlString width) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(WIDTH$4, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(WIDTH$4);
          }
          target.set(width);
        }
      }
      /**
       * Unsets the "width" element
       */
      public void unsetWidth() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(WIDTH$4, 0);
        }
      }
      /**
       * Gets the "height" element
       */
      public java.lang.String getHeight() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HEIGHT$6, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "height" element
       */
      public org.apache.xmlbeans.XmlString xgetHeight() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HEIGHT$6, 0);
          return target;
        }
      }
      /**
       * True if has "height" element
       */
      public boolean isSetHeight() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(HEIGHT$6) != 0;
        }
      }
      /**
       * Sets the "height" element
       */
      public void setHeight(java.lang.String height) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HEIGHT$6, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(HEIGHT$6);
          }
          target.setStringValue(height);
        }
      }
      /**
       * Sets (as xml) the "height" element
       */
      public void xsetHeight(org.apache.xmlbeans.XmlString height) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HEIGHT$6, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(HEIGHT$6);
          }
          target.set(height);
        }
      }
      /**
       * Unsets the "height" element
       */
      public void unsetHeight() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(HEIGHT$6, 0);
        }
      }
    }
    /**
     * An XML response(@).
     * <p/>
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.ChartDocument.Chart.Response {
      public ResponseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName URL$0 = new javax.xml.namespace.QName("", "url");
      private static final javax.xml.namespace.QName GRAPHSANDDATA$2 = new javax.xml.namespace.QName("",
                                                                                                     "graphsanddata");
      /**
       * Gets the "url" element
       */
      public java.lang.String getUrl() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(URL$0, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "url" element
       */
      public org.apache.xmlbeans.XmlString xgetUrl() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(URL$0, 0);
          return target;
        }
      }
      /**
       * Sets the "url" element
       */
      public void setUrl(java.lang.String url) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(URL$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(URL$0);
          }
          target.setStringValue(url);
        }
      }
      /**
       * Sets (as xml) the "url" element
       */
      public void xsetUrl(org.apache.xmlbeans.XmlString url) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(URL$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(URL$0);
          }
          target.set(url);
        }
      }
      /**
       * Gets the "graphsanddata" element
       */
      public java.lang.String getGraphsanddata() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(GRAPHSANDDATA$2, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "graphsanddata" element
       */
      public org.apache.xmlbeans.XmlString xgetGraphsanddata() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(GRAPHSANDDATA$2, 0);
          return target;
        }
      }
      /**
       * Sets the "graphsanddata" element
       */
      public void setGraphsanddata(java.lang.String graphsanddata) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(GRAPHSANDDATA$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(GRAPHSANDDATA$2);
          }
          target.setStringValue(graphsanddata);
        }
      }
      /**
       * Sets (as xml) the "graphsanddata" element
       */
      public void xsetGraphsanddata(org.apache.xmlbeans.XmlString graphsanddata) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(GRAPHSANDDATA$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(GRAPHSANDDATA$2);
          }
          target.set(graphsanddata);
        }
      }
    }
  }
}
