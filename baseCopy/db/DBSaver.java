package db;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Model.CustomizedBasicObject;
import constants.Constants;
import util.DebugUtil;


public class DBSaver {
    private DB db;
    private DebugUtil debug = DebugUtil.getInstance();

    public DBSaver() {
        db = DB.getInstance();
        debug.log("DBSaver is created");
    }

    public void save(){
        Class<?>[] target_string_array = Constants.DB_CLASS_LIST;
        debug.log("DBSaver save() function is called");
        for (Class<?> clazz : target_string_array) {
            saveToJson(clazz.getSimpleName());
        }
        
    }

    private void saveToJson(String class_name){
        debug.log("DBSaver saveToJson() function is called");
        try {
            List<CustomizedBasicObject> objList = db.getObjectData(class_name);
            debug.log(class_name+" is loaded. Size:"+objList.size());

            String file_name = Constants.getClassFileNameInLocal(class_name);
           
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String json = gson.toJson(objList);
            try (FileWriter writer = new FileWriter(file_name)){
                writer.write(json);
                System.out.println("export "+file_name+" finish");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            //Target Data not EXIST ! ! !
            debug.error(class_name+" do not exist in DB");
        }
        
    }

    
}
