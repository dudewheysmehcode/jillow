package com.realtybaron.jillow;

import com.realtybaron.jillow.chart.ChartController;
import com.realtybaron.jillow.search.SearchResultsController;
import com.realtybaron.jillow.types.SimpleProperty;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:16:39 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class GetChartTest extends TestCase {
  private Log log = LogFactory.getLog(GetChartTest.class);
  public static TestSuite suite() {
    return new TestSuite(GetChartTest.class);
  }
  public void testPercentageByZip() {
    try {
      SimpleProperty myprop = new SearchResultsController().getSimpleProperty("906 Stewart Drive", "75208");
      URL chartUrl = new ChartController().getPercentageChart(myprop.getZpid(), 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request % chart by zip", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testCurrencyByZip() {
    try {
      SimpleProperty myprop = new SearchResultsController().getSimpleProperty("906 Stewart Drive", "75208");
      URL chartUrl = new ChartController().getCurrencyChart(myprop.getZpid(), 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request $ chart by zip", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
