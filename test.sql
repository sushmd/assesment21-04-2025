create table students (
id serial primary key,
name varchar(50) not null,
email varchar(50) unique,
age int,
marks decimal(10,2)
);

insert into students (name,email,age,marks) values ('Alice','alice@gmail.com',21,95.6);
insert into students (name,email,age,marks) values ('Bob','bob@gmail.com',23,90.1);
insert into students (name,email,age,marks) values ('Charlie','charlie@gmail.com',20,87.56);
insert into students (name,email,age,marks) values ('David','david@gmail.com',24,82.56);
insert into students (name,email,age,marks) values ('Shirley','shirley@gmail.com',25,70.6);
insert into students (name,email,age,marks) values ('Ram','ram@gmail.com',17,74.6);

select * from students;

select * from students where age > 21;

update students set email = 'rahul@gmail.com' where id = 5;

delete from students where age < 18;

select marks from students order by marks desc limit 1;


create table student (
student_id int primary key,
name varchar(50),
age int
);
create table courses (
course_id int primary key,
student_id int,
course_name varchar(50),
foreign key(student_id) references student(student_id)
);

select * from student;

insert into student values 
(1,'Rahul',22),
(2,'Priya',21),
(3,'Akash',23);

insert into courses values (101,1,'Java'),
(102,2,'Python'),
(103,1,'SQL');

select * from courses;

select s.name, c.course_name from student s, courses c where c.student_id = s.student_id;