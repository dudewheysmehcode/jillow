package com.realtybaron.jillow.search;

import com.realtybaron.jillow.AbstractWebServiceController;
import com.realtybaron.jillow.ZillowException;
import com.realtybaron.jillow.types.SimpleProperty;
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
public class SearchResultsController extends AbstractWebServiceController {
  private Log log = LogFactory.getLog(SearchResultsController.class);
  public SearchResultsController() {
    super("/webservice/GetSearchResults.htm");
  }
  public SearchResultsController(String document) {
    super(document);
  }
  /**
   * Returns an array of one simple property if the address is an exact match.  If not, returns an array of comparable
   * properties based on the address.
   *
   * @param address   The street number, direction, name, and suffix.  For example, "100 S Main St"
   * @param city      The city
   * @param stateAbbr The state's abbreviation.  For example, "TX" or "CA"
   * @return
   * @throws ZillowException
   */
  public SimpleProperty[] getSimpleProperties(String address, String city, String stateAbbr) throws ZillowException {
    Map<String, String> params = new HashMap<String, String>();
    params.put("address", address);
    String citystatezip = new StringBuffer().append(city).append(", ").append(stateAbbr).toString();
    params.put("citystatezip", citystatezip);
    SearchresultsDocument.Searchresults results;
    results = (SearchresultsDocument.Searchresults) super.invokeWebService(params, new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return SearchresultsDocument.Factory.parse(is).getSearchresults();
      }
    });
    if (log.isDebugEnabled()) {
      log.debug("Search Result in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return results.getResponse().getResults().getResultArray();
  }
  public SimpleProperty getSimpleProperty(String address, String city, String stateAbbr) throws
                                                                                         MultiplePropertiesException,
                                                                                         ZillowException {
    SimpleProperty[] props = getSimpleProperties(address, city, stateAbbr);
    if (props.length == 1) {
      return props[0];
    } else {
      throw new MultiplePropertiesException("Multiple properties returned for address: " + address);
    }
  }
  public SimpleProperty[] getSimpleProperties(String address, String zip) throws ZillowException {
    Map<String, String> params = new HashMap<String, String>();
    params.put("address", address);
    params.put("citystatezip", zip);
    SearchresultsDocument.Searchresults results;
    results = (SearchresultsDocument.Searchresults) super.invokeWebService(params, new WebServiceTemplate() {
      public Object get(InputStream is) throws Exception {
        return SearchresultsDocument.Factory.parse(is).getSearchresults();
      }
    });
    if (log.isDebugEnabled()) {
      log.debug("Search Result in XML: " + results.xmlText());
    }
    validateSuccessfulResponse(results.getMessage());
    return results.getResponse().getResults().getResultArray();
  }
  public SimpleProperty getSimpleProperty(String address, String zip) throws
                                                                      MultiplePropertiesException,
                                                                      ZillowException {
    SimpleProperty[] props = getSimpleProperties(address, zip);
    if (props.length == 1) {
      return props[0];
    } else {
      throw new MultiplePropertiesException("Multiple properties returned for address: " + address);
    }
  }
}
