package com.love2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration     //this is java configuration file
//@ComponentScan("com.love2code.springdemo")


@PropertySource("classpath:Sport.Properties")
public class SportConfig {
	
	
//define bean for our sad fortune service class
@Bean
public FortuneService sadFortuneService()
{
	return new SadFortuneService();
 	
}
	
//define bean for swim coach and inject dependency
@Bean
public coach swimCoach(){
	
return new SwimCoach(sadFortuneService());	
}

}
