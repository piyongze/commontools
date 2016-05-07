package personal.pyz.allpro;

/**
 * Hello world!
 *
 */
public class JsonTool
{
    private JsonHandler jsonHandler;

    public JsonTool(JsonHandler jsonHandler){
        this.jsonHandler=jsonHandler;
    }
    public String toJson(Object obj){
        return jsonHandler.toJson(obj);
    }
}
