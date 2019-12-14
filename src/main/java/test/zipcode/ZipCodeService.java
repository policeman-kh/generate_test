package test.zipcode;

import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import test.zipcode.ZipCodeResponse.ZipCodeData;

@AllArgsConstructor
@Service
public class ZipCodeService {
    private static final Pattern ZIP_CODE_PATTERN = Pattern.compile("^\\d{7}$");
    private final ZipCodeApi zipCodeApi;

    public List<ZipCodeData> search(String zipCode) throws IOException {
        validateZipCode(zipCode);
        return zipCodeApi.search(zipCode)
                         .execute()
                         .body()
                         .getResults();
    }

    private static void validateZipCode(String zipCode) {
        if (zipCode == null || zipCode.isEmpty()) {
            throw new IllegalArgumentException("Empty zipCode");
        }
        if (!ZIP_CODE_PATTERN.matcher(zipCode).find()) {
            throw new IllegalArgumentException("Invalid zipCode");
        }
    }
}
