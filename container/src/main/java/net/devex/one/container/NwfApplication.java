package net.devex.one.container;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.acb.nwf.*")
@EnableJpaRepositories(basePackages = {"com.acb.nwf.infrastructure"})
@EntityScan(basePackages = {"com.acb.nwf.infrastructure"})
public class NwfApplication {
    public static void main(String[] args) {
        SpringApplication.run(NwfApplication.class, args);
    }
}
