package java.com.ckcj.tools;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.awt.*;
import java.com.ckcj.mapper.TblUserMapper;

public class TestTblRoleMapper<TblRoleMapper>() {
    @Test
    SqlSession sqlsession = MybatisDbHelper.getSession();
    TblRoleMapper tblRoleMapper=sqlsession.getMapper(TblUserMapper .class);

    public <Tblrole> void testFindRoleUsers(){
        Object rid = null;
        Tblrole tblrole= tblRoleMapper.findRoleUsers(rid"1");
        List tbluserList=tblrole.getTblusers();
        for (Tbluser tblUser:TbluserList){
        }
        Object tbluser;
        System.out.println(tbluser.getUname());
    }

    private class SqlSession {
        public TblRoleMapper getMapper(Class<TblUserMapper> tblUserMapperClass) {
        }
    }
}