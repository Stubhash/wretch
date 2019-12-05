package com.wretch.wretchmaven.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.wretch.wretchmaven.repository.CustomerRepository;
import com.wretch.wretchmaven.service.CustomCustomerDetailsService;
@EnableWebSecurity
@EnableJpaRepositories(basePackageClasses = CustomerRepository.class)
@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter  {
	@Autowired
	private CustomCustomerDetailsService customerDetailsService;
	 @Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.userDetailsService(customerDetailsService).passwordEncoder(getPasswordEncoder());
		
		};
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable();
			http.authorizeRequests()
			.antMatchers("**/secured/**").authenticated()
			.anyRequest().permitAll()
			.and().formLogin().loginPage("/Loginpage.html").permitAll();

		}
		
		private PasswordEncoder getPasswordEncoder() {
			return new PasswordEncoder() {
				@Override
				public String encode(CharSequence charSequence) {
					return charSequence.toString();
				}
				
				@Override
				public boolean matches(CharSequence charSequence, String s) {
					return true;
				}
			};
		}
	}

