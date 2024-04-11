package db;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import Model.CustomizedBasicObject;
import Model.test_obj.TestObj;

import java.lang.reflect.Type;

import constants.Constants;

public class DBLoader {
    private DB db;

    public DBLoader() {
        db = DB.getInstance();
    }

    public void load(){
        
        //List<TestObj> tList = get(TestObj.class);
        for (Class<?> clazz : Constants.DB_CLASS_LIST) {
            try {
                List<CustomizedBasicObject> tmpList = new ArrayList<>();

                System.out.println("load "+clazz.getSimpleName());
                List<?> tList = get(clazz);

                for (Object obj : tList) {
                    System.out.println(obj.toString());
                    tmpList.add((CustomizedBasicObject)obj);
                }

                db.storeObjectData(clazz.getSimpleName(), tmpList);

            } catch (Exception e) {
                
                e.printStackTrace();
            }
            
            
        }

    }

   

    public static <T> List<T> get(Class<T> clazz) {
        String filePath = Constants.getClassFileNameInLocal(clazz.getSimpleName());
        
        Gson gson = new Gson();
        Type typeOfT = TypeToken.getParameterized(List.class, clazz).getType();
        List<T> objList = null;
        try (FileReader reader = new FileReader(filePath)) {
            objList = gson.fromJson(reader, typeOfT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objList;
    }
}
