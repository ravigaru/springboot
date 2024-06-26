package ravi.varma;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration

public class SecurityConfiguration {
	
	
	
		
	//@Bean
	SecurityFilterChain configure(HttpSecurity http) throws Exception {
		
		http.csrf(AbstractHttpConfigurer::disable)
		.cors(AbstractHttpConfigurer::disable)
		.authorizeHttpRequests(authorizationManagerRequestMatcherRegistry->
		authorizationManagerRequestMatcherRegistry.requestMatchers("/*welcome*")//.permitAll()
		.authenticated().anyRequest().permitAll());
		//
				
		
		return http.build();
		
	}
			
	

}
