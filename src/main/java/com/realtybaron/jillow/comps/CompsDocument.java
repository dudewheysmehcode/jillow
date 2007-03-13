/*
 * An XML document type.
 * Localname: comps
 * Namespace: http://www.zillow.com/static/xsd/Comps.xsd
 * Java type: com.realtybaron.jillow.comps.CompsDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.comps;

/**
 * A document containing one comps(@http://www.zillow.com/static/xsd/Comps.xsd) element.
 * <p/>
 * This is a complex type.
 */
public interface CompsDocument extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("compsa769doctype");
  /**
   * Gets the "comps" element
   */
  com.realtybaron.jillow.comps.CompsDocument.Comps getComps();
  /**
   * Sets the "comps" element
   */
  void setComps(com.realtybaron.jillow.comps.CompsDocument.Comps comps);
  /**
   * Appends and returns a new empty "comps" element
   */
  com.realtybaron.jillow.comps.CompsDocument.Comps addNewComps();
  /**
   * An XML comps(@http://www.zillow.com/static/xsd/Comps.xsd).
   * <p/>
   * This is a complex type.
   */
  public interface Comps extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("comps5fb9elemtype");
    /**
     * Gets the "request" element
     */
    com.realtybaron.jillow.comps.CompsDocument.Comps.Request getRequest();
    /**
     * Sets the "request" element
     */
    void setRequest(com.realtybaron.jillow.comps.CompsDocument.Comps.Request request);
    /**
     * Appends and returns a new empty "request" element
     */
    com.realtybaron.jillow.comps.CompsDocument.Comps.Request addNewRequest();
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
    com.realtybaron.jillow.comps.CompsDocument.Comps.Response getResponse();
    /**
     * True if has "response" element
     */
    boolean isSetResponse();
    /**
     * Sets the "response" element
     */
    void setResponse(com.realtybaron.jillow.comps.CompsDocument.Comps.Response response);
    /**
     * Appends and returns a new empty "response" element
     */
    com.realtybaron.jillow.comps.CompsDocument.Comps.Response addNewResponse();
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
          .resolveHandle("request3dceelemtype");
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
       * Gets the "count" element
       */
      java.lang.String getCount();
      /**
       * Gets (as xml) the "count" element
       */
      org.apache.xmlbeans.XmlString xgetCount();
      /**
       * Sets the "count" element
       */
      void setCount(java.lang.String count);
      /**
       * Sets (as xml) the "count" element
       */
      void xsetCount(org.apache.xmlbeans.XmlString count);
      /**
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.comps.CompsDocument.Comps.Request newInstance() {
          return (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.comps.CompsDocument.Comps.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) org.apache
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
          .resolveHandle("response64ccelemtype");
      /**
       * Gets the "properties" element
       */
      com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties getProperties();
      /**
       * Sets the "properties" element
       */
      void setProperties(com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties properties);
      /**
       * Appends and returns a new empty "properties" element
       */
      com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties addNewProperties();
      /**
       * An XML properties(@).
       * <p/>
       * This is a complex type.
       */
      public interface Properties extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
            .system
            .s998C344FBF08CE4153FF8899A4788B33
            .TypeSystemHolder
            .typeSystem
            .resolveHandle("properties6f4belemtype");
        /**
         * Gets the "principal" element
         */
        com.realtybaron.jillow.types.SimpleProperty getPrincipal();
        /**
         * Sets the "principal" element
         */
        void setPrincipal(com.realtybaron.jillow.types.SimpleProperty principal);
        /**
         * Appends and returns a new empty "principal" element
         */
        com.realtybaron.jillow.types.SimpleProperty addNewPrincipal();
        /**
         * Gets the "comparables" element
         */
        com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables getComparables();
        /**
         * Sets the "comparables" element
         */
        void setComparables(com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables comparables);
        /**
         * Appends and returns a new empty "comparables" element
         */
        com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables addNewComparables();
        /**
         * An XML comparables(@).
         * <p/>
         * This is a complex type.
         */
        public interface Comparables extends org.apache.xmlbeans.XmlObject {
          public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
              .system
              .s998C344FBF08CE4153FF8899A4788B33
              .TypeSystemHolder
              .typeSystem
              .resolveHandle("comparables41d6elemtype");
          /**
           * Gets array of all "comp" elements
           */
          com.realtybaron.jillow.types.ComparableProperty[] getCompArray();
          /**
           * Gets ith "comp" element
           */
          com.realtybaron.jillow.types.ComparableProperty getCompArray(int i);
          /**
           * Returns number of "comp" element
           */
          int sizeOfCompArray();
          /**
           * Sets array of all "comp" element
           */
          void setCompArray(com.realtybaron.jillow.types.ComparableProperty[] compArray);
          /**
           * Sets ith "comp" element
           */
          void setCompArray(int i, com.realtybaron.jillow.types.ComparableProperty comp);
          /**
           * Inserts and returns a new empty value (as xml) as the ith "comp" element
           */
          com.realtybaron.jillow.types.ComparableProperty insertNewComp(int i);
          /**
           * Appends and returns a new empty value (as xml) as the last "comp" element
           */
          com.realtybaron.jillow.types.ComparableProperty addNewComp();
          /**
           * Removes the ith "comp" element
           */
          void removeComp(int i);
          /**
           * A factory class with static methods for creating instances of this type.
           */
          public static final class Factory {
            public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables newInstance() {
              return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) org.apache
                  .xmlbeans
                  .XmlBeans
                  .getContextTypeLoader()
                  .newInstance(type, null);
            }
            public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables newInstance(
                org.apache.xmlbeans.XmlOptions options) {
              return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) org.apache
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
          public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties newInstance() {
            return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) org.apache
                .xmlbeans
                .XmlBeans
                .getContextTypeLoader()
                .newInstance(type, null);
          }
          public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties newInstance(org.apache.xmlbeans.XmlOptions options) {
            return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) org.apache
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
        public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response newInstance() {
          return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.comps.CompsDocument.Comps.Response newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) org.apache
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
      public static com.realtybaron.jillow.comps.CompsDocument.Comps newInstance() {
        return (com.realtybaron.jillow.comps.CompsDocument.Comps) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.comps.CompsDocument.Comps newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.comps.CompsDocument.Comps) org.apache
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
    public static com.realtybaron.jillow.comps.CompsDocument newInstance() {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.lang.String xmlAsString) throws
                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.lang.String xmlAsString,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.File file) throws
                                                                                      org.apache.xmlbeans.XmlException,
                                                                                      java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.File file,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.net.URL u) throws
                                                                                   org.apache.xmlbeans.XmlException,
                                                                                   java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.net.URL u,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.InputStream is) throws
                                                                                           org.apache.xmlbeans.XmlException,
                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.InputStream is,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.Reader r) throws
                                                                                     org.apache.xmlbeans.XmlException,
                                                                                     java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(java.io.Reader r,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           java.io.IOException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                        org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(javax.xml.stream.XMLStreamReader sr,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(org.w3c.dom.Node node) throws
                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.comps.CompsDocument parse(org.w3c.dom.Node node,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.comps.CompsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                      org.apache.xmlbeans.XmlException,
                                                                                                                      org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.comps.CompsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                   org.apache.xmlbeans.XmlOptions options) throws
                                                                                                           org.apache.xmlbeans.XmlException,
                                                                                                           org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.comps.CompsDocument) org.apache
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
