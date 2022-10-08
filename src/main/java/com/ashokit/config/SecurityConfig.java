package com.ashokit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*
	 * @Override public void configure(WebSecurity web) throws Exception { web
	 * .ignoring() .antMatchers("/home"); }
	 */


	@Override
	protected void configure(HttpSecurity http) throws Exception {
		//super.configure(http);
	/*	http.formLogin();
		http.httpBasic();*/
		
		http.authorizeRequests()		
		.antMatchers("/balance").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/myloan").authenticated()
		.antMatchers("/home").permitAll()
		.antMatchers("/contact").permitAll()
		.and().formLogin()
		.and().httpBasic();
		
		
	}
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		super.configure(auth);
		
	}
}
