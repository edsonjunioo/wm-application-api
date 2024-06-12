create table supplier(

                        id bigint not null auto_increment,
                        name varchar(100) not null,
                        email varchar(100) not null unique,
                        phone_number varchar(20) not null unique,
                        type varchar(100) not null,
                        description varchar(100) not null,
                        hiring_status varchar(100) not null,
                        street varchar(100) not null,
                        district varchar(100) not null,
                        zip varchar(9) not null,
                        complement varchar(100),
                        number varchar(20),
                        state char(2) not null,
                        country varchar(100),
                        city varchar(100) not null,
                        total_price decimal,
                        start_value decimal,
                        end_value decimal,
                        rules varchar(200),
                        percent_start_value integer,
                        total_payment decimal,

                        primary key(id)

);