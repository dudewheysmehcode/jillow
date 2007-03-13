package com.realtybaron.jillow;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Created by IntelliJ IDEA. User: marc Date: Aug 4, 2006 Time: 9:25:45 AM
 * <p/>
 * THIS SOFTWARE IS COPYRIGHTED.  THE SOFTWARE MAY NOT BE COPIED REPRODUCED, TRANSLATED, OR REDUCED TO ANY ELECTRONIC
 * MEDIUM OR MACHINE READABLE FORM WITHOUT THE PRIOR WRITTEN CONSENT OF SOCO TECHNOLOGIES.
 */
public class ZillowException extends Exception {
  private Log log = LogFactory.getLog(ZillowException.class);
  public ZillowException(String text) {
    super(text);
  }
}
