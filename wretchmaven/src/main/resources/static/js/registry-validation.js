const RegVal = {

	finalcheck : true,

	verifyUserName : function() {
		// hier prüfung, ob username bereits in Datenbank vorhanden
		// wenn ja: return false, wenn nein: return true
		const usernameField = document.getElementById('username');

		const username = usernameField.value;

		if (username.length < 1) {

			return false;

		}

		else {

			return true;

		}
		
	},

	verifyFirstName : function() {

		const firstNameField = document.getElementById('firstName');

		const firstName = firstNameField.value;

		if (firstName.length < 1) {

			return false;

		}

		else {

			return true;

		}

	},

	verifyLastName : function() {

		const lastNameField = document.getElementById('lastName');
		const lastName = lastNameField.value;
		if (lastName.length < 1) {

			return false;

		}

		else {

			return true;

		}

	},

	verifyPassword : function() {

		const passwordField = document.getElementById('password');

		const password = passwordField.value;

		if (password.length <= 8) {

			return false;

		}

		else {

			return true;

		}

	},

	verifyConfirmPassword : function() {

		const confirmPasswordField = document.getElementById('confirmPassword');

		const confirmPassword = confirmPasswordField.value;

		if (password != confirmPassword) {
			return false;
		} else {
			return true;
		}

	},

	verifyEMail : function() {

		const EMailField = document.getElementById('email');

		const EMail = EMailField.value;

		if (EMail.includes('@') && EMail.includes('.')) {
			return true;
		} else {
			return false;
		}

	},

	verifyGender : function() {

		const genderField = document.getElementById('gender');

		const gender = genderField.value;

		if (gender == "") {
			return false;
		} else {
			return true;
		}

	},
	
	verifyCountry: function() {
		
		const countryField = document.getElementById('country');

		const country = countryField.value;

		if (country == "") {
			return false;
		} else {
			return true;
		}
		
	},
	
	verifyCity : function() {
		
		const cityField = document.getElementById('city');
		
		const city = cityField.value;
		
		if (city.length < 1){
			return false;
		}
		else{
			return true;
		}
	}

}

// here starts the actual testing

var regButton = document.getElementById('RegistryButton');

regButton.addEventListener("click", function() {

	finalcheck = true;

	// test username
	

	// test first name
	if (RegVal.verifyFirstName()) {

		var alertfirstname = document.getElementById("alertfirstname");
		alertfirstname.style.display = "none";

	} else {

		var alertfirstname = document.getElementById("alertfirstname");
		alertfirstname.style.display = "block";
		finalcheck = false;
	}
	if (RegVal.verifyUserName()) {

		var alertusername = document.getElementById("alertusername");
		alertusername.style.display = "none";

	} else {

		var alertusername = document.getElementById("alertusername");
		alertusername.style.display = "block";
		finalcheck = false;
	}

	// test last name
	if (RegVal.verifyLastName()) {

		var alertfirstname = document.getElementById("alertlastname");
		alertfirstname.style.display = "none";

	} else {
		var alertfirstname = document.getElementById("alertlastname");
		alertfirstname.style.display = "block";
		finalcheck = false;
	}

	// test password
	if (RegVal.password()) {

		var alertpassword = document.getElementById("alertpassword");
		alertfpassword.style.display = "none";

	} else {

		var alertpassword = document.getElementById("alertpassword");
		alertpassword.style.display = "block";
		finalcheck = false;

	}

	// test verify password
	if (RegVal.verifyPassword()) {
		var alertverifyPassword = document
				.getElementById("alertverifyPassword");
		alertverifyPassword.style.display = "none";
	} else {
		var alertverifyPassword = document
				.getElementById("alertverifyPassword");
		alertverifyPassword.style.display = "block";
	}

	// test EMail
	if (RegVal.verifyEMail()) {

		var alertemail = document.getElementById("alertemail");
		alertemail.style.display = "none";

	} else {

		var alertemail = document.getElementById("alertemail");
		alertemail.style.display = "block";
		finalcheck = false;
	}

	// test gender
	if (RegVal.verifyGender()) {

		var alertgender = document.getElementById("alertgender");
		alertgender.style.display = "hide";

	} else {

		var alertgender = document.getElementById("alertgender");
		alertgender.style.display = "block";

		finalcheck = false;

	}
	
	// test country
	if (RegVal.countryGender()) {

		var alertcountry = document.getElementById("alertcountry");
		alertcountry.style.display = "hide";

	} else {

		var alertcountry = document.getElementById("alertcountry");
		alertcountry.style.display = "block";

		finalcheck = false;

	}
	
	
	var alertcity = document.getElementById("alertcity");
	alertcity.style.display = "block";
	// test city
	if (RegVal.countryGender()) {

		var alertcity = document.getElementById("alertcity");
		alertcity.style.display = "hide";

	} else {

		var alertcity = document.getElementById("alertcity");
		alertcity.style.display = "block";

		finalcheck = false;
	}
	
	if (RegVal.finalcheck == true) {
		// here sql statement to create a new user in the database
	}

});