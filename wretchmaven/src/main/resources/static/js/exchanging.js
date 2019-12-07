/*!
exchanging.js works with the user input when the "Exchange now"-Button was pressed.
 */


function modify_exchange_button()
{
    var exchange_button = document.getElementById("exchange-button");
	if (exchange_button.textContent=="Exchange now!") {
		exchange_button.textContent = "Parcel sent";
		var p1 = document.createElement("P");
		var p2 = document.createElement("P");
		var p3 = document.createElement("P");
		var p4 = document.createElement("P");
		p1.appendChild(document.createTextNode("Central address"));
		p2.appendChild(document.createTextNode("Max Mustermann"));
		p3.appendChild(document.createTextNode("Musterstrasse 42"));
		p4.appendChild(document.createTextNode("Musterstadt"));
		document.getElementById("address_text").appendChild(p1);
		document.getElementById("address_text").appendChild(p2);
		document.getElementById("address_text").appendChild(p3);
		document.getElementById("address_text").appendChild(p4);
	}
	else if (exchange_button.textContent=="Parcel sent") {
		exchange_button.textContent = "Rate your Wretcher";
		document.getElementById("address_text").textContent = " ";
	}
	else exchange_button.textContent = "Exchange now!";
	document.getElementById("exchange-button").textContent = exchange_button.textContent;
	
}