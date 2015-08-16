package com.lukeshannon.geode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:geode-config.xml")
public class GeodeSingleNodeApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeodeSingleNodeApplication.class, args);
    }
    
    @Bean
    CommandLineRunner keepOpen() {
      return new CommandLineRunner() {
      @Override
      public void run(String... arg0) throws Exception {
    	  System.out.println("------------------------------");
    	  System.out.println("- Process Started            -");
    	  System.out.println("- Hit Any Key To Stop        -");
    	  System.out.println("------------------------------");
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          try {
          bufferedReader.readLine();
        } catch (IOException e) {}
      }
        
      };
    }

}
