package com.realtybaron.jillow;

import com.realtybaron.jillow.types.Message;
import org.apache.commons.io.IOUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.DefaultResourceLoader;

import java.io.*;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:22:52 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public abstract class AbstractWebServiceController {
  private Log log = LogFactory.getLog(AbstractWebServiceController.class);
  protected static final Properties CONFIG = new Properties();
  protected String protocol;
  protected String host;
  protected int port;
  protected String document;
  protected String zwsid;
  static {
    File configFile;
    try {
      configFile = new DefaultResourceLoader().getResource("classpath:zillow-api.properties").getFile();
      if (configFile.exists()) {
        CONFIG.load(new BufferedInputStream(new FileInputStream(configFile)));
      } else {
        throw new FileNotFoundException("Unable to find zillow-api.properties in the classpath");
      }
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
  protected AbstractWebServiceController(String document) {
    this.document = document;
    this.protocol = CONFIG.getProperty("protocol");
    this.host = CONFIG.getProperty("host");
    this.port = Integer.parseInt(CONFIG.getProperty("port"));
    this.zwsid = CONFIG.getProperty("zwsid");
  }
  protected Object invokeWebService(WebServiceTemplate template) {
    return invokeWebService(new HashMap<String, String>(), template);
  }
  protected Object invokeWebService(Map<String, String> params, WebServiceTemplate template) {
    if (params == null) {
      throw new IllegalArgumentException("Parameter Map is invalid");
    }
    if (template == null) {
      throw new IllegalArgumentException("Template is invalid");
    }
    InputStream is = null;
    try {
      params.put("zws-id", URLEncoder.encode(getZwsId(), "UTF-8"));
      String[] key = params.keySet().toArray(new String[0]);
      StringBuffer query = new StringBuffer().append(document);
      for (int i = 0; i < key.length; i++) {
        String s = key[i];
        query.append(i == 0 ? '?' : '&');
        query.append(s).append('=').append(URLEncoder.encode(params.get(s), "UTF-8"));
      }
      URL url = new URL(protocol, host, port, query.toString());
      if (log.isDebugEnabled()) {
        log.debug("Invoking Zillow API with URL: " + url);
      }
      is = url.openStream();
      return template.get(is);
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage(), e);
    } finally {
      IOUtils.closeQuietly(is);
    }
  }
  protected void validateSuccessfulResponse(Message msg) throws ZillowException {
    if (log.isDebugEnabled()) {
      log.debug("Response from Zillow: " + msg.getCode() + " - " + msg.getText());
    }
    if (msg.getCode().intValue() > 0) {
      throw new ZillowException(msg.getText());
    }
  }
  protected interface WebServiceTemplate {
    public Object get(InputStream is) throws Exception;
  }
  public String getProtocol() {
    return protocol;
  }
  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }
  public String getHost() {
    return host;
  }
  public void setHost(String host) {
    this.host = host;
  }
  public int getPort() {
    return port;
  }
  public void setPort(int port) {
    this.port = port;
  }
  public String getDocument() {
    return document;
  }
  public void setDocument(String document) {
    this.document = document;
  }
  public String getZwsId() {
    return zwsid;
  }
  public void setZwsId(String zwsid) {
    this.zwsid = zwsid;
  }
}
