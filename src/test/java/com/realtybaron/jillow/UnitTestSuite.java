package com.realtybaron.zillow;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Created by IntelliJ IDEA. User: mdugger Date: May 28, 2006 Time: 2:29:41 PM
 */
public class UnitTestSuite extends TestCase {
  public static Test suite() {
    TestSuite suite = new TestSuite();
    suite.addTest(SimpleSearchTest.suite());
    suite.addTest(DeepSearchTest.suite());
    suite.addTest(GetCompPropertiesTest.suite());
    suite.addTest(GetZestimateTest.suite());
    suite.addTest(GetChartTest.suite());
    suite.addTest(GetRegionChartTest.suite());
    return suite;
  }
}
