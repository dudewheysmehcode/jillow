package com.realtybaron.jillow.zestimate;

import com.realtybaron.jillow.AbstractWebServiceController;
import com.realtybaron.jillow.ZillowException;
import com.realtybaron.jillow.types.Zestimate;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 7:32:54 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class ZestimateController extends AbstractWebServiceController {
  private Log log = LogFactory.getLog(ZestimateController.class);
  public ZestimateController() {
    super("/webservice/GetZestimate.htm");
  }
  public Zestimate getZestimate(long zpid) throws ZillowException {
    Zestimate results;
    Map<String, String> params = new HashMap<String, String>();
    params.put("zpid", String.valueOf(zpid));
    results = (Zestimate) super.invokeWebService(params, new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return ZestimateDocument.Factory.parse(is).getZestimate().getResponse().getZestimate();
      }
    });
    if (log.isDebugEnabled()) {
      log.debug("Zestimate in XML: " + results.xmlText());
    }
    return results;
  }
}
