package com.realtybaron.jillow.zestimate;

import com.realtybaron.jillow.types.SimpleProperty;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.math.BigDecimal;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 5, 2006 Time: 2:21:27 PM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class ZestimateUtil {
  private Log log = LogFactory.getLog(ZestimateUtil.class);
  public static BigDecimal calculateAverage(SimpleProperty[] props) {
    BigDecimal total = new BigDecimal(0);
    for (SimpleProperty prop : props) {
      total = total.add(prop.getZestimate().getAmount().getBigDecimalValue());
    }
    return total.divide(BigDecimal.valueOf(props.length));
  }
}
