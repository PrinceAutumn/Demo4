package java.com.ckcj.entity;

public class Tbluser {
    public Object setUname;
    private long userid;
    private long rid;
    private String uname;
    private String upwd;
    private double money;
    private String phone;

    private Tblrole tblrole;
    private long usersid;

    public Tblrole getTblrole() {
        return tblrole;
    }

    public void setTblrole(){
        this.tblrole=tblrole;
    }
    
    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {

         this.usersid = userid;
    }

    public long getRid() {

        return rid;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public void setRid(int rid) {

        this.rid = rid;
    }

    public void setUname(String uname) {

        this.uname = uname;
    }

    public void setMoney(int money) {

        this.money = money;
    }

    public void setUpwd(String upwd)
    {
        this.upwd = upwd;
    }

    public void getRid(int i) {
    }
}

