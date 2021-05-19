create table client (
    id bigint not null auto_increment primary key,
    name varchar(100) not null,
    email varchar(255) not null,
    phone_number varchar(20) not null
);