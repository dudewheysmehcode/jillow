package com.realtybaron.zillow;

import com.realtybaron.zillow.search.SearchResultsController;
import com.realtybaron.zillow.types.*;
import com.realtybaron.zillow.zestimate.ZestimateController;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:16:39 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class GetZestimateTest extends TestCase {
  private Log log = LogFactory.getLog(GetZestimateTest.class);
  public static TestSuite suite() {
    return new TestSuite(GetZestimateTest.class);
  }
  public void testGoldenPath() {
    try {
      SimpleProperty myprop = new SearchResultsController().getSimpleProperty("906 Stewart Drive", "75208");
      assertTrue("Unable to get my home from Zillow", myprop.getZpid() > 0);
      Zestimate z = new ZestimateController().getZestimate(myprop.getZpid());
      assertNotNull("Zestimate is null", z);
      Amount amount = z.getAmount();
      assertNotNull("Amount is null", amount);
      BigDecimal bigDecimalValue = amount.getBigDecimalValue();
      assertNotNull("BigDecimal is null", bigDecimalValue);
      assertTrue("Unable to get zestimate from Zillow", bigDecimalValue.compareTo(BigDecimal.ZERO) > 0);
    } catch (Exception e) {
      log.debug(e.getMessage(), e);
      fail(e.getMessage());
    }
  }
}
