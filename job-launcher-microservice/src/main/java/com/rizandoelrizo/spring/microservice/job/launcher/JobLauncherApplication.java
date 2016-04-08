package com.rizandoelrizo.spring.microservice.job.launcher;

import com.rizandoelrizo.spring.microservice.job.launcher.config.WebMvcConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * Entry point class.
 */
@SpringBootApplication(scanBasePackageClasses =
		WebMvcConfig.class)
public class JobLauncherApplication extends SpringBootServletInitializer {

	/**
	 * Embedded execution.
     */
	public static void main(String[] args) {
		SpringApplication.run(JobLauncherApplication.class, args);
	}

	/**
	 * External deploy execution.
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JobLauncherApplication.class);
	}

}
