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
		
		User test = new User();
		test.setUsername("test");
		test.setPassword(new BCryptPasswordEncoder().encode("password") );
		test.setEnabled(true);
		userRepository.save(test);
		
		User owo = new User();
		owo.setUsername("owo");
		owo.setPassword(new BCryptPasswordEncoder().encode("password") );
		owo.setEnabled(true);
		userRepository.save(owo);
		
		User doge = new User();
		doge.setUsername("doge");
		doge.setPassword(new BCryptPasswordEncoder().encode("password") );
		doge.setEnabled(true);
		userRepository.save(doge);
		
		User F4K3R = new User();
		F4K3R.setUsername("F4K3R");
		F4K3R.setPassword(new BCryptPasswordEncoder().encode("password") );
		F4K3R.setEnabled(true);
		userRepository.save(F4K3R);
		
		User doinb = new User();
		doinb.setUsername("doinb");
		doinb.setPassword(new BCryptPasswordEncoder().encode("password") );
		doinb.setEnabled(true);
		userRepository.save(doinb);
		
		User jollyPuddingHoops = new User();
		jollyPuddingHoops.setUsername("jollyPuddingHoops");
		jollyPuddingHoops.setPassword(new BCryptPasswordEncoder().encode("password") );
		jollyPuddingHoops.setEnabled(true);
		userRepository.save(jollyPuddingHoops);
		
	}
	
	

}
