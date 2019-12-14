/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 14 05:24:54 GMT 2019
 */

package test.evosuite.zipcode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import test.zipcode.ZipCodeApi;
import test.zipcode.ZipCodeService;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ZipCodeService_ESTest extends ZipCodeService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZipCodeService zipCodeService0 = new ZipCodeService((ZipCodeApi) null);
      // Undeclared exception!
      try { 
        zipCodeService0.search("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("test.zipcode.ZipCodeService", e);
      }
  }
}