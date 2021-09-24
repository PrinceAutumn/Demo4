package java.com.ckcj.dao;

public class TblUserFactory<obj> {
     public  Object getInstanceObject(String className) {
             Object obj = null;
          try {
             Class classze = Class.forName(className);
             obj = classze.newInstance();//实例化类
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
             e.printStackTrace();
        }
        return obj;
        //      LiteralNode<Object> classze = null;

    }


    public  static  void main(String[]args) {
         //MusicDao obj = (MusicDao) Factory.getInstanceObject("Com.soft.MusicDaoImpl");//dao强制类型转换
         //UserDao  obj = (UserDao) Factory.getInstanceObject("Com.soft.UserDaoImpl");
    }
}

