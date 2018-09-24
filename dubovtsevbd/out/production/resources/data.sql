insert into faculty(id_faculty, name_faculty) values (1, 'ИМИТИФ');
insert into speciality(id_speciality, name_speciality) values (1, '09.03.01');
insert into student(id_student, name_student, enrolldate_student, id_faculty, id_speciality, course_student, groupnumber_student) values (1, 'Иванов А.А.', '2018-08-31', 1, 1, 1, 1);
insert into marks(id_marks, id_student, semester, name_subject, mark, date_exam, surname_teacher) values (1, 1, 1, 'Программирование', 0, '2019-01-27', 'Родионов');