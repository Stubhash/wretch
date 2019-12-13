var app = angular.module("registration", []);




app.controller("registrationCtrl", function($http, $scope) {
	var controller = this;

	controller.users = [];
	$scope.newUser = function() {

		// fehlerbehandlung
		var finalcheck = true;
		var regexOnlyNumbers = /^[0-9]*$/;
		// check username
		alertusername = document.getElementById("alertusername");
		usernametemp = document.getElementById("username").value;
		if (usernametemp.length >= 5) {
			alertusername.style.display = "none";
		} else {
			alertusername.style.display = "block";
			finalcheck = false;
		}

		// check firstname
		alertname = document.getElementById("alertname");
		nametemp = document.getElementById("name").value;
		if (!regexOnlyNumbers.test(nametemp)) {
			alertname.style.display = "none";
		} else {
			alertname.style.display = "block";
			finalcheck = false;
		}

		// check lastname
		alertlastname = document.getElementById("alertlastname");
		lastnametemp = document.getElementById("lastname").value;
		if (!regexOnlyNumbers.test(lastnametemp)) {
			alertlastname.style.display = "none";
		} else {
			alertlastname.style.display = "block";
			finalcheck = false;
		}

		// check password
		alertpassword = document.getElementById("alertpassword");
		passwordtemp = document.getElementById("password").value;
		if (passwordtemp.length >= 5) {
			alertpassword.style.display = "none";
		} else {
			alertpassword.style.display = "block";
			finalcheck = false;
		}

		// check passwordconfirm
		alertpasswordconfirm = document.getElementById("alertpasswordconfirm");
		passwordconfirmtemp = document.getElementById("passwordconfirm").value;
		if (passwordconfirmtemp == passwordtemp) {
			alertpasswordconfirm.style.display = "none";
		} else {
			alertpasswordconfirm.style.display = "block";
			finalcheck = false;
		}
		
		// check email is already done thought the html field itself
		
		//check gender
		alertgender = document.getElementById("alertgender");
		gendertemp = document.getElementById("gender").value;
		if (gendertemp == "male" || gendertemp == "female" || gendertemp == "others"){
			alertgender.style.display = "none";
		}
		else{
			alertgender.style.display = "block";
			finalcheck = false;
		}
		
		//check country
		alertcountry = document.getElementById("alertcountry");
		countrytemp = document.getElementById("country").value;
		if (countrytemp == "DE" || countrytemp == "FR" || countrytemp == "UK"){
			alertcountry.style.display = "none";
		}
		else{
			alertcountry.style.display = "block";
			finalcheck = false;
		}
		
		//check city is checked via html field
		
		//check zipcode
		alertzipcode = document.getElementById("alertzipcode");
		zipcodetemp = document.getElementById("zipcode").value;
		if (regexOnlyNumbers.test(zipcodetemp)){
			alertzipcode.style.display = "none";
		}
		else{
			alertzipcode.style.display = "block";
			finalcheck = false;
		}
		
		//check street is via html field
		
		//check housenr
		alerthousenumber = document.getElementById("alerthousenumber");
		housenumbertemp = document.getElementById("housenumber").value;
		if (regexOnlyNumbers.test(housenumbertemp)){
			alerthousenumber.style.display = "none";
		}
		else{
			alerthousenumber.style.display = "block";
			finalcheck = false;
		}
		
		
		//if everything is allright and finalcheck is true we send the post request
		if (finalcheck == true) {
			var username = $scope.username;
			var name = $scope.name;
			var lastname = $scope.lastname;
			var password = $scope.password;
			var passwordConfirm = $scope.passwordConfirm;
			var email = $scope.email;
			var gender = $scope.gender;
			var city = $scope.city;
			var zipcode = $scope.zipcode;
			var street = $scope.street;
			var housenr = $scope.housenr;
			var country = $scope.country;
			newUserObj = {
				username : username,
				password : password,
				passwordConfirm : passwordConfirm,
				email : email,
				name : name,
				lastname : lastname,
				gender : gender,
				country : country,
				city : city,
				zipcode : zipcode,
				street : street,
				housenr : housenr,
			};

			$http.post("/newUser", newUserObj).then(function() {
				window.location.assign("/login.html")
			})
		}
	}

});