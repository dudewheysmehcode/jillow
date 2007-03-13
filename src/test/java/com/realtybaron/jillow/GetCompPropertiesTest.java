package com.realtybaron.jillow;

import com.realtybaron.jillow.search.SearchResultsController;
import com.realtybaron.jillow.types.SimpleProperty;
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
public class GetCompPropertiesTest extends TestCase {
  private Log log = LogFactory.getLog(GetCompPropertiesTest.class);
  public static TestSuite suite() {
    return new TestSuite(GetCompPropertiesTest.class);
  }
  public void testWithZipcode() {
    SearchResultsController search = new SearchResultsController();
    try {
      SimpleProperty[] comps = search.getSimpleProperties("906 Stewart Drive", "75208");
      assertTrue("Unable to get comps with zip code", comps.length > 0);
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
  public void testWithCityState() {
    SearchResultsController search = new SearchResultsController();
    try {
      SimpleProperty[] comps = search.getSimpleProperties("906 Stewart Drive", "Dallas", "TX");
      assertTrue("Unable to get comps with city/state", comps.length > 0);
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
