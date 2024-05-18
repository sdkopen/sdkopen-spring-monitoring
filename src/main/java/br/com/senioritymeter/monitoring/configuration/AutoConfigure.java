package br.com.senioritymeter.monitoring.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:default-application.properties")
public class AutoConfigure {}
