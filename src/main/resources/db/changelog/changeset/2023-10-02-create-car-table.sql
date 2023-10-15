


create table cars
(
    id BIGINT NOT NULL,
    user_id BIGINT NULL,
    model VARCHAR NOT NULL,
    primary key (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

insert into cars values(1, 1, 'mercedes');

commit;