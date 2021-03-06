GRANT ALL PRIVILEGES ON BIMR.* TO bimruser@localhost;

# get the duplicates
SELECT * FROM tweets
WHERE tweetMessage IN
(SELECT tweetMessage
	FROM tweets
	GROUP BY tweetMessage
	HAVING count(*) > 1
);

CREATE TABLE tweets (
	id bigint(100) NOT NULL AUTO_INCREMENT,
	tweetId bigint(100),
	tweetMessage varchar(200),
	latitude varchar(50),
	longitude varchar(50),
	observationDate date,
	PRIMARY KEY(id)
);

CREATE TABLE ebird (
	id bigint(100) NOT NULL AUTO_INCREMENT,
	commonName VARCHAR(100),
	scientificName VARCHAR(100),
	longitude DECIMAL(50,10),
    latitude DECIMAL(50,10),
    countryName VARCHAR(100),
	observationDate date,
	PRIMARY KEY(id)
);

CREATE TABLE species (
	id bigint(100) NOT NULL AUTO_INCREMENT,
	species varchar(100),
	genus varchar(100),
	family varchar(100),
	PRIMARY KEY(id)
);

CREATE TABLE twitter_user (
	id varchar(50),
	username varchar(50),
	screenName varchar(50),
	email varchar(50),
	location varchar(50),
	url varchar(50)
);

CREATE TABLE ebird_data (
	id int,
	user varchar(50),
	common_name varchar(50),
	latitude varchar(50),
	longitute varchar(50),
	observation_date date
);
