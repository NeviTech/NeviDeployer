create or replace trigger sys.xxnvt_nd_ddl_control_trg
before ddl on database
declare
    l_os_user varchar2(100);
    l_count number;
begin
    select sys_context ('userenv', 'os_user')
      into l_os_user
      from dual;
      
    select count(1)
    into l_count
    from xxtg_log;
      
    if(l_count > 0 and
       l_os_user = 'EXT0120765') then
       raise_application_error
               (-20099,
                   UPPER (USER)
                || '  user''i '
                || UPPER (SYS_CONTEXT ('userenv', 'os_user'))
                || ' OSUseri ile '
                || UPPER (SYS_CONTEXT ('userenv', 'host'))
                || '('
                || SYS_CONTEXT ('userenv', 'ip_address')
                || ')'
                || '  host''undan '
                || SYS_CONTEXT ('userenv', 'module')
                || ' Programi ile '
                || UPPER (SYS_CONTEXT ('userenv', 'db_name'))
                || ' DB''ye baglanamazsiniz. Netflow ?zerinden sunucu baglanti izni kategorisinden yetki talep ediniz...'
               );
    end if;

end xxnvt_nd_ddl_control_trg;