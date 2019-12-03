create table login(
    username char(40) REFERENCES customer(username), 
    password char(40)
)
