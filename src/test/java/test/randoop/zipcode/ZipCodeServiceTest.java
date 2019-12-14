package test.randoop.zipcode;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ZipCodeServiceTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        test.zipcode.ZipCodeApi zipCodeApi0 = null;
        test.zipcode.ZipCodeService zipCodeService1 = new test.zipcode.ZipCodeService(zipCodeApi0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<test.zipcode.ZipCodeResponse.ZipCodeData> zipCodeDataList3 = zipCodeService1.search("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid zipCode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        test.zipcode.ZipCodeApi zipCodeApi0 = null;
        test.zipcode.ZipCodeService zipCodeService1 = new test.zipcode.ZipCodeService(zipCodeApi0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<test.zipcode.ZipCodeResponse.ZipCodeData> zipCodeDataList3 = zipCodeService1.search("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Empty zipCode");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        test.zipcode.ZipCodeApi zipCodeApi0 = null;
        test.zipcode.ZipCodeService zipCodeService1 = new test.zipcode.ZipCodeService(zipCodeApi0);
        java.lang.Class<?> wildcardClass2 = zipCodeService1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}

