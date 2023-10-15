
create table users
(
    id BIGINT NOT NULL,
    passport_id BIGINT NOT NULL,
    group_id BIGINT NOT NULL,
    name VARCHAR NOT NULL,
    last_name VARCHAR NOT NULL,
    primary key (id),
    FOREIGN KEY (passport_id) REFERENCES passports (id),
    FOREIGN KEY (group_id) REFERENCES groups (id)
);

insert into users values(1, 1, 1, 'Artem', 'Nsv');

--alter table clients add constraint uk_id unique (id);

commit;
