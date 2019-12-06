/*!
exchanging.js works with the user input when the "Exchange now"-Button was pressed.
 */


function modify_exchange_button()
{
    var exchange_button = document.getElementById("exchange-button");
	if (exchange_button.textContent=="Exchange now!") exchange_button.textContent = "Parcel sent";
	else if (exchange_button.textContent=="Parcel sent") exchange_button.textContent = "Rate your Wretcher";
	else exchange_button.textContent = "Exchange now!";
	document.getElementById("exchange-button").textContent = exchange_button.textContent;
	
}