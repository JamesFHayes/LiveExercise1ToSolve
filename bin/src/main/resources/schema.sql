CREATE TABLE modules (
	id 			INT NOT NULL auto_increment,
	code 		VARCHAR(10) NOT NULL,
	credits 	DECIMAL(5,2) NOT NULL,
	nfq_level 	CHAR(1)
		CHECK nfq_level IN ('F', 'I', 'A', 'E'),
	description	TEXT,
PRIMARY KEY (id));

CREATE TABLE learning_outcomes (
	id 			INT NOT NULL auto_increment,
	module_id	INT NOT NULL,
	display_order SMALLINT NOT NULL DEFAULT 1,
	description	TEXT,
PRIMARY KEY (id));

ALTER TABLE learning_outcomes ADD FOREIGN KEY (module_id) REFERENCES modules(id);