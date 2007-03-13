/*
 * An XML document type.
 * Localname: regionchart
 * Namespace: http://www.zillow.com/static/xsd/RegionChart.xsd
 * Java type: com.realtybaron.jillow.chart.RegionchartDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.chart.impl;

/**
 * A document containing one regionchart(@http://www.zillow.com/static/xsd/RegionChart.xsd) element.
 * <p/>
 * This is a complex type.
 */
public class RegionchartDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.RegionchartDocument {
  public RegionchartDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName REGIONCHART$0 = new javax.xml.namespace.QName(
      "http://www.zillow.com/static/xsd/RegionChart.xsd",
      "regionchart");
  /**
   * Gets the "regionchart" element
   */
  public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart getRegionchart() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.RegionchartDocument.Regionchart target = null;
      target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) get_store().find_element_user(
          REGIONCHART$0,
          0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "regionchart" element
   */
  public void setRegionchart(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart regionchart) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.RegionchartDocument.Regionchart target = null;
      target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) get_store().find_element_user(
          REGIONCHART$0,
          0);
      if (target == null) {
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) get_store().add_element_user(
            REGIONCHART$0);
      }
      target.set(regionchart);
    }
  }
  /**
   * Appends and returns a new empty "regionchart" element
   */
  public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart addNewRegionchart() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.chart.RegionchartDocument.Regionchart target = null;
      target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart) get_store().add_element_user(REGIONCHART$0);
      return target;
    }
  }
  /**
   * An XML regionchart(@http://www.zillow.com/static/xsd/RegionChart.xsd).
   * <p/>
   * This is a complex type.
   */
  public static class RegionchartImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.RegionchartDocument.Regionchart {
    public RegionchartImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName REQUEST$0 = new javax.xml.namespace.QName("", "request");
    private static final javax.xml.namespace.QName MESSAGE$2 = new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName RESPONSE$4 = new javax.xml.namespace.QName("", "response");
    /**
     * Gets the "request" element
     */
    public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request getRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) get_store().find_element_user(
            REQUEST$0,
            0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "request" element
     */
    public void setRequest(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request request) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) get_store().find_element_user(
            REQUEST$0,
            0);
        if (target == null) {
          target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) get_store().add_element_user(
              REQUEST$0);
        }
        target.set(request);
      }
    }
    /**
     * Appends and returns a new empty "request" element
     */
    public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request addNewRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request) get_store().add_element_user(
            REQUEST$0);
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
    public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response getResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) get_store().find_element_user(
            RESPONSE$4,
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
    public void setResponse(com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response response) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) get_store().find_element_user(
            RESPONSE$4,
            0);
        if (target == null) {
          target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) get_store().add_element_user(
              RESPONSE$4);
        }
        target.set(response);
      }
    }
    /**
     * Appends and returns a new empty "response" element
     */
    public com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response addNewResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response target = null;
        target = (com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response) get_store().add_element_user(
            RESPONSE$4);
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
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Request {
      public RequestImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName CITY$0 = new javax.xml.namespace.QName("", "city");
      private static final javax.xml.namespace.QName STATE$2 = new javax.xml.namespace.QName("", "state");
      private static final javax.xml.namespace.QName ZIP$4 = new javax.xml.namespace.QName("", "zip");
      private static final javax.xml.namespace.QName UNITTYPE$6 = new javax.xml.namespace.QName("", "unit-type");
      private static final javax.xml.namespace.QName WIDTH$8 = new javax.xml.namespace.QName("", "width");
      private static final javax.xml.namespace.QName HEIGHT$10 = new javax.xml.namespace.QName("", "height");
      private static final javax.xml.namespace.QName CHARTDURATION$12 = new javax.xml.namespace.QName("",
                                                                                                      "chartDuration");
      private static final javax.xml.namespace.QName CHARTVARIANT$14 = new javax.xml.namespace.QName("",
                                                                                                     "chartVariant");
      /**
       * Gets the "city" element
       */
      public java.lang.String getCity() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITY$0, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "city" element
       */
      public org.apache.xmlbeans.XmlString xgetCity() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITY$0, 0);
          return target;
        }
      }
      /**
       * True if has "city" element
       */
      public boolean isSetCity() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(CITY$0) != 0;
        }
      }
      /**
       * Sets the "city" element
       */
      public void setCity(java.lang.String city) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITY$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CITY$0);
          }
          target.setStringValue(city);
        }
      }
      /**
       * Sets (as xml) the "city" element
       */
      public void xsetCity(org.apache.xmlbeans.XmlString city) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITY$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(CITY$0);
          }
          target.set(city);
        }
      }
      /**
       * Unsets the "city" element
       */
      public void unsetCity() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(CITY$0, 0);
        }
      }
      /**
       * Gets the "state" element
       */
      public java.lang.String getState() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATE$2, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "state" element
       */
      public org.apache.xmlbeans.XmlString xgetState() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STATE$2, 0);
          return target;
        }
      }
      /**
       * True if has "state" element
       */
      public boolean isSetState() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(STATE$2) != 0;
        }
      }
      /**
       * Sets the "state" element
       */
      public void setState(java.lang.String state) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(STATE$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(STATE$2);
          }
          target.setStringValue(state);
        }
      }
      /**
       * Sets (as xml) the "state" element
       */
      public void xsetState(org.apache.xmlbeans.XmlString state) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(STATE$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(STATE$2);
          }
          target.set(state);
        }
      }
      /**
       * Unsets the "state" element
       */
      public void unsetState() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(STATE$2, 0);
        }
      }
      /**
       * Gets the "zip" element
       */
      public java.lang.String getZip() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIP$4, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "zip" element
       */
      public org.apache.xmlbeans.XmlString xgetZip() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZIP$4, 0);
          return target;
        }
      }
      /**
       * True if has "zip" element
       */
      public boolean isSetZip() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(ZIP$4) != 0;
        }
      }
      /**
       * Sets the "zip" element
       */
      public void setZip(java.lang.String zip) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ZIP$4, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ZIP$4);
          }
          target.setStringValue(zip);
        }
      }
      /**
       * Sets (as xml) the "zip" element
       */
      public void xsetZip(org.apache.xmlbeans.XmlString zip) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ZIP$4, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(ZIP$4);
          }
          target.set(zip);
        }
      }
      /**
       * Unsets the "zip" element
       */
      public void unsetZip() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(ZIP$4, 0);
        }
      }
      /**
       * Gets the "unit-type" element
       */
      public java.lang.String getUnitType() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(UNITTYPE$6, 0);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(UNITTYPE$6, 0);
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
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(UNITTYPE$6, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(UNITTYPE$6);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(UNITTYPE$6, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(UNITTYPE$6);
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
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WIDTH$8, 0);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(WIDTH$8, 0);
          return target;
        }
      }
      /**
       * True if has "width" element
       */
      public boolean isSetWidth() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(WIDTH$8) != 0;
        }
      }
      /**
       * Sets the "width" element
       */
      public void setWidth(java.lang.String width) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(WIDTH$8, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(WIDTH$8);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(WIDTH$8, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(WIDTH$8);
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
          get_store().remove_element(WIDTH$8, 0);
        }
      }
      /**
       * Gets the "height" element
       */
      public java.lang.String getHeight() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HEIGHT$10, 0);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HEIGHT$10, 0);
          return target;
        }
      }
      /**
       * True if has "height" element
       */
      public boolean isSetHeight() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(HEIGHT$10) != 0;
        }
      }
      /**
       * Sets the "height" element
       */
      public void setHeight(java.lang.String height) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(HEIGHT$10, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(HEIGHT$10);
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
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(HEIGHT$10, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(HEIGHT$10);
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
          get_store().remove_element(HEIGHT$10, 0);
        }
      }
      /**
       * Gets the "chartDuration" element
       */
      public com.realtybaron.jillow.types.ChartDuration.Enum getChartDuration() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CHARTDURATION$12, 0);
          if (target == null) {
            return null;
          }
          return (com.realtybaron.jillow.types.ChartDuration.Enum) target.getEnumValue();
        }
      }
      /**
       * Gets (as xml) the "chartDuration" element
       */
      public com.realtybaron.jillow.types.SimpleChartDuration xgetChartDuration() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.types.SimpleChartDuration target = null;
          target = (com.realtybaron.jillow.types.SimpleChartDuration) get_store().find_element_user(CHARTDURATION$12,
                                                                                                    0);
          return target;
        }
      }
      /**
       * True if has "chartDuration" element
       */
      public boolean isSetChartDuration() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(CHARTDURATION$12) != 0;
        }
      }
      /**
       * Sets the "chartDuration" element
       */
      public void setChartDuration(com.realtybaron.jillow.types.ChartDuration.Enum chartDuration) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CHARTDURATION$12, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CHARTDURATION$12);
          }
          target.setEnumValue(chartDuration);
        }
      }
      /**
       * Sets (as xml) the "chartDuration" element
       */
      public void xsetChartDuration(com.realtybaron.jillow.types.SimpleChartDuration chartDuration) {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.types.SimpleChartDuration target = null;
          target = (com.realtybaron.jillow.types.SimpleChartDuration) get_store().find_element_user(CHARTDURATION$12,
                                                                                                    0);
          if (target == null) {
            target = (com.realtybaron.jillow.types.SimpleChartDuration) get_store().add_element_user(CHARTDURATION$12);
          }
          target.set(chartDuration);
        }
      }
      /**
       * Unsets the "chartDuration" element
       */
      public void unsetChartDuration() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(CHARTDURATION$12, 0);
        }
      }
      /**
       * Gets the "chartVariant" element
       */
      public com.realtybaron.jillow.types.ChartVariant.Enum getChartVariant() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CHARTVARIANT$14, 0);
          if (target == null) {
            return null;
          }
          return (com.realtybaron.jillow.types.ChartVariant.Enum) target.getEnumValue();
        }
      }
      /**
       * Gets (as xml) the "chartVariant" element
       */
      public com.realtybaron.jillow.types.ChartVariant xgetChartVariant() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.types.ChartVariant target = null;
          target = (com.realtybaron.jillow.types.ChartVariant) get_store().find_element_user(CHARTVARIANT$14, 0);
          return target;
        }
      }
      /**
       * True if has "chartVariant" element
       */
      public boolean isSetChartVariant() {
        synchronized (monitor()) {
          check_orphaned();
          return get_store().count_elements(CHARTVARIANT$14) != 0;
        }
      }
      /**
       * Sets the "chartVariant" element
       */
      public void setChartVariant(com.realtybaron.jillow.types.ChartVariant.Enum chartVariant) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CHARTVARIANT$14, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CHARTVARIANT$14);
          }
          target.setEnumValue(chartVariant);
        }
      }
      /**
       * Sets (as xml) the "chartVariant" element
       */
      public void xsetChartVariant(com.realtybaron.jillow.types.ChartVariant chartVariant) {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.types.ChartVariant target = null;
          target = (com.realtybaron.jillow.types.ChartVariant) get_store().find_element_user(CHARTVARIANT$14, 0);
          if (target == null) {
            target = (com.realtybaron.jillow.types.ChartVariant) get_store().add_element_user(CHARTVARIANT$14);
          }
          target.set(chartVariant);
        }
      }
      /**
       * Unsets the "chartVariant" element
       */
      public void unsetChartVariant() {
        synchronized (monitor()) {
          check_orphaned();
          get_store().remove_element(CHARTVARIANT$14, 0);
        }
      }
    }
    /**
     * An XML response(@).
     * <p/>
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.chart.RegionchartDocument.Regionchart.Response {
      public ResponseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName URL$0 = new javax.xml.namespace.QName("", "url");
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
    }
  }
}
