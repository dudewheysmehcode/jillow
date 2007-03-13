/*
 * An XML document type.
 * Localname: searchresults
 * Namespace: http://www.zillow.com/static/xsd/SearchResults.xsd
 * Java type: com.realtybaron.jillow.search.SearchresultsDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.search.impl;

/**
 * A document containing one searchresults(@http://www.zillow.com/static/xsd/SearchResults.xsd) element.
 * <p/>
 * This is a complex type.
 */
public class SearchresultsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.search.SearchresultsDocument {
  public SearchresultsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName SEARCHRESULTS$0 = new javax.xml.namespace.QName(
      "http://www.zillow.com/static/xsd/SearchResults.xsd",
      "searchresults");
  /**
   * Gets the "searchresults" element
   */
  public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults getSearchresults() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.search.SearchresultsDocument.Searchresults target = null;
      target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) get_store().find_element_user(
          SEARCHRESULTS$0,
          0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "searchresults" element
   */
  public void setSearchresults(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults searchresults) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.search.SearchresultsDocument.Searchresults target = null;
      target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) get_store().find_element_user(
          SEARCHRESULTS$0,
          0);
      if (target == null) {
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) get_store().add_element_user(
            SEARCHRESULTS$0);
      }
      target.set(searchresults);
    }
  }
  /**
   * Appends and returns a new empty "searchresults" element
   */
  public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults addNewSearchresults() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.search.SearchresultsDocument.Searchresults target = null;
      target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults) get_store().add_element_user(
          SEARCHRESULTS$0);
      return target;
    }
  }
  /**
   * An XML searchresults(@http://www.zillow.com/static/xsd/SearchResults.xsd).
   * <p/>
   * This is a complex type.
   */
  public static class SearchresultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.search.SearchresultsDocument.Searchresults {
    public SearchresultsImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName REQUEST$0 = new javax.xml.namespace.QName("", "request");
    private static final javax.xml.namespace.QName MESSAGE$2 = new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName RESPONSE$4 = new javax.xml.namespace.QName("", "response");
    /**
     * Gets the "request" element
     */
    public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request getRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) get_store().find_element_user(
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
    public void setRequest(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request request) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) get_store().find_element_user(
            REQUEST$0,
            0);
        if (target == null) {
          target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) get_store().add_element_user(
              REQUEST$0);
        }
        target.set(request);
      }
    }
    /**
     * Appends and returns a new empty "request" element
     */
    public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request addNewRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request) get_store().add_element_user(
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
    public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response getResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) get_store().find_element_user(
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
    public void setResponse(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response response) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) get_store().find_element_user(
            RESPONSE$4,
            0);
        if (target == null) {
          target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) get_store().add_element_user(
              RESPONSE$4);
        }
        target.set(response);
      }
    }
    /**
     * Appends and returns a new empty "response" element
     */
    public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response addNewResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response target = null;
        target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response) get_store().add_element_user(
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
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Request {
      public RequestImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName ADDRESS$0 = new javax.xml.namespace.QName("", "address");
      private static final javax.xml.namespace.QName CITYSTATEZIP$2 = new javax.xml.namespace.QName("", "citystatezip");
      /**
       * Gets the "address" element
       */
      public java.lang.String getAddress() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ADDRESS$0, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "address" element
       */
      public org.apache.xmlbeans.XmlString xgetAddress() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ADDRESS$0, 0);
          return target;
        }
      }
      /**
       * Sets the "address" element
       */
      public void setAddress(java.lang.String address) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(ADDRESS$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(ADDRESS$0);
          }
          target.setStringValue(address);
        }
      }
      /**
       * Sets (as xml) the "address" element
       */
      public void xsetAddress(org.apache.xmlbeans.XmlString address) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(ADDRESS$0, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(ADDRESS$0);
          }
          target.set(address);
        }
      }
      /**
       * Gets the "citystatezip" element
       */
      public java.lang.String getCitystatezip() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITYSTATEZIP$2, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "citystatezip" element
       */
      public org.apache.xmlbeans.XmlString xgetCitystatezip() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITYSTATEZIP$2, 0);
          return target;
        }
      }
      /**
       * Sets the "citystatezip" element
       */
      public void setCitystatezip(java.lang.String citystatezip) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(CITYSTATEZIP$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(CITYSTATEZIP$2);
          }
          target.setStringValue(citystatezip);
        }
      }
      /**
       * Sets (as xml) the "citystatezip" element
       */
      public void xsetCitystatezip(org.apache.xmlbeans.XmlString citystatezip) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(CITYSTATEZIP$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(CITYSTATEZIP$2);
          }
          target.set(citystatezip);
        }
      }
    }
    /**
     * An XML response(@).
     * <p/>
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response {
      public ResponseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName RESULTS$0 = new javax.xml.namespace.QName("", "results");
      /**
       * Gets the "results" element
       */
      public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results getResults() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results target = null;
          target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) get_store().find_element_user(
              RESULTS$0,
              0);
          if (target == null) {
            return null;
          }
          return target;
        }
      }
      /**
       * Sets the "results" element
       */
      public void setResults(com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results results) {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results target = null;
          target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) get_store().find_element_user(
              RESULTS$0,
              0);
          if (target == null) {
            target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) get_store().add_element_user(
                RESULTS$0);
          }
          target.set(results);
        }
      }
      /**
       * Appends and returns a new empty "results" element
       */
      public com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results addNewResults() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results target = null;
          target = (com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results) get_store().add_element_user(
              RESULTS$0);
          return target;
        }
      }
      /**
       * An XML results(@).
       * <p/>
       * This is a complex type.
       */
      public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.search.SearchresultsDocument.Searchresults.Response.Results {
        public ResultsImpl(org.apache.xmlbeans.SchemaType sType) {
          super(sType);
        }
        private static final javax.xml.namespace.QName RESULT$0 = new javax.xml.namespace.QName("", "result");
        /**
         * Gets array of all "result" elements
         */
        public com.realtybaron.jillow.types.SimpleProperty[] getResultArray() {
          synchronized (monitor()) {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESULT$0, targetList);
            com.realtybaron.jillow.types.SimpleProperty[] result = new com.realtybaron.jillow.types.SimpleProperty[targetList
                .size()];
            targetList.toArray(result);
            return result;
          }
        }
        /**
         * Gets ith "result" element
         */
        public com.realtybaron.jillow.types.SimpleProperty getResultArray(int i) {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().find_element_user(RESULT$0, i);
            if (target == null) {
              throw new IndexOutOfBoundsException();
            }
            return target;
          }
        }
        /**
         * Returns number of "result" element
         */
        public int sizeOfResultArray() {
          synchronized (monitor()) {
            check_orphaned();
            return get_store().count_elements(RESULT$0);
          }
        }
        /**
         * Sets array of all "result" element
         */
        public void setResultArray(com.realtybaron.jillow.types.SimpleProperty[] resultArray) {
          synchronized (monitor()) {
            check_orphaned();
            arraySetterHelper(resultArray, RESULT$0);
          }
        }
        /**
         * Sets ith "result" element
         */
        public void setResultArray(int i, com.realtybaron.jillow.types.SimpleProperty result) {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().find_element_user(RESULT$0, i);
            if (target == null) {
              throw new IndexOutOfBoundsException();
            }
            target.set(result);
          }
        }
        /**
         * Inserts and returns a new empty value (as xml) as the ith "result" element
         */
        public com.realtybaron.jillow.types.SimpleProperty insertNewResult(int i) {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().insert_element_user(RESULT$0, i);
            return target;
          }
        }
        /**
         * Appends and returns a new empty value (as xml) as the last "result" element
         */
        public com.realtybaron.jillow.types.SimpleProperty addNewResult() {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().add_element_user(RESULT$0);
            return target;
          }
        }
        /**
         * Removes the ith "result" element
         */
        public void removeResult(int i) {
          synchronized (monitor()) {
            check_orphaned();
            get_store().remove_element(RESULT$0, i);
          }
        }
      }
    }
  }
}
