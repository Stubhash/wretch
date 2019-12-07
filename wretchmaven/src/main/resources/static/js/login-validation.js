//evtl. braucht man diese klasse nicht, war jedoch schnell erstellt

finalcheck = true;
var username;
var password;

const LogVal = {
		
		alertusername : document.getElementById('alertusername'),
		alertpassword : document.getElementById('alertpassword'),
		
		 verifyUsername : function () {
			
			username = document.getElementById('username').value;
			
			if (!username.length < 1 /* && username exists in database*/){
				return true;
			}
			else {
				return false;
			}
			
		},

		verifyPassword : function () {
			
			password = document.getElementById('password').value;
			
			if (!password.length < 1 /* && password is correct for the username*/) {
				return true;
			}
			else {
				return false;
			}
			
		}
}
		
var logButton = document.getElementById('LoginButton');
		
logButton.addEventListener("click", function() {
	
	finalcheck = true;
	
	if (LogVal.verifyUsername()){
		LogVal.alertusername.style.display = "none";
	}
	else{
		LogVal.alertusername.style.display = "block";
		finalcheck = false;
	}
	
	if (LogVal.verifyPassword()){
		LogVal.alertpassword.style.display = "none";
	}
	else{
		LogVal.alertpassword.style.display = "block";
		finalcheck = false;
	}
	
});
	
	
	

		
