package Model;

import com.google.gson.Gson;

public class CustomizedBasicObject {
    @Override
    public String toString(){
        Gson gson = new Gson();
        return this.getClass().getSimpleName()+" : "+gson.toJson(this);
    }
}
