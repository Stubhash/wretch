/*!
exchanging.js works with the user input when the "Exchange now"-Button was pressed.
 */


function modify_exchange_button()
{
    var exchange_button = document.getElementById("exchange");
	if (exchange_button.value=="Exchange now") exchange_button.value = "Parcel sent";
	else if (exchange_button.value=="Parcel sent") exchange_button.value = "Rate your Wretcher";
    else exchange_button.value = "Exchange now";
}