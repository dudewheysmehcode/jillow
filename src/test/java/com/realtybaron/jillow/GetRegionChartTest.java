package com.realtybaron.zillow;

import com.realtybaron.zillow.chart.RegionChartController;
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
public class GetRegionChartTest extends TestCase {
  private Log log = LogFactory.getLog(GetRegionChartTest.class);
  public static TestSuite suite() {
    return new TestSuite(GetRegionChartTest.class);
  }
  public void testPercentageByZip() {
    try {
      URL chartUrl = new RegionChartController().getPercentageChartByZip("78704", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request % chart by zip", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testPercentageByCity() {
    try {
      URL chartUrl = new RegionChartController().getPercentageChartByCity("Dallas", "TX", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request % chart by city", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testPercentageByState() {
    try {
      URL chartUrl = new RegionChartController().getPercentageChartByState("TX", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request % chart by state", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testCurrencyByZip() {
    try {
      URL chartUrl = new RegionChartController().getCurrencyChartByZip("78704", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request $ chart by zip", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testCurrencyByCity() {
    try {
      URL chartUrl = new RegionChartController().getCurrencyChartByCity("Dallas", "TX", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request $ chart by city", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testCurrencyByState() {
    try {
      URL chartUrl = new RegionChartController().getCurrencyChartByState("TX", 400, 300);
      HttpURLConnection conn = (HttpURLConnection) chartUrl.openConnection();
      conn.connect();
      assertEquals("Unable to request $ chart by state", 200, conn.getResponseCode());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
