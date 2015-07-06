create or replace type xxnvt_nd_db_information as object
(
    owner          varchar2(30),
    object_name    varchar2(128),
    subobject_name varchar2(30),
    object_id      number,
    data_object_id number,
    object_type    varchar2(19),
    created        date,
    last_ddl_time  date,
    timestamp      varchar2(19),
    status         varchar2(7),
    temporary      varchar2(1),
    generated      varchar2(1),
    secondary      varchar2(1),
    namespace      number,
    edition_name   varchar2(30),
    object_source  clob
);