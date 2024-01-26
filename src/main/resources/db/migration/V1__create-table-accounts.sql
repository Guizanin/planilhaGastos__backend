create table accounts(

    id bigint not null auto_increment,
    name varchar(100) not null,
    value DOUBLE,
    active tinyint not null,
    primary key(id)

);