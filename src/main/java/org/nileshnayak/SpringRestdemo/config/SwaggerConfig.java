package org.nileshnayak.SpringRestdemo.config;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.*;


@Configuration
@OpenAPIDefinition(
  info =@Info(
    title = "Album API",
    version = "Verions 1.0",
    contact = @Contact(
      name = "nileshnayak", email = "nilesh5566nayak@gmail.com", url = "https://www.linkedin.com/in/nilesh5566/"
    ),
    license = @License(
      name = "Apache 2.0", url = "https://www.apache.org/licenses/LICENSE-2.0"
    ),
    termsOfService = "https://www.linkedin.com/in/nilesh5566/",
    description = "Spring Boot RestFul API Demo by Nilesh"
  )
)
public class SwaggerConfig {
}
