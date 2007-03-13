package com.realtybaron.jillow.chart;

import com.realtybaron.jillow.AbstractWebServiceController;
import com.realtybaron.jillow.ZillowException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:32:54 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class RegionChartController extends AbstractWebServiceController {
  private Log log = LogFactory.getLog(RegionChartController.class);
  private final String PERCENT = "percent";
  private final String CURRENCY = "dollar";
  public RegionChartController() {
    super("/webservice/GetRegionChart.htm");
  }
  public URL getPercentageChartByZip(String zip, int width, int height) throws ZillowException, MalformedURLException {
    return getChartByZip(zip, PERCENT, width, height);
  }
  public URL getPercentageChartByCity(String city, String state, int width, int height) throws
                                                                                        ZillowException,
                                                                                        MalformedURLException {
    return getChartByCity(city, state, PERCENT, width, height);
  }
  public URL getPercentageChartByState(String state, int width, int height) throws
                                                                            ZillowException,
                                                                            MalformedURLException {
    return getChartByState(state, PERCENT, width, height);
  }
  public URL getCurrencyChartByZip(String zip, int width, int height) throws ZillowException, MalformedURLException {
    return getChartByZip(zip, CURRENCY, width, height);
  }
  public URL getCurrencyChartByCity(String city, String state, int width, int height) throws
                                                                                      ZillowException,
                                                                                      MalformedURLException {
    return getChartByCity(city, state, CURRENCY, width, height);
  }
  public URL getCurrencyChartByState(String state, int width, int height) throws
                                                                          ZillowException,
                                                                          MalformedURLException {
    return getChartByState(state, CURRENCY, width, height);
  }
  private URL getChartByZip(String zip, String unit, int width, int height) throws
                                                                            ZillowException,
                                                                            MalformedURLException {
    //TODO: validate width and height
    Map<String, String> params = new HashMap<String, String>();
    params.put("ZIP", zip);
    params.put("unit-type", unit);
    params.put("width", String.valueOf(width));
    params.put("height", String.valueOf(height));
    WebServiceTemplate template = new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return RegionchartDocument.Factory.parse(is).getRegionchart();
      }
    };
    RegionchartDocument.Regionchart results = (RegionchartDocument.Regionchart) super.invokeWebService(params,
                                                                                                       template);
    if (log.isDebugEnabled()) {
      log.debug("Chart in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return new URL(results.getResponse().getUrl());
  }
  private URL getChartByCity(String city, String state, String unit, int width, int height) throws
                                                                                            ZillowException,
                                                                                            MalformedURLException {
    //TODO: validate width and height
    Map<String, String> params = new HashMap<String, String>();
    params.put("city", city);
    params.put("state", state);
    params.put("unit-type", unit);
    params.put("width", String.valueOf(width));
    params.put("height", String.valueOf(height));
    WebServiceTemplate template = new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return RegionchartDocument.Factory.parse(is).getRegionchart();
      }
    };
    RegionchartDocument.Regionchart results = (RegionchartDocument.Regionchart) super.invokeWebService(params,
                                                                                                       template);
    if (log.isDebugEnabled()) {
      log.debug("Chart in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return new URL(results.getResponse().getUrl());
  }
  private URL getChartByState(String state, String unit, int width, int height) throws
                                                                                ZillowException,
                                                                                MalformedURLException {
    //TODO: validate width and height
    Map<String, String> params = new HashMap<String, String>();
    params.put("state", state);
    params.put("unit-type", unit);
    params.put("width", String.valueOf(width));
    params.put("height", String.valueOf(height));
    WebServiceTemplate template = new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return RegionchartDocument.Factory.parse(is).getRegionchart();
      }
    };
    RegionchartDocument.Regionchart results = (RegionchartDocument.Regionchart) super.invokeWebService(params,
                                                                                                       template);
    if (log.isDebugEnabled()) {
      log.debug("Chart in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return new URL(results.getResponse().getUrl());
  }
}
