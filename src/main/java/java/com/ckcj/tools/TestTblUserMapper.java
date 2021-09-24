package java.com.ckcj.tools;

import com.ckcj.entity.Tbluser;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.testng.annotations.Test;

import java.com.ckcj.entity.Tbluser;
import java.com.ckcj.mapper.TblUserMapper;

public class TestTblUserMapper {
      public <sqlSession> void testAddTbluser() {
          SqlSession sqlsession = MybatisDbHelper.getSession();
          TblUserMapper tblUserMapper = sqlSession.getMapper(TblUserMapper.class);
          Tbluser tbluser = new Tbluser();
          tbluser.setPhone("23456789");
          tbluser.setMoney(300);
          tbluser.setUname("Malin");
          tbluser.setUpwd("12345667");
          tbluser.setRid(1);
          int n = tblUserMapper.addTbluser(tbluser);
          System.out.println(n);
          sqlsession.commit();
      }
      @
  private class TblUserMapper {
  }
}





    @Test
    public void testLogin(){
    Sqlsession sqlsession=MybatisDbHelper.getSession();
    TblUserMapper tblUserMapper=sqlsession.getMapper(TblUserMapper.class);
   }