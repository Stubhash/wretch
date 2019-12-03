const RegVal = {

            
	verifyUserName: function() {
		// hier prüfung, ob username bereits in Datenbank vorhanden
		//wenn ja: return false, wenn nein: return true
		
	},

    verifyFirstName : function() {

           const firstNameField = document.getElementById('firstName');

           const firstName = firstNameField.value;


           if(firstName.length <1){

                  return false;

           }

           else{

                  return true;

           }

    },

   

    verifyLastName: function() {

           const lastNameField = document.getElementById('lastName');
              const lastName = lastNameField.value;
           if(lastName.length <1){

                  return false;

           }

           else{

                  return true;

           }

    },

   

    verifyPassword: function() {

           const passwordField = document.getElementById('password');

           const password = passwordField.value;

           const confirmPasswordField = document.getElementById('confirmPassword');

           const confirmPassword = confirmPasswordField.value;

          

          

           if (password.length < 8 || password != confirmPassword){

                  return false;

           }

           else{

                  return true;

           }



    },
    
    verifyPhoneNumber: function() {
    	
    	const passwordField = document.getElementById('phoneNumber');
    	
    	const password = passwordField.value;
    	
    }



}

   

var regButton = document.getElementById('RegistryButton');

regButton.addEventListener("click", function(){
	
if (RegVal.verifyUserName()) {
	//wenn wahr -> fehlermeldung unsichtbar machen
}
else{
	//wenn falsch -> fehlermeldung sichtbar machen
}

if (RegVal.verifyFirstName()){

	var alertfirstname =  document.getElementById("alertfirstname");
    alertfirstname.style.display = "none";

    
}
else {
       
	var alertfirstname =  document.getElementById("alertfirstname");
    alertfirstname.style.display = "block";
}

if (RegVal.verifyLastName()){

	var alertfirstname =  document.getElementById("alertlastname");
    alertfirstname.style.display = "none";
       

}
else {
	var alertfirstname =  document.getElementById("alertlastname");
    alertfirstname.style.display = "block";
}

if (RegVal.verifyPassword()){

       

       var alertfirstname =  document.getElementById("alertpasswordname");
       alertfirstname.style.display = "none";
}
else {
       
	var alertfirstname =  document.getElementById("alertpassword");
    alertfirstname.style.display = "block";
}



});