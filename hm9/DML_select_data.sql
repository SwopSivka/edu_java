--1) Вывод всех вопросов и их ответов с признаком корректного ответа
select q.name_que, 
	   n.name_answer, 
	   (case  
		  when pr_correct_answer  then 'верный'
		  else 'не верный' 
		end) as answer_correct 
  from questions q
  join answers_for_question aq
    on q.id_question = aq.id_question
  join answers n
    on aq.id_answer = n.id_answer;
  
--2) Вывод всех вопросов и корректного ответа со сложнотью
select q.name_que, 
	   n.name_answer,
	   c.name_complexity
  from questions q
  join answers_for_question aq
    on q.id_question = aq.id_question
  join answers n
    on aq.id_answer = n.id_answer
   and aq.pr_correct_answer = true
  join dict_task_complexity c
    on c.id_task_complexity = q.id_task_complexity;

--3) Вывод Итории прохождения тестов с указанными ответами от пользователей
select (u.name_middle || u.name_first || ' ' || u.name_last) as FIO,
       q.name_que,
	   a.name_answer, 
	   aq.pr_correct_answer, 
	   r.dt_start_test,
	   r.dt_end_test
  from hist_answers_test t 
  join users u
    on t.id_user = u.id_user
  join answers a 
    on t.id_answer = a.id_answer
  join questions q
    on t.id_question = q.id_question
  join hist_user_result r
    on r.id_user = u.id_user
  join answers_for_question aq
    on aq.id_question = t.id_question
   and aq.id_answer = t.id_answer	
 order by u.name_middle, r.dt_start_test;