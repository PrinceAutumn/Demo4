package java.com.ckcj.dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.tools.MybatisDbHelper;
import org.apache.ibatis.session.SqlSession;

import java.com.ckcj.entity.Tbluser;
import java.com.ckcj.tools.MybatisDbHelper;
import java.com.ckcj.tools.TestTblRoleMapper;
import java.util.HashMap;
import java.util.Map;

public abstract class TblUserDaoImpl implements TrabilUserdao {
    @Override
    public boolean addTbluser(Tbluser tbluser, MybatisDbHelper mybatisDbhelper) {
        boolean flag = false;
        try {
            //1.得到链接
            SqlSession sqlSession = (SqlSession) mybatisDbhelper.getSession;
            //2.SQL
            Map map = new HashMap();
            Object id = null;
            map.put("upwd", id);
            Object userid = null;
            map.put("userid", userid);
            String s;
            int num = sqlSession.insert("addTblUser", tbluser);
            //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                flag = true;
            }
        } catch (Exception e) {
            flag = false;
            e.printStackTrace();
        }
        return flag;
    }

    protected abstract void getSession();

    @Override
    public boolean delTblUser(String uid) {
        try {
            //1.得到链接
            SqlSession sqlSession = (SqlSession) com.ckcj.tools.MybatisDbHelper.getSession();
            //2.SQL
            int num = sqlSession.insert(uid);
            //3.提交
            sqlSession.commit();
            System.out.println(num);
            if (num > 0) {
                boolean flag = true;
            }
        } catch (Exception e) {
            boolean flag = false;
            e.printStackTrace();
        }
        boolean flag = false;
        return flag;
    }
}















