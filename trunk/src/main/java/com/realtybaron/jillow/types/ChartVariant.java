/*
 * XML Type:  ChartVariant
 * Namespace: http://www.zillow.com/static/xsd/ZillowTypes.xsd
 * Java type: com.realtybaron.jillow.types.ChartVariant
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.types;

/**
 * An XML ChartVariant(@http://www.zillow.com/static/xsd/ZillowTypes.xsd).
 * <p/>
 * This is an atomic type that is a restriction of org.apache.xmlbeans.XmlString.
 */
public interface ChartVariant extends org.apache.xmlbeans.XmlString {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("chartvariant2e82type");
  org.apache.xmlbeans.StringEnumAbstractBase enumValue();
  void set(org.apache.xmlbeans.StringEnumAbstractBase e);
  static final Enum HOMEDETAILS = Enum.forString("homedetails");
  static final Enum SHOWCASE = Enum.forString("showcase");
  static final Enum DETAILED = Enum.forString("detailed");
  static final Enum SEO = Enum.forString("seo");
  static final Enum PARTNER = Enum.forString("partner");
  static final int INT_HOMEDETAILS = Enum.INT_HOMEDETAILS;
  static final int INT_SHOWCASE = Enum.INT_SHOWCASE;
  static final int INT_DETAILED = Enum.INT_DETAILED;
  static final int INT_SEO = Enum.INT_SEO;
  static final int INT_PARTNER = Enum.INT_PARTNER;
  /**
   * Enumeration value class for com.realtybaron.jillow.types.ChartVariant. These enum values can be used as follows:
   * <pre>
   * enum.toString(); // returns the string value of the enum
   * enum.intValue(); // returns an int value, useful for switches
   * // e.g., case Enum.INT_HOMEDETAILS
   * Enum.forString(s); // returns the enum value for a string
   * Enum.forInt(i); // returns the enum value for an int
   * </pre>
   * Enumeration objects are immutable singleton objects that can be compared using == object equality. They have no
   * public constructor. See the constants defined within this class for all the valid values.
   */
  static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase {
    /**
     * Returns the enum value for a string, or null if none.
     */
    public static Enum forString(java.lang.String s) { return (Enum) table.forString(s); }
    /**
     * Returns the enum value corresponding to an int, or null if none.
     */
    public static Enum forInt(int i) { return (Enum) table.forInt(i); }
    private Enum(java.lang.String s, int i) { super(s, i); }
    static final int INT_HOMEDETAILS = 1;
    static final int INT_SHOWCASE = 2;
    static final int INT_DETAILED = 3;
    static final int INT_SEO = 4;
    static final int INT_PARTNER = 5;
    public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table = new org.apache.xmlbeans.StringEnumAbstractBase.Table(
        new Enum[]{
            new Enum("homedetails", INT_HOMEDETAILS),
            new Enum("showcase", INT_SHOWCASE),
            new Enum("detailed", INT_DETAILED),
            new Enum("seo", INT_SEO),
            new Enum("partner", INT_PARTNER),
        });
    private static final long serialVersionUID = 1L;
    private java.lang.Object readResolve() { return forInt(intValue()); }
  }
  /**
   * A factory class with static methods for creating instances of this type.
   */
  public static final class Factory {
    public static com.realtybaron.jillow.types.ChartVariant newValue(java.lang.Object obj) {
      return (com.realtybaron.jillow.types.ChartVariant) type.newValue(obj);
    }
    public static com.realtybaron.jillow.types.ChartVariant newInstance() {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.types.ChartVariant parse(java.lang.String xmlAsString) throws
                                                                                                org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.lang.String xmlAsString,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.File file) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.File file,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException,
                                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.net.URL u) throws
                                                                                  org.apache.xmlbeans.XmlException,
                                                                                  java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.net.URL u,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException,
                                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.InputStream is) throws
                                                                                          org.apache.xmlbeans.XmlException,
                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.InputStream is,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException,
                                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.Reader r) throws
                                                                                    org.apache.xmlbeans.XmlException,
                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(java.io.Reader r,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException,
                                                                                                          java.io.IOException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                       org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(javax.xml.stream.XMLStreamReader sr,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(org.w3c.dom.Node node) throws
                                                                                         org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.types.ChartVariant parse(org.w3c.dom.Node node,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.ChartVariant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                     org.apache.xmlbeans.XmlException,
                                                                                                                     org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.types.ChartVariant parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                  org.apache.xmlbeans.XmlOptions options) throws
                                                                                                          org.apache.xmlbeans.XmlException,
                                                                                                          org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.types.ChartVariant) org.apache
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
