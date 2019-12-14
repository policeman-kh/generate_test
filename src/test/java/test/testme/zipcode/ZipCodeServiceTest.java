package test.testme.zipcode;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import test.zipcode.ZipCodeApi;
import test.zipcode.ZipCodeResponse.ZipCodeData;
import test.zipcode.ZipCodeService;

import static org.mockito.Mockito.*;

class ZipCodeServiceTest {
    @Mock
    ZipCodeApi zipCodeApi;
    @InjectMocks
    ZipCodeService zipCodeService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testSearch() throws IOException {
        when(zipCodeApi.search(anyString())).thenReturn(null);

        List<ZipCodeData> result = zipCodeService.search("zipCode");
        Assertions.assertEquals(
                Arrays.<ZipCodeData>asList(
                        new ZipCodeData("zipcode", "prefcode", "address1", "address2", "address3", "kana1",
                                        "kana2", "kana3")), result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme