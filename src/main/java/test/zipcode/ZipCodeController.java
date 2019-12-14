package test.zipcode;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import test.zipcode.ZipCodeResponse.ZipCodeData;

@AllArgsConstructor
@RestController
public class ZipCodeController {
    private final ZipCodeService zipCodeService;

    @GetMapping("/search")
    public List<ZipCodeData> search(@RequestParam("code") String zipCode) throws IOException {
        return zipCodeService.search(zipCode);
    }
}
