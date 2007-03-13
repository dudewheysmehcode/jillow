package com.realtybaron.zillow;

import com.realtybaron.zillow.search.SearchResultsController;
import com.realtybaron.zillow.types.SimpleProperty;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:16:39 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class SimpleSearchTest extends TestCase {
  private Log log = LogFactory.getLog(SimpleSearchTest.class);
  public static TestSuite suite() {
    return new TestSuite(SimpleSearchTest.class);
  }
  public void testWithZipcode() {
    SearchResultsController search = new SearchResultsController();
    try {
      SimpleProperty myprop = search.getSimpleProperty("906 Stewart Drive", "75208");
      assertEquals("Unable to get my home using zip code", "906 Stewart Dr", myprop.getAddress().getStreet());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testWithCityState() {
    SearchResultsController search = new SearchResultsController();
    try {
      SimpleProperty myprop = search.getSimpleProperty("906 Stewart Drive", "Dallas", "TX");
      assertEquals("Unable to get my home using city/state", "906 Stewart Dr", myprop.getAddress().getStreet());
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
