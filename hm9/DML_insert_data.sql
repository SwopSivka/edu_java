--Заполнение справочника dict_task_complexit
insert into dict_task_complexity (name_complexity, count_attempts)
values 	('Нормальная', 2),
		('Сложная', 3),
		('Простая', 1);
		
insert into questions (id_question, name_que, id_task_complexity)
values 	(1, 'В файл с каким расширеним компилируется java-файл?', 1),
		(2, 'Какой тип данных не относится к примитивным?', 2),
		(3, 'С помощью какой команды git можно отправить изменения в удаленный репозиторий?', 1);
select setval('questions_id_question_seq',3);
		
insert into answers (id_answer, name_answer)
values 	(1, 'exe'),
		(2, 'java'),
		(3, 'class'),
		(4, 'dll'),
		(5, 'byte'),
		(6, 'string'),
		(7, 'double'),
		(8, 'put'),
		(9, 'pull'),
		(10, 'push');
select setval('answers_id_answer_seq', 10);
	
insert into answers_for_question (id_question, id_answer, pr_correct_answer)
values 	(1, 1, false),
		(1, 2, false),
		(1, 3, true), 
		(1, 4, false),
		(2, 5, false),
		(2, 6, true),
		(2, 7, false),
		(2, 3, false),
		(3, 8, false),
		(3, 9, false),
		(3, 10, true);
		
insert into users (name_first, name_last, name_middle, user_age)
values 	('Петруша', 'Федорович', 'Плавильников', 21),
		('Наталия', 'Алексеевна', 'Харчо', 18),
		('Константин', 'Петрович', 'Петров', 32),
		('Марфа', 'Николаевна', 'Плавильникова', 35);
		
insert into hist_user_result (id_user, dt_start_test, dt_end_test, total_question, count_question_correct)
values 	(1, timestamp'2022-11-06 15:55:00', timestamp'2022-11-06 16:05:00', 3, 2),
		(2, timestamp'2022-11-06 15:55:00', timestamp'2022-11-06 16:05:00', 3, 1),
		(3, timestamp'2022-11-06 15:55:00', timestamp'2022-11-06 16:05:00', 3, 3);
		
insert into hist_answers_test (id_user, id_question, id_answer, dt_change)
values (1, 1, 2, timestamp'2022-11-06 15:56:00'),
	   (1, 2, 6, timestamp'2022-11-06 15:58:00'),
	   (1, 3, 10, timestamp'2022-11-06 16:05:00'),
	   (2, 1, 1, timestamp'2022-11-06 15:56:00'),
	   (2, 2, 5, timestamp'2022-11-06 15:58:00'),
	   (2, 3, 10, timestamp'2022-11-06 16:05:00'),
	   (3, 1, 3, timestamp'2022-11-06 15:56:00'),
	   (3, 2, 6, timestamp'2022-11-06 15:58:00'),
	   (3, 3, 10, timestamp'2022-11-06 16:05:00');