create table couple(

                         id bigint not null auto_increment,
                         fiance_name varchar(100) not null,
                         fiancee_name varchar(100) not null,
                         fiance_email varchar(100) not null unique,
                         fiancee_email varchar(100) not null unique,
                         street varchar(100) not null,
                         district varchar(100) not null,
                         zip varchar(9) not null,
                         complement varchar(100),
                         number varchar(20),
                         state char(2) not null,
                         country varchar(100),
                         city varchar(100) not null,

                         primary key(id)

);