package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wretch.wretchmaven.model.User;
import com.wretch.wretchmaven.repository.UserRepository;

import validator.UserValidator;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepo;
	@Autowired
	UserValidator validator;
	@Autowired
	Errors validationExceportion;
	private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);

	@RequestMapping(method = RequestMethod.POST, value = "/newUser")
	private ResponseEntity<Integer> newUser(@RequestBody User newUser) {

		validator.validate(newUser, validationExceportion);
		
		if (newUser.getUsername().matches("[\\w- ]+") && newUser.getUsername().length() >= 5) {
			if (newUser.getPassword().equals(newUser.getPasswordConfirm()) && newUser.getPassword().length() >= 5) {
				User user = new User();
				user.setUsername(newUser.getUsername());
				user.setPassword(passwordEncoder.encode(newUser.getPassword()));
				user.setEnabled(true);
				user.setEmail(newUser.getEmail());
				user.setCity(newUser.getCity());
				user.setCountry(newUser.getCountry());
				user.setGender(newUser.getGender());
				user.setHouseNr(newUser.getHouseNr());
				user.setLastname(newUser.getLastname());
				user.setName(newUser.getName());
				user.setStreet(newUser.getStreet());
				user.setZipcode(newUser.getZipcode());
			} else {
				return ResponseEntity.badRequest().body(1);
			}
		} else {
			return ResponseEntity.badRequest().body(2);
		}
		return ResponseEntity.ok().body(null);
	}

}
