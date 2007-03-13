package com.realtybaron.jillow;

import com.realtybaron.jillow.search.DeepSearchResultsController;
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
public class DeepSearchTest extends TestCase {
  private Log log = LogFactory.getLog(DeepSearchTest.class);
  public static TestSuite suite() {
    return new TestSuite(DeepSearchTest.class);
  }
  public void testWithZipcode() {
    SearchResultsController search = new DeepSearchResultsController();
    try {
      SimpleProperty myprop = search.getSimpleProperty("906 Stewart Drive", "75208");
      assertEquals("Unable to get my home using zip code", "906 Stewart Dr", myprop.getAddress().getStreet());
      assertTrue("Unable to get bedroom count", myprop.getBedrooms() != null);
      assertTrue("Unable to get bathroom count", myprop.getBathrooms() != null);
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
