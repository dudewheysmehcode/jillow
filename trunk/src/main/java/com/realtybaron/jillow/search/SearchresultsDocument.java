/*
 * An XML document type.
 * Localname: searchresults
 * Namespace: http://www.zillow.com/static/xsd/SearchResults.xsd
 * Java type: com.realtybaron.jillow.search.SearchresultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.search;

/**
 * A document containing one searchresults(@http://www.zillow.com/static/xsd/SearchResults.xsd) element.
 * <p/>
 * This is a complex type.
 */
public interface SearchresultsDocument extends org.apache.xmlbeans.XmlObject {
  public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans.system
      .s998C344FBF08CE4153FF8899A4788B33
      .TypeSystemHolder
      .typeSystem
      .resolveHandle("searchresults0f09doctype");
  /**
   * Gets the "searchresults" element
   */
  com.realtybaron.jillow.search.SearchresultsDocument.Searchresults getSearchresults();
  /**
   * Sets the "searchresults" element
   */
  void setSearchresults(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults searchresults);
  /**
   * Appends and returns a new empty "searchresults" element
   */
  com.realtybaron.jillow.search.SearchresultsDocument.Searchresults addNewSearchresults();
  /**
   * An XML searchresults(@http://www.zillow.com/static/xsd/SearchResults.xsd).
   * <p/>
   * This is a complex type.
   */
  public interface Searchresults extends org.apache.xmlbeans.XmlObject {
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
        .system
        .s998C344FBF08CE4153FF8899A4788B33
        .TypeSystemHolder
        .typeSystem
        .resolveHandle("searchresultsb50felemtype");
    /**
     * Gets the "request" element
     */
    com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request getRequest();
    /**
     * Sets the "request" element
     */
    void setRequest(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request request);
    /**
     * Appends and returns a new empty "request" element
     */
    com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request addNewRequest();
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
    com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response getResponse();
    /**
     * True if has "response" element
     */
    boolean isSetResponse();
    /**
     * Sets the "response" element
     */
    void setResponse(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response response);
    /**
     * Appends and returns a new empty "response" element
     */
    com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response addNewResponse();
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
          .resolveHandle("requeste424elemtype");
      /**
       * Gets the "address" element
       */
      java.lang.String getAddress();
      /**
       * Gets (as xml) the "address" element
       */
      org.apache.xmlbeans.XmlString xgetAddress();
      /**
       * Sets the "address" element
       */
      void setAddress(java.lang.String address);
      /**
       * Sets (as xml) the "address" element
       */
      void xsetAddress(org.apache.xmlbeans.XmlString address);
      /**
       * Gets the "citystatezip" element
       */
      java.lang.String getCitystatezip();
      /**
       * Gets (as xml) the "citystatezip" element
       */
      org.apache.xmlbeans.XmlString xgetCitystatezip();
      /**
       * Sets the "citystatezip" element
       */
      void setCitystatezip(java.lang.String citystatezip);
      /**
       * Sets (as xml) the "citystatezip" element
       */
      void xsetCitystatezip(org.apache.xmlbeans.XmlString citystatezip);
      /**
       * A factory class with static methods for creating instances of this type.
       */
      public static final class Factory {
        public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request newInstance() {
          return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) org.apache
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
          .resolveHandle("response7122elemtype");
      /**
       * Gets the "results" element
       */
      com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results getResults();
      /**
       * Sets the "results" element
       */
      void setResults(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results results);
      /**
       * Appends and returns a new empty "results" element
       */
      com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results addNewResults();
      /**
       * An XML results(@).
       * <p/>
       * This is a complex type.
       */
      public interface Results extends org.apache.xmlbeans.XmlObject {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType) schemaorg_apache_xmlbeans
            .system
            .s998C344FBF08CE4153FF8899A4788B33
            .TypeSystemHolder
            .typeSystem
            .resolveHandle("resultsd614elemtype");
        /**
         * Gets array of all "result" elements
         */
        com.realtybaron.jillow.types.SimpleProperty[] getResultArray();
        /**
         * Gets ith "result" element
         */
        com.realtybaron.jillow.types.SimpleProperty getResultArray(int i);
        /**
         * Returns number of "result" element
         */
        int sizeOfResultArray();
        /**
         * Sets array of all "result" element
         */
        void setResultArray(com.realtybaron.jillow.types.SimpleProperty[] resultArray);
        /**
         * Sets ith "result" element
         */
        void setResultArray(int i, com.realtybaron.jillow.types.SimpleProperty result);
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result" element
         */
        com.realtybaron.jillow.types.SimpleProperty insertNewResult(int i);
        /**
         * Appends and returns a new empty value (as xml) as the last "result" element
         */
        com.realtybaron.jillow.types.SimpleProperty addNewResult();
        /**
         * Removes the ith "result" element
         */
        void removeResult(int i);
        /**
         * A factory class with static methods for creating instances of this type.
         */
        public static final class Factory {
          public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results newInstance() {
            return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) org.apache
                .xmlbeans
                .XmlBeans
                .getContextTypeLoader()
                .newInstance(type, null);
          }
          public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results newInstance(
              org.apache.xmlbeans.XmlOptions options) {
            return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) org.apache
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
        public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response newInstance() {
          return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) org.apache
              .xmlbeans
              .XmlBeans
              .getContextTypeLoader()
              .newInstance(type, null);
        }
        public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) org.apache
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
      public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults newInstance() {
        return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) org.apache
            .xmlbeans
            .XmlBeans
            .getContextTypeLoader()
            .newInstance(type, null);
      }
      public static com.realtybaron.jillow.search.SearchresultsDocument.Searchresults newInstance(org.apache.xmlbeans.XmlOptions options) {
        return (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) org.apache
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
    public static com.realtybaron.jillow.search.SearchresultsDocument newInstance() {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument newInstance(org.apache.xmlbeans.XmlOptions options) {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .newInstance(type, options);
    }
    /**
     * @param xmlAsString the string value to parse
     */
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.lang.String xmlAsString) throws
                                                                                                          org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.lang.String xmlAsString,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xmlAsString, type, options);
    }
    /**
     * @param file the file from which to load an xml document
     */
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.File file) throws
                                                                                               org.apache.xmlbeans.XmlException,
                                                                                               java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.File file,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(file, type, options);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.net.URL u) throws
                                                                                            org.apache.xmlbeans.XmlException,
                                                                                            java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.net.URL u,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(u, type, options);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.InputStream is) throws
                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.InputStream is,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(is, type, options);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.Reader r) throws
                                                                                              org.apache.xmlbeans.XmlException,
                                                                                              java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(java.io.Reader r,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                    java.io.IOException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(r, type, options);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(javax.xml.stream.XMLStreamReader sr) throws
                                                                                                                 org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(javax.xml.stream.XMLStreamReader sr,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(sr, type, options);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(org.w3c.dom.Node node) throws
                                                                                                   org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, null);
    }
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(org.w3c.dom.Node node,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(node, type, options);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws
                                                                                                                               org.apache.xmlbeans.XmlException,
                                                                                                                               org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
          .xmlbeans
          .XmlBeans
          .getContextTypeLoader()
          .parse(xis, type, null);
    }
    /**
     * @deprecated {@link XMLInputStream}
     */
    public static com.realtybaron.jillow.search.SearchresultsDocument parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis,
                                                                            org.apache.xmlbeans.XmlOptions options) throws
                                                                                                                    org.apache.xmlbeans.XmlException,
                                                                                                                    org.apache.xmlbeans.xml.stream.XMLStreamException {
      return (com.realtybaron.jillow.search.SearchresultsDocument) org.apache
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
