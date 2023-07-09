/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderitp;

/**
 *
 * @author RTX
 */
class user {
    private int cid;
    private String name,address,des,iname,vid,did,dname,quantity;
    
    public user (int cid,String name,String address, String des,String iname,String vid,String did,String dname,String quantity){
        
        this.cid = cid;
        this.name = name;
        this.address = address;
        //this.avid = avid;
        this.des = des;
        this.iname = iname;
        this.did = did;
        this.dname = dname;
        this.quantity = quantity;
        this.vid=vid;
    }

    user(int aInt, String string, String string0,String string2, String string3, String string4, String string5, String string6) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getcid(){
    return cid;
    }
    public String getname(){
    return name;
    }
    public String getaddress(){
    return address;
    }
    public String getdes(){
    return des;
    }
    public String getvid(){
    return vid;
    }
    public String getdid(){
    return did;
    }
    public String getquantity(){
    return quantity;
    }
    public String getdname(){
    return dname;
    }
    public String getiname(){
    return iname;
    }
    
}
