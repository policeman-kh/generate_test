/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 14 05:41:53 GMT 2019
 */

package test.evosuite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import test.NumberUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NumberUtils_ESTest extends NumberUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = NumberUtils.isOddNumberBetween1And50(50);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.isEvenNumberBetween1And10WithBadCode(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input should be between 1 and 10.
         //
         verifyException("test.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(9);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(8);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And10WithBadCode(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = NumberUtils.isOddNumberBetween1And50(10);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.isOddNumberBetween1And50(3342);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input should be between 1 and 50.
         //
         verifyException("test.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = NumberUtils.isOddNumberBetween1And50(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.isOddNumberBetween1And50(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input should be between 1 and 50.
         //
         verifyException("test.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And100(100);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.isEvenNumberBetween1And100(1385);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input should be between 1 and 100.
         //
         verifyException("test.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = NumberUtils.isEvenNumberBetween1And100(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        NumberUtils.isEvenNumberBetween1And100(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // input should be between 1 and 100.
         //
         verifyException("test.NumberUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NumberUtils numberUtils0 = new NumberUtils();
  }
}