   CREATE TABLE tradingpartners (
    username char(40) REFERENCES customer(username), 
    trading_partner char(40), 
    FOREIGN KEY(trading_partner) REFERENCES customer(username)
   )