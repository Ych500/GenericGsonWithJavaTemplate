package Model.test_obj;

import Model.CustomizedBasicObject;

public class TestObj extends CustomizedBasicObject{
    private String objname;
    private Integer number;
    
    public TestObj(String objname, Integer number) {
        this.objname = objname;
        this.number = number;
    }
    public String getObjname() {
        return objname;
    }
    public void setObjname(String objname) {
        this.objname = objname;
    }
    public Integer getNumber() {
        return number;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }

   
}
