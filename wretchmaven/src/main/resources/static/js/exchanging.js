/*!
exchanging.js works with the user input when the "Exchange now"-Button was pressed.
 */
function hide_rating_buttons(){		
 		document.getElementById('rating_button1').style.visibility='hidden';
		document.getElementById('rating_button2').style.visibility='hidden';
		document.getElementById('rating_button3').style.visibility='hidden';
		document.getElementById('rating_button4').style.visibility='hidden';
		document.getElementById('rating_button5').style.visibility='hidden';
}

function modify_exchange_button()
{
	var exchange_button = document.getElementById("exchange-button");
	var rating_button1 = document.getElementById("rating-button1");
	var rating_button2 = document.getElementById("rating-button2");
	var rating_button3 = document.getElementById("rating-button3");
	var rating_button4 = document.getElementById("rating-button4");
	var rating_button5 = document.getElementById("rating-button5");
	
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
//		exchange_button.textContent = "Rate your Wretcher!";
		document.getElementById('exchange-button').style.visibility='hidden';
		document.getElementById("address_text").textContent = " ";


		
			var p1 = document.createElement("P");
			var p2 = document.createElement("P");
			p1.appendChild(document.createTextNode("Rate your wretched gift from 1-5!"));
//			p2.appendChild(document.createTextNode("If you don't click a santa claus your Wretcher won't be rated!"));
			document.getElementById("not_rated_warning").appendChild(p1);
//			document.getElementById("not_rated_warning").appendChild(p2);

		document.getElementById('rating_button1').style.visibility='visible';
		document.getElementById('rating_button2').style.visibility='visible';
		document.getElementById('rating_button3').style.visibility='visible';
		document.getElementById('rating_button4').style.visibility='visible';
		document.getElementById('rating_button5').style.visibility='visible';

		
//		if (document.getElementById('exchange-button').style.visibility=='hidden'){
//			
//			rating_button1.addEventListener(“click”, button1clicked);
//			function button1clicked(){
//				document.getElementById('exchange-button').style.visibility='visible';
//				exchange_button.textContent = "Rate your Wretcher!";
//	​			}
//			rating_button2.addEventListener(“click”, button2clicked);
//			function button2clicked(){
//				document.getElementById('exchange-button').style.visibility='visible';
//				exchange_button.textContent = "Rate your Wretcher!";
//	​			}
//			rating_button3.addEventListener(“click”, button3clicked);
//			function button3clicked(){
//				document.getElementById('exchange-button').style.visibility='visible';
//				exchange_button.textContent = "Rate your Wretcher!";
//	​			}
//			rating_button4.addEventListener(“click”, button4clicked);
//			function button4clicked(){
//				document.getElementById('exchange-button').style.visibility='visible';
//				exchange_button.textContent = "Rate your Wretcher!";
//	​			}
//			rating_button5.addEventListener(“click”, button5clicked);
//			function button5clicked(){
//				document.getElementById('exchange-button').style.visibility='visible';
//				exchange_button.textContent = "Rate your Wretcher!";
//	​			}
//		}


	}
	
	
	
	else if  (exchange_button.textContent=="Rate your Wretcher!")   
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

