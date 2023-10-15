
create table groups
(
    id BIGINT NOT NULL,
    group_name VARCHAR NOT NULL,
    primary key (id)
);

insert into groups values(1, 'group');

commit;
