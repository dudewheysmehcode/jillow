package com.realtybaron.jillow.search;

import com.realtybaron.jillow.AbstractWebServiceController;
import com.realtybaron.jillow.types.ComparableProperty;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:32:54 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class ComparablePropertiesController extends AbstractWebServiceController {
  private Log log = LogFactory.getLog(ComparablePropertiesController.class);
  public ComparablePropertiesController() {
    super("/webservice/GetComps.htm");
  }
  /**
   * Returns an array of one simple property if the address is an exact match.  If not, returns an array of comparable
   * properties based on the address.
   */
  public ComparableProperty[] getComparableProperties(long zpid, int count) throws
                                                                            com.realtybaron.jillow.ZillowException {
    return new ComparableProperty[0];
  }
}
