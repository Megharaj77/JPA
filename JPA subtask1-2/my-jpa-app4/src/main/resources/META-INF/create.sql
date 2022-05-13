create table bookstoredb3.bookstore_table(gen_name varchar(16) not null, gen_val int not null);
insert into bookstoredb3.bookstore_table values ("book_id",1);
insert into bookstoredb3.bookstore_table values ("author_id",1000);
create table bookstoredb3.book (id int, title varchar(128), author varchar(64), price float);
create table bookstoredb3.author(id int, name varchar(128), birthdate datetime);