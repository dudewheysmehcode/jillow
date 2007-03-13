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
public class ChartController extends AbstractWebServiceController {
  private Log log = LogFactory.getLog(ChartController.class);
  private final String PERCENT = "percent";
  private final String CURRENCY = "dollar";
  public ChartController() {
    super("/webservice/GetChart.htm");
  }
  /**
   * The GetChart API generates a URL for an image file that displays one-year historical Zestimates for a specific
   * property. The API accepts as input the Zillow Property ID as well as a chart type: either percentage or dollar
   * value change. Optionally, the API accepts width and height parameters that constrain the size of the image.
   *
   * @param zpid
   * @param width
   * @param height
   * @return
   * @throws ZillowException
   * @throws java.net.MalformedURLException
   */
  public URL getPercentageChart(long zpid, int width, int height) throws ZillowException, MalformedURLException {
    return getChartURL(zpid, PERCENT, width, height);
  }
  /**
   * The GetChart API generates a URL for an image file that displays one-year historical Zestimates for a specific
   * property. The API accepts as input the Zillow Property ID as well as a chart type: either percentage or dollar
   * value change. Optionally, the API accepts width and height parameters that constrain the size of the image.
   *
   * @param zpid
   * @param width
   * @param height
   * @return
   * @throws ZillowException
   * @throws MalformedURLException
   */
  public URL getCurrencyChart(long zpid, int width, int height) throws ZillowException, MalformedURLException {
    return getChartURL(zpid, CURRENCY, width, height);
  }
  private URL getChartURL(long zpid, String unit, int width, int height) throws ZillowException, MalformedURLException {
    //TODO: validate width and height
    Map<String, String> params = new HashMap<String, String>();
    params.put("zpid", String.valueOf(zpid));
    params.put("unit-type", unit);
    params.put("width", String.valueOf(width));
    params.put("height", String.valueOf(height));
    ChartDocument.Chart results = (ChartDocument.Chart) super.invokeWebService(params, new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return ChartDocument.Factory.parse(is).getChart();
      }
    });
    if (log.isDebugEnabled()) {
      log.debug("Chart in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return new URL(results.getResponse().getUrl());
  }
}
