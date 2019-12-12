/*!
exchanging.js works with the user input when the "Exchange now"-Button was pressed.
 */
function hide_rating_buttons(){		
 		document.getElementById('rating_button1').style.visibility='hidden';
		document.getElementById('rating_button2').style.visibility='hidden';
		document.getElementById('rating_button3').style.visibility='hidden';
		document.getElementById('rating_button4').style.visibility='hidden';
		document.getElementById('rating_button5').style.visibility='hidden';
		document.getElementById("rate_wretcher").style.visibility='hidden';
}

function click_rating_button(rating)
{
		var exchange_button = document.getElementById("exchange-button");
				document.getElementById('exchange-button').style.visibility='visible';
				exchange_button.textContent = "Exchange now!";
			
 		document.getElementById('rating_button1').style.visibility='hidden';
		document.getElementById('rating_button2').style.visibility='hidden';
		document.getElementById('rating_button3').style.visibility='hidden';
		document.getElementById('rating_button4').style.visibility='hidden';
		document.getElementById('rating_button5').style.visibility='hidden';
		document.getElementById("rate_wretcher").style.visibility='hidden';
}


function modify_exchange_button()
{
	var exchange_button = document.getElementById("exchange-button");

	if (exchange_button.textContent=="Exchange now!") {
		exchange_button.textContent = "Parcel sent!";
		var p1 = document.createElement("P");
		var p2 = document.createElement("P");
		var p3 = document.createElement("P");
		var p4 = document.createElement("P");
		p1.appendChild(document.createTextNode("Central address"));
		p2.appendChild(document.createTextNode("Max Mustermann"));
		p3.appendChild(document.createTextNode("Musterstrasse 42"));
		p4.appendChild(document.createTextNode("42422 Musterstadt"));
		document.getElementById("address_text").appendChild(p1);
		document.getElementById("address_text").appendChild(p2);
		document.getElementById("address_text").appendChild(p3);
		document.getElementById("address_text").appendChild(p4);

		document.getElementById('rating_button1').style.visibility='hidden';
		document.getElementById('rating_button2').style.visibility='hidden';
		document.getElementById('rating_button3').style.visibility='hidden';
		document.getElementById('rating_button4').style.visibility='hidden';
		document.getElementById('rating_button5').style.visibility='hidden';



	}
	
	else if (exchange_button.textContent=="Parcel sent!") {
		exchange_button.textContent = "Rate your Wretcher!";
		document.getElementById('exchange-button').style.visibility='hidden';
		document.getElementById("address_text").textContent = " ";

		document.getElementById("rate_wretcher").style.visibility='visible';

		document.getElementById('rating_button1').style.visibility='visible';
		document.getElementById('rating_button2').style.visibility='visible';
		document.getElementById('rating_button3').style.visibility='visible';
		document.getElementById('rating_button4').style.visibility='visible';
		document.getElementById('rating_button5').style.visibility='visible';

	


	}
	
	
	else

	{
		exchange_button.textContent = "Exchange now!";
		document.getElementById("exchange-button").textContent = exchange_button.textContent;
				document.getElementById("not_rated_warning").textContent = " ";

			
		document.getElementById('rating_button1').style.visibility='hidden';
		document.getElementById('rating_button2').style.visibility='hidden';
		document.getElementById('rating_button3').style.visibility='hidden';
		document.getElementById('rating_button4').style.visibility='hidden';
		document.getElementById('rating_button5').style.visibility='hidden';
	}

	
}

