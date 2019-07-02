package tqs.hw.TheWeather;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
