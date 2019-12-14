package test.zipcode;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ZipCodeResponse {
    int status;
    String message;
    List<ZipCodeData> results;

    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ZipCodeData {
        String zipcode;
        String prefcode;
        String address1;
        String address2;
        String address3;
        String kana1;
        String kana2;
        String kana3;
    }
}
