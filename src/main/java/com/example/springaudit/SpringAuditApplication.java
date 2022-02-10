package com.example.springaudit;

import com.example.springaudit.service.AuditingService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditingService")
public class SpringAuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuditApplication.class, args);
    }

    @Bean
    AuditorAware<String> auditorProvider() {
        return new AuditingService();
    }
}
