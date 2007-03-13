/*
 * An XML document type.
 * Localname: comps
 * Namespace: http://www.zillow.com/static/xsd/Comps.xsd
 * Java type: com.realtybaron.jillow.comps.CompsDocument
 *
 * Automatically generated - do not modify.
 */
package com.realtybaron.jillow.comps.impl;

/**
 * A document containing one comps(@http://www.zillow.com/static/xsd/Comps.xsd) element.
 * <p/>
 * This is a complex type.
 */
public class CompsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument {
  public CompsDocumentImpl(org.apache.xmlbeans.SchemaType sType) {
    super(sType);
  }
  private static final javax.xml.namespace.QName COMPS$0 = new javax.xml.namespace.QName(
      "http://www.zillow.com/static/xsd/Comps.xsd",
      "comps");
  /**
   * Gets the "comps" element
   */
  public com.realtybaron.jillow.comps.CompsDocument.Comps getComps() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.comps.CompsDocument.Comps target = null;
      target = (com.realtybaron.jillow.comps.CompsDocument.Comps) get_store().find_element_user(COMPS$0, 0);
      if (target == null) {
        return null;
      }
      return target;
    }
  }
  /**
   * Sets the "comps" element
   */
  public void setComps(com.realtybaron.jillow.comps.CompsDocument.Comps comps) {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.comps.CompsDocument.Comps target = null;
      target = (com.realtybaron.jillow.comps.CompsDocument.Comps) get_store().find_element_user(COMPS$0, 0);
      if (target == null) {
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps) get_store().add_element_user(COMPS$0);
      }
      target.set(comps);
    }
  }
  /**
   * Appends and returns a new empty "comps" element
   */
  public com.realtybaron.jillow.comps.CompsDocument.Comps addNewComps() {
    synchronized (monitor()) {
      check_orphaned();
      com.realtybaron.jillow.comps.CompsDocument.Comps target = null;
      target = (com.realtybaron.jillow.comps.CompsDocument.Comps) get_store().add_element_user(COMPS$0);
      return target;
    }
  }
  /**
   * An XML comps(@http://www.zillow.com/static/xsd/Comps.xsd).
   * <p/>
   * This is a complex type.
   */
  public static class CompsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument.Comps {
    public CompsImpl(org.apache.xmlbeans.SchemaType sType) {
      super(sType);
    }
    private static final javax.xml.namespace.QName REQUEST$0 = new javax.xml.namespace.QName("", "request");
    private static final javax.xml.namespace.QName MESSAGE$2 = new javax.xml.namespace.QName("", "message");
    private static final javax.xml.namespace.QName RESPONSE$4 = new javax.xml.namespace.QName("", "response");
    /**
     * Gets the "request" element
     */
    public com.realtybaron.jillow.comps.CompsDocument.Comps.Request getRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Request target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) get_store().find_element_user(REQUEST$0, 0);
        if (target == null) {
          return null;
        }
        return target;
      }
    }
    /**
     * Sets the "request" element
     */
    public void setRequest(com.realtybaron.jillow.comps.CompsDocument.Comps.Request request) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Request target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) get_store().find_element_user(REQUEST$0, 0);
        if (target == null) {
          target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) get_store().add_element_user(REQUEST$0);
        }
        target.set(request);
      }
    }
    /**
     * Appends and returns a new empty "request" element
     */
    public com.realtybaron.jillow.comps.CompsDocument.Comps.Request addNewRequest() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Request target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Request) get_store().add_element_user(REQUEST$0);
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
    public com.realtybaron.jillow.comps.CompsDocument.Comps.Response getResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Response target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) get_store().find_element_user(RESPONSE$4,
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
    public void setResponse(com.realtybaron.jillow.comps.CompsDocument.Comps.Response response) {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Response target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) get_store().find_element_user(RESPONSE$4,
                                                                                                           0);
        if (target == null) {
          target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) get_store().add_element_user(RESPONSE$4);
        }
        target.set(response);
      }
    }
    /**
     * Appends and returns a new empty "response" element
     */
    public com.realtybaron.jillow.comps.CompsDocument.Comps.Response addNewResponse() {
      synchronized (monitor()) {
        check_orphaned();
        com.realtybaron.jillow.comps.CompsDocument.Comps.Response target = null;
        target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response) get_store().add_element_user(RESPONSE$4);
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
    public static class RequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument.Comps.Request {
      public RequestImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName ZPID$0 = new javax.xml.namespace.QName("", "zpid");
      private static final javax.xml.namespace.QName COUNT$2 = new javax.xml.namespace.QName("", "count");
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
       * Gets the "count" element
       */
      public java.lang.String getCount() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COUNT$2, 0);
          if (target == null) {
            return null;
          }
          return target.getStringValue();
        }
      }
      /**
       * Gets (as xml) the "count" element
       */
      public org.apache.xmlbeans.XmlString xgetCount() {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(COUNT$2, 0);
          return target;
        }
      }
      /**
       * Sets the "count" element
       */
      public void setCount(java.lang.String count) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.SimpleValue target = null;
          target = (org.apache.xmlbeans.SimpleValue) get_store().find_element_user(COUNT$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.SimpleValue) get_store().add_element_user(COUNT$2);
          }
          target.setStringValue(count);
        }
      }
      /**
       * Sets (as xml) the "count" element
       */
      public void xsetCount(org.apache.xmlbeans.XmlString count) {
        synchronized (monitor()) {
          check_orphaned();
          org.apache.xmlbeans.XmlString target = null;
          target = (org.apache.xmlbeans.XmlString) get_store().find_element_user(COUNT$2, 0);
          if (target == null) {
            target = (org.apache.xmlbeans.XmlString) get_store().add_element_user(COUNT$2);
          }
          target.set(count);
        }
      }
    }
    /**
     * An XML response(@).
     * <p/>
     * This is a complex type.
     */
    public static class ResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument.Comps.Response {
      public ResponseImpl(org.apache.xmlbeans.SchemaType sType) {
        super(sType);
      }
      private static final javax.xml.namespace.QName PROPERTIES$0 = new javax.xml.namespace.QName("", "properties");
      /**
       * Gets the "properties" element
       */
      public com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties getProperties() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties target = null;
          target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) get_store().find_element_user(
              PROPERTIES$0,
              0);
          if (target == null) {
            return null;
          }
          return target;
        }
      }
      /**
       * Sets the "properties" element
       */
      public void setProperties(com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties properties) {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties target = null;
          target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) get_store().find_element_user(
              PROPERTIES$0,
              0);
          if (target == null) {
            target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) get_store().add_element_user(
                PROPERTIES$0);
          }
          target.set(properties);
        }
      }
      /**
       * Appends and returns a new empty "properties" element
       */
      public com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties addNewProperties() {
        synchronized (monitor()) {
          check_orphaned();
          com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties target = null;
          target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties) get_store().add_element_user(
              PROPERTIES$0);
          return target;
        }
      }
      /**
       * An XML properties(@).
       * <p/>
       * This is a complex type.
       */
      public static class PropertiesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties {
        public PropertiesImpl(org.apache.xmlbeans.SchemaType sType) {
          super(sType);
        }
        private static final javax.xml.namespace.QName PRINCIPAL$0 = new javax.xml.namespace.QName("", "principal");
        private static final javax.xml.namespace.QName COMPARABLES$2 = new javax.xml.namespace.QName("", "comparables");
        /**
         * Gets the "principal" element
         */
        public com.realtybaron.jillow.types.SimpleProperty getPrincipal() {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().find_element_user(PRINCIPAL$0, 0);
            if (target == null) {
              return null;
            }
            return target;
          }
        }
        /**
         * Sets the "principal" element
         */
        public void setPrincipal(com.realtybaron.jillow.types.SimpleProperty principal) {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().find_element_user(PRINCIPAL$0, 0);
            if (target == null) {
              target = (com.realtybaron.jillow.types.SimpleProperty) get_store().add_element_user(PRINCIPAL$0);
            }
            target.set(principal);
          }
        }
        /**
         * Appends and returns a new empty "principal" element
         */
        public com.realtybaron.jillow.types.SimpleProperty addNewPrincipal() {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.types.SimpleProperty target = null;
            target = (com.realtybaron.jillow.types.SimpleProperty) get_store().add_element_user(PRINCIPAL$0);
            return target;
          }
        }
        /**
         * Gets the "comparables" element
         */
        public com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables getComparables() {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables target = null;
            target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) get_store().find_element_user(
                COMPARABLES$2,
                0);
            if (target == null) {
              return null;
            }
            return target;
          }
        }
        /**
         * Sets the "comparables" element
         */
        public void setComparables(com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables comparables) {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables target = null;
            target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) get_store().find_element_user(
                COMPARABLES$2,
                0);
            if (target == null) {
              target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) get_store().add_element_user(
                  COMPARABLES$2);
            }
            target.set(comparables);
          }
        }
        /**
         * Appends and returns a new empty "comparables" element
         */
        public com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables addNewComparables() {
          synchronized (monitor()) {
            check_orphaned();
            com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables target = null;
            target = (com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables) get_store().add_element_user(
                COMPARABLES$2);
            return target;
          }
        }
        /**
         * An XML comparables(@).
         * <p/>
         * This is a complex type.
         */
        public static class ComparablesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.realtybaron.jillow.comps.CompsDocument.Comps.Response.Properties.Comparables {
          public ComparablesImpl(org.apache.xmlbeans.SchemaType sType) {
            super(sType);
          }
          private static final javax.xml.namespace.QName COMP$0 = new javax.xml.namespace.QName("", "comp");
          /**
           * Gets array of all "comp" elements
           */
          public com.realtybaron.jillow.types.ComparableProperty[] getCompArray() {
            synchronized (monitor()) {
              check_orphaned();
              java.util.List targetList = new java.util.ArrayList();
              get_store().find_all_element_users(COMP$0, targetList);
              com.realtybaron.jillow.types.ComparableProperty[] result = new com.realtybaron.jillow.types.ComparableProperty[targetList
                  .size()];
              targetList.toArray(result);
              return result;
            }
          }
          /**
           * Gets ith "comp" element
           */
          public com.realtybaron.jillow.types.ComparableProperty getCompArray(int i) {
            synchronized (monitor()) {
              check_orphaned();
              com.realtybaron.jillow.types.ComparableProperty target = null;
              target = (com.realtybaron.jillow.types.ComparableProperty) get_store().find_element_user(COMP$0, i);
              if (target == null) {
                throw new IndexOutOfBoundsException();
              }
              return target;
            }
          }
          /**
           * Returns number of "comp" element
           */
          public int sizeOfCompArray() {
            synchronized (monitor()) {
              check_orphaned();
              return get_store().count_elements(COMP$0);
            }
          }
          /**
           * Sets array of all "comp" element
           */
          public void setCompArray(com.realtybaron.jillow.types.ComparableProperty[] compArray) {
            synchronized (monitor()) {
              check_orphaned();
              arraySetterHelper(compArray, COMP$0);
            }
          }
          /**
           * Sets ith "comp" element
           */
          public void setCompArray(int i, com.realtybaron.jillow.types.ComparableProperty comp) {
            synchronized (monitor()) {
              check_orphaned();
              com.realtybaron.jillow.types.ComparableProperty target = null;
              target = (com.realtybaron.jillow.types.ComparableProperty) get_store().find_element_user(COMP$0, i);
              if (target == null) {
                throw new IndexOutOfBoundsException();
              }
              target.set(comp);
            }
          }
          /**
           * Inserts and returns a new empty value (as xml) as the ith "comp" element
           */
          public com.realtybaron.jillow.types.ComparableProperty insertNewComp(int i) {
            synchronized (monitor()) {
              check_orphaned();
              com.realtybaron.jillow.types.ComparableProperty target = null;
              target = (com.realtybaron.jillow.types.ComparableProperty) get_store().insert_element_user(COMP$0, i);
              return target;
            }
          }
          /**
           * Appends and returns a new empty value (as xml) as the last "comp" element
           */
          public com.realtybaron.jillow.types.ComparableProperty addNewComp() {
            synchronized (monitor()) {
              check_orphaned();
              com.realtybaron.jillow.types.ComparableProperty target = null;
              target = (com.realtybaron.jillow.types.ComparableProperty) get_store().add_element_user(COMP$0);
              return target;
            }
          }
          /**
           * Removes the ith "comp" element
           */
          public void removeComp(int i) {
            synchronized (monitor()) {
              check_orphaned();
              get_store().remove_element(COMP$0, i);
            }
          }
        }
      }
    }
  }
}
