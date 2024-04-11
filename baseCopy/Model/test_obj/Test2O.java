package Model.test_obj;

import Model.CustomizedBasicObject;

public class Test2O extends CustomizedBasicObject{
    private String sName;
    private Integer m1;
    private Integer m2;
    private Integer m3;
    
    public Test2O(String sName, Integer m1, Integer m2, Integer m3) {
        this.sName = sName;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Integer getM1() {
        return m1;
    }

    public void setM1(Integer m1) {
        this.m1 = m1;
    }

    public Integer getM2() {
        return m2;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public Integer getM3() {
        return m3;
    }

    public void setM3(Integer m3) {
        this.m3 = m3;
    }
    
}
