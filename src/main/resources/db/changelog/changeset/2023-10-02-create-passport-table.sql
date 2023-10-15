

create table passports
(
    id BIGINT NOT NULL,
    number VARCHAR NOT NULL,
    primary key (id)
);

insert into passports values(1, '1100 9955 GR');


commit;