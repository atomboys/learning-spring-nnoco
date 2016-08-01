CREATE TABLE IF NOT EXISTS tbl_member  (
	userid VARCHAR(50),
	userpw VARCHAR(50) NOT NULL,
	username VARCHAR(50) NOT NULL,
	email VARCHAR(100) NOT NULL,
	regdate TIMESTAMP NOT NULL DEFAULT NOW(),
	updatedate TIMESTAMP NOT NULL DEFAULT NOW(),
	PRIMARY KEY (userid)
);