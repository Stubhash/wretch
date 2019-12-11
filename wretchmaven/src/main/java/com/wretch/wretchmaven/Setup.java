package com.wretch.wretchmaven;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.wretch.wretchmaven.model.User;
import com.wretch.wretchmaven.repository.UserRepository;

@Transactional
@Component
public class Setup implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		User admin = new User();

		admin.setUsername("Balola");
		admin.setPassword(new BCryptPasswordEncoder().encode("admin"));
		admin.setEmail("mitbringsel.balola@web.de");
		admin.setEnabled(true);
		userRepository.save(admin);

	}

}
