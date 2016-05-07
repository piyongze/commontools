package personal.pyz.allpro;

import com.google.gson.Gson;

/**
 * Created by piyongze on 2016/5/7.
 */
public class GsonJsonHandler implements JsonHandler{
    public String toJson(Object obj) {
        Gson gson = new Gson();
        return gson.toJson(obj);
    }
}
