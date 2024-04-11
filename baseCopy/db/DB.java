package db;

import java.util.HashMap;
import java.util.List;

import Model.CustomizedBasicObject;

public class DB {
    

    private HashMap<String,List<CustomizedBasicObject>> data;

    private static DB instance;
    
    private DB(){
        data = new HashMap<>();
    }
    
    public static DB getInstance(){
        if(instance == null){
            synchronized(DB.class){
                if(instance == null){
                    instance = new DB();
                }
            }
        }
        return instance;
    }



    public List<CustomizedBasicObject> getObjectData(String classString) {
        
        return data.get(classString);
       
    }

    public void storeObjectData(String classString,List<CustomizedBasicObject> objList){
        data.put(classString, objList);
        System.out.println("Store "+classString+" List Success! Size: "+objList.size());
    }

    public void save(){
        DBSaver dbSaver = new DBSaver();
        dbSaver.save();
    }

    public void load(){
        DBLoader dbLoader = new DBLoader();
        dbLoader.load();
    }

    public void displayAllData(){
        System.out.println("All loaded class");
        //loop all key
        for (String key : data.keySet()) {
            System.out.println(key);
        }

        System.out.println("Detail Data:");
        for (String key : data.keySet()) {
            System.out.println(key+":");
            List<CustomizedBasicObject> cbolist = data.get(key);
            for (CustomizedBasicObject customizedBasicObject : cbolist) {
                System.out.println(customizedBasicObject.toString());
            }
        }
    }
}
