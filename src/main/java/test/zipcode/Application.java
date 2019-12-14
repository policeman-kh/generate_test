package test.zipcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ZipCodeApi zipCodeApi() {
        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://zipcloud.ibsnet.co.jp")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(ZipCodeApi.class);
    }
}
