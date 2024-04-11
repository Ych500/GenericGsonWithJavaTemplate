package constants;

import Model.test_obj.Test2O;
import Model.test_obj.TestObj;

public class Constants {
    //TODO Change here
    public static String JSON_FILE_NAME_PREFIX = "p500";
    public static Class<?>[] DB_CLASS_LIST = {TestObj.class,Test2O.class};
    public static String JSON_FORMAT = ".json";
    

    public static Boolean DEBUG_MSG_IN_LOG = true;
    public static Boolean ERROR_MSG_IN_LOG = true;

    public static String getClassFileNameInLocal(String classString){
        return JSON_FILE_NAME_PREFIX+"_"+classString+JSON_FORMAT;
    }
}
