package tqs.hw.TheWeather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TheWeatherApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheWeatherApplication.class, args);
	}
    
    @Bean
    public CommandLineRunner run() {
    	return args -> {    
    		Cache.setup();
    	};
    }
    
    

}
