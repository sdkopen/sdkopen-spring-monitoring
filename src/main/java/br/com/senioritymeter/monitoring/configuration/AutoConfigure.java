package br.com.senioritymeter.monitoring.configuration;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@PropertySource("classpath:default-application.properties")
public class AutoConfigure {

  @PostConstruct
  public void init() {
    log.info("seniority-meter-monitoring - has been initialized");
  }
}
