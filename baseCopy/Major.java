


import java.util.ArrayList;
import java.util.List;

import Model.CustomizedBasicObject;
import Model.test_obj.Test2O;
import Model.test_obj.TestObj;
import db.DB;



public class Major {
    public static void main(String[] args) {
        System.out.println("start");
        demoTest();
        System.out.println("end");
    }
 
    public static void demoTest(){
        DB db = DB.getInstance();
        db.load();
        db.displayAllData();
        db.save();

        /* 
        List<CustomizedBasicObject> objList = new ArrayList<>();
        objList.add(new Test2O("k5", 13, 555, 85));
        objList.add(new Test2O("z5", 1355, 5755, 8505));

        db.storeObjectData("Test2O", objList);
        db.save();
        */
        
    }
}
