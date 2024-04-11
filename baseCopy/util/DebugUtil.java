package util;

import constants.Constants;

public class DebugUtil {
    private static DebugUtil instance;
    
    
    private DebugUtil(){
    }
    
    public static DebugUtil getInstance(){
        if(instance == null){
            synchronized(DebugUtil.class){
                if(instance == null){
                    instance = new DebugUtil();
                }
            }
        }
        return instance;
    }

    public void log(String s){
        if(Constants.DEBUG_MSG_IN_LOG){
            System.out.println(s);
        }
    }
    public void error(String s){
        if(Constants.ERROR_MSG_IN_LOG){
            System.out.println(s);
        }
    }
}
