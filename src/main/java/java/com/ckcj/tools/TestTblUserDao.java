package java.com.ckcj.tools;

import org.junit.Test;

public class TestTblUserDao<TblUserDao> {
    TblUserDao tblUserDao= (TblUserDao) new TbluserDaoImpl();
     //测试方法定义：void 方法名test 前缀
     @Test
        public void testDelTblUser(){
        Object tbluserdao;
        Object uid;
        Object upwd;
        boolean f=tbluserdao.udpateTblUser(upwd:"123456",userid:"2");
        System.out.println(f);
    }

    private class TbluserDaoImpl {
    }
}
         Object
            publlic  void testAddTblUser(){
            Tblluser tbluser = new  Tbluser();
            tbluser.setPhone ("234567890");
            tblUser.setMoney (300);
            tblUser.setUname ("CCQED");
            tblUser.setUpwd("123456");
            tblUser.setRid(1);
            boolean f= tbluserDao.addTblUser(tbluser);

            }
        }
        @Test
        public void testlogin(){
        int pageNo=2;
        Tbluser tbluser=tblUserMapper.loginUser(uname：admin,upwd："88888");
        if(tbluserList!=null){
        for(Tbluser tbluser:tbluserList){
        System.out.println(tbluser.getUname());
        Tbluser tbluser=(tbluser.getUname());
        }
        @Test
        public void testFind(){int pageNo=2;
        List<Tbluser> tbluserlist=tblUserMapper.findTblUser(uname:"a",miny:100,maxy:2000,pageNo:(pageNo-1)*2,pageSize:2);
        if(tbluserList!=null){
        for(Tbluser tbluser:tbluserList){
        System.out.println(tbluser.getUname());
        }
        }
        }

        @Test

        public void testDelete(){
        List list=new ArrayList();
        list.add("6");
        list.add("7");
        list.add("3");
        int n = tblUserMapper.deleNTlUser(List);

        System.out.println(n);
        sqlsession.commit();
        }
        }