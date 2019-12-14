package test.squaretest.zipcode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.MockitoAnnotations.initMocks;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import test.zipcode.ZipCodeApi;
import test.zipcode.ZipCodeResponse.ZipCodeData;
import test.zipcode.ZipCodeService;

class ZipCodeServiceTest {

    @Mock
    private ZipCodeApi mockZipCodeApi;

    private ZipCodeService zipCodeServiceUnderTest;

    @BeforeEach
    void setUp() {
        initMocks(this);
        zipCodeServiceUnderTest = new ZipCodeService(mockZipCodeApi);
    }

    @Test
    void testSearch() throws Exception {
        // Setup
        final List<ZipCodeData> expectedResult = Arrays.asList(
                new ZipCodeData("zipcode", "prefcode", "address1", "address2", "address3", "kana1", "kana2",
                                "kana3"));

        // Run the test
        final List<ZipCodeData> result = zipCodeServiceUnderTest.search("zipCode");

        // Verify the results
        assertEquals(expectedResult, result);
    }

    @Test
    void testSearch_ThrowsIOException() {
        // Setup

        // Run the test
        assertThrows(IOException.class, () -> {
            zipCodeServiceUnderTest.search("zipCode");
        });
    }
}
