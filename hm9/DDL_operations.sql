CREATE TABLE dict_task_complexity
(
    id_task_complexity serial primary key,
    name_complexity character varying(100),
    count_attempts integer NOT NULL DEFAULT 2
);

create table Questions (
	id_question 	serial PRIMARY KEY,
	name_que 		VARCHAR(100) NOT NULL UNIQUE,
	id_task_complexity integer NOT NULL	
);

create table Answers (
	id_answer 	serial PRIMARY KEY,
	name_answer VARCHAR(100) NOT NULL UNIQUE
);

CREATE table Answers_for_Question (
	id_question integer,
	id_answer 	integer,
	pr_correct_answer boolean,
	PRIMARY KEY (id_question, id_answer),
	FOREIGN KEY (id_question) references Questions (id_question) ON DELETE CASCADE,
	FOREIGN KEY (id_answer) references Answers (id_answer) ON DELETE CASCADE
);

create table users(
	id_user serial primary key,
	name_first varchar(100),
	name_middle varchar(100),
	name_last varchar(100),
	user_age integer
);

create table hist_answers_test (
	id_hist serial primary key, 
	id_user integer references users (id_user),
	id_question integer references questions (id_question),
	id_answer integer references answers (id_answer),
	dt_change timestamp not null
);

create table hist_user_result (
	id_hist serial primary key, 
	id_user integer references users (id_user),
	dt_start_test timestamp not null,
	dt_end_test timestamp not null,
	total_question integer not null,
	count_question_correct integer not null
);
