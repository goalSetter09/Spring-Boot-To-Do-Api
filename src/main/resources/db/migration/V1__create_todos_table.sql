drop table todos if exists todos;
create table todos (
    id bigserial primary key,
    name text,
    completed boolean not null default false
);