package com.todo.rest.webservices.basic.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigBasicAuth extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		.csrf().disable()
		.authorizeRequests()
		  .antMatchers(HttpMethod.OPTIONS,"/**").permitAll().anyRequest().authenticated().and().httpBasic();
		 
		
		
		/*
		 * http.authorizeRequests((requests) -> requests.anyRequest().authenticated())
		 * .antMatchers(HttpMethod.OPTIONS,"/**").permitAll().and()//supporting
		 * pre-flight requests; //http.formLogin(); .http.httpBasic();
		 */
	}
}
