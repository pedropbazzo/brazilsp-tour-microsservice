package com.vb.lsb.sampa.tour;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.builders.PathSelectors.any;

/**
 * Main Class for the Spring Boot Application
 *
 * @author pedropbazzo
 */
@SpringBootApplication
@EnableSwagger2
public class SampaTourApplication {
    public static void main(String[] args) {
        SpringApplication.run(SampaTourApplication.class, args);
    }

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.vb.lsb.sampa.tour")).paths(any()).build()
                .apiInfo(new ApiInfo("Sampa Tour API's",
                        "API's for the Sampa Travel Service", "2.0", null,
                        null,
                        null, null, new ArrayList()));
    }

}
