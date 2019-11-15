const RegVal = {

            

    verifyFirstName : function() {

           const firstNameField = document.getElementById('firstName');

           const firstName = firstNameField.value;

           console.log(firstName);

           console.log(firstName.length);

          

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



    }

   

}

   

var regButton = document.getElementById('RegistryButton');

regButton.addEventListener("click", function(){

if (!RegVal.verifyFirstName()){

    const firstNameField = document.getElementById('firstName');

    

    var alertfirstname =  document.getElementById("alertfirstname");
       alertfirstname.style.display = "block";
}
else {
       var alertfirstname =  document.getElementById("alertfirstname");
       alertfirstname.style.display = "none";
}

if (!RegVal.verifyLastName()){

       var alertfirstname =  document.getElementById("alertlastname");
       alertfirstname.style.display = "block";

}
else {
       var alertfirstname =  document.getElementById("alertlastname");
       alertfirstname.style.display = "none";
}

if (!RegVal.verifyPassword()){

       var alertfirstname =  document.getElementById("alertpassword");
       alertfirstname.style.display = "block";

}
else {
       var alertfirstname =  document.getElementById("alertpasswordname");
       alertfirstname.style.display = "none";
}

});