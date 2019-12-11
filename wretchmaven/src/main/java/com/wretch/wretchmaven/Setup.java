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
		admin.setEmail("mitbringsel.balola@web.uk");
		admin.setEnabled(true);
		admin.setCity("Lafayette");
		admin.setCountry("United Kingdom");
		admin.setGender("male");
		admin.setHouseNr("32");
		admin.setLastname("McGill");
		admin.setName("Kyle");
		admin.setStreet("Willow Oaks Lane");
		admin.setZipcode("3458");
		userRepository.save(admin);
		
		User test = new User();
		test.setUsername("test");
		test.setPassword(new BCryptPasswordEncoder().encode("password") );
		test.setEnabled(true);
		test.setEmail("amanda@web.uk");
		test.setCity("Bondville");
		test.setCountry("United Kingdom");
		test.setGender("female");
		test.setHouseNr("37");
		test.setLastname("Vaughn");
		test.setName("Amanda");
		test.setStreet("Spring Street");
		test.setZipcode("3774");
		userRepository.save(test);

		
		User owo = new User();
		owo.setUsername("owo");
		owo.setPassword(new BCryptPasswordEncoder().encode("password") );
		owo.setEnabled(true);
		owo.setEmail("claudetteBrunault@cuvox.fr");
		owo.setCity("LA GARENNE-COLOMBES");
		owo.setCountry("France");
		owo.setGender("female");
		owo.setHouseNr("54");
		owo.setLastname("Brunault");
		owo.setName("Claudette");
		owo.setStreet("rue de l'Aigle");
		owo.setZipcode("92250");
		userRepository.save(admin);
		userRepository.save(owo);
		
		User doge = new User();
		doge.setUsername("doge");
		doge.setPassword(new BCryptPasswordEncoder().encode("password") );
		doge.setEnabled(true);
		doge.setEmail("dominikBerg@cuvox.de");
		doge.setCity("Hohenlockstedt ");
		doge.setCountry("Germany");
		doge.setGender("male");
		doge.setHouseNr("86");
		doge.setLastname("Berg");
		doge.setName("Dominik");
		doge.setStreet("An Der Urania");
		doge.setZipcode("25551");
		userRepository.save(doge);
		
		User F4K3R = new User();
		F4K3R.setUsername("F4K3R");
		F4K3R.setPassword(new BCryptPasswordEncoder().encode("password") );
		F4K3R.setEnabled(true);
		F4K3R.setCity("Dillingen ");
		F4K3R.setEmail("leahWaechter@einrot.com");
		F4K3R.setCountry("Germany");
		F4K3R.setGender("female");
		F4K3R.setHouseNr("27");
		F4K3R.setLastname("Waechter");
		F4K3R.setName("Leah");
		F4K3R.setStreet("Gotzkowskystraße");
		F4K3R.setZipcode("6674");
		userRepository.save(F4K3R);


		
		User jollyPuddingHoops = new User();
		jollyPuddingHoops.setUsername("jollyPuddingHoops");
		jollyPuddingHoops.setPassword(new BCryptPasswordEncoder().encode("password") );
		jollyPuddingHoops.setEnabled(true);
		jollyPuddingHoops.setEmail("arnaudeLefebvre@cuvox.fr");
		jollyPuddingHoops.setCity("MONTPELLIER ");
		jollyPuddingHoops.setCountry("France");
		jollyPuddingHoops.setGender("male");
		jollyPuddingHoops.setHouseNr("87");
		jollyPuddingHoops.setLastname("Lefebvre");
		jollyPuddingHoops.setName("Arnaude");
		jollyPuddingHoops.setStreet("rue de la Mare aux Carats");
		jollyPuddingHoops.setZipcode("Arnaude");
		userRepository.save(jollyPuddingHoops);
		
	}
	
	

}
