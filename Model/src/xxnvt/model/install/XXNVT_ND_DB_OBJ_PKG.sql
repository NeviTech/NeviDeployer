create or replace package XXNVT_ND_DB_OBJ_PKG
/* Engin OZER 01.06.2015 NeviTech all rights reserved*/
as
    
    function get_object_ddl(p_owner       in varchar2,
                            p_object_type in varchar2,
                            p_object_name in varchar2) return xxnvt_nd_db_information_tbl;
    
end xxnvt_nd_db_obj_pkg;

create or replace package body XXNVT_ND_DB_OBJ_PKG
/* Engin OZER 01.06.2015 NeviTech all rights reserved*/
as
    
    function get_object_ddl(p_owner       in varchar2,
                            p_object_type in varchar2,
                            p_object_name in varchar2) return xxnvt_nd_db_information_tbl
    is
    
        cursor c_objects
            is
               select owner,
                      object_name,
                      subobject_name,
                      object_id,
                      data_object_id,
                      object_type,
                      created,
                      last_ddl_time,
                      timestamp,
                      status,
                      temporary,
                      generated,
                      secondary,
                      namespace,
                      edition_name
                 from sys.all_objects
                where owner       = nvl(p_owner,owner)
                  and object_type = nvl(p_object_type,object_type)
                  and object_name like p_object_name || '%';
                  
        db_info_tbl xxnvt_nd_db_information_tbl;
        db_info_row xxnvt_nd_db_information;
        
        i number := 1;
    
    begin
    
        for r_objects in c_objects
        loop
        
            db_info_tbl.extend;
            
            db_info_tbl(i).owner          := r_objects.owner;
            db_info_tbl(i).object_name    := r_objects.object_name;
            db_info_tbl(i).subobject_name := r_objects.subobject_name;
            db_info_tbl(i).object_id      := r_objects.object_id;
            db_info_tbl(i).data_object_id := r_objects.data_object_id;
            db_info_tbl(i).object_type    := r_objects.object_type;
            db_info_tbl(i).created        := r_objects.created;
            db_info_tbl(i).last_ddl_time  := r_objects.last_ddl_time;
            db_info_tbl(i).timestamp      := r_objects.timestamp;
            db_info_tbl(i).status         := r_objects.status;
            db_info_tbl(i).temporary      := r_objects.temporary;
            db_info_tbl(i).generated      := r_objects.generated;
            db_info_tbl(i).owner          := r_objects.owner;
            db_info_tbl(i).secondary      := r_objects.secondary;
            db_info_tbl(i).namespace      := r_objects.namespace;
            db_info_tbl(i).edition_name   := r_objects.edition_name;
            
            db_info_tbl(i).object_source := dbms_metadata.get_ddl (
                                                                    r_objects.object_type,
                                                                    r_objects.object_name,
                                                                    r_objects.owner
                                                                   );
        
        end loop;
        
        return db_info_tbl;
    
    end get_object_ddl;
    
end xxnvt_nd_db_obj_pkg;