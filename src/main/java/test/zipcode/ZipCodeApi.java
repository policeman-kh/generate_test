package test.zipcode;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Client of zip code api on zip cloud.
 * @see <a href="http://zipcloud.ibsnet.co.jp/doc/api">Zip code search api</a>
 */
public interface ZipCodeApi {
    /**
     * Search addresses with zip code.
     */
    @GET("/api/search")
    Call<ZipCodeResponse> search(@Query("zipcode") String zipCode);
}
