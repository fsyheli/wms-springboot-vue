package heli.hrc.wmsspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
public class WmsSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WmsSpringbootApplication.class, args);
    }

}
