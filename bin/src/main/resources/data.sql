INSERT INTO modules (id, code, credits, nfq_level, description) 
	VALUES (1, 'SOFT8027', 10, 'A', 'This is an integrated module where students learn about the end-to-end design, development and deployment of applications for the cloud using software development frameworks and modern software development principles, practices and processes.');

INSERT INTO modules (id, code, credits, nfq_level, description) 
	VALUES (2, 'COMP8046', 5, 'A', 'In Information Analytics a learner will use a range of analytical techniques to gain valuable insights from data for a specific application domain. The module will focus on the application of machine learning techniques that facilitate the identification of trends and patterns in data over time.');

INSERT INTO learning_outcomes (id,module_id,display_order,description)
	VALUES (1, 1, 1, 'Design scalable enterprise / cloud applications using a layered architecture.');

INSERT INTO learning_outcomes (id,module_id,display_order,description)
	VALUES (2, 1, 2, 'Configure and develop an application using inversion of control and dependency injection mechanisms.');

INSERT INTO learning_outcomes (id,module_id,display_order,description)
	VALUES (3, 2, 1, 'Describe the concepts, principles, methods and techniques of machine learning and its role in knowledge discovery.');
	
INSERT INTO learning_outcomes (id,module_id,display_order,description)
	VALUES (4, 2, 2, 'Utilise data pre-processing and manipulation techniques on data from a specific application domain.');
	