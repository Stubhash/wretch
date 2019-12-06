create table customer_information(
    username char(40) PRIMARY KEY UNIQUE, 
    firstname char(40),
    lastname char(40),
    email char(40),
    phonenr char(40),
    street char(40),
    housingnr char(4),
    zip char(5),
    city char(40),
    score char(5)
);

INSERT INTO customer_information( 
    username, firstname, lastname, email, phonenr, street, housingnr,
    zip, city, score )  
	
    VALUES ('schnickschnack',
    'Jürgen',
    'Müller',
    'musteremail@hotmail.com',
    '1234567890',
    'Musterstraße',
    '42',
    '42697', 
    'Musterstadt', 
    '12345');

    INSERT INTO   customer_information (
        username, firstname, lastname, email, phonenr, street, housingnr,
    zip, city, score ) 
    VALUES (
    'ichmageiscreme',
    'Justus',
    'Meier',
    'musteremail2@hotmail.com',
     '1234567890',
    'Musterstraße',
    '45',
    '42697', 
    'Musterstadt', 
    '123124');

    INSERT INTO   customer_information (
            username, firstname, lastname, email, phonenr, street, housingnr,
    zip, city, score ) 
    VALUES (
    'andreahasi',
    'Andrea',
    'Schulz',
    'musteremail3@hotmail.com',
     '1234567890',
    'Musterstraße',
    '41',
    '42697', 
    'Musterstadt', 
    '124');

    INSERT INTO   customer_information (
            username, firstname, lastname, email, phonenr, street, housingnr,
    zip, city, score ) 
    VALUES (
    'owouwu',
    'Maximilian',
    'Müller',
    'musteremail4@hotmail.com',
     '1234567890',
    'Musterstraße',
    '42',
    '42697', 
    'Musterstadt', 
    '1');

    INSERT INTO   customer_information (
            username, firstname, lastname, email, phonenr, street, housingnr,
    zip, city, score ) 
    VALUES (
    'Pewdiepie',
    'Felix',
    'Eisberg',
    'musteremail5@hotmail.com',
     '1234567890',
    'Musterstraße',
    '42',
    '42697', 
    'Musterstadt', 
    '9000');