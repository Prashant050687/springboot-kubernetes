package com.prashant.kubernetes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.prashant"})
public class KubernetesApplication {

  public static void main(String[] args) {
    SpringApplication.run(KubernetesApplication.class, args);
  }

}
