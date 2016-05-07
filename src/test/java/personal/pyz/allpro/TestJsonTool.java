package personal.pyz.allpro;

import org.junit.Test;
import personal.pyz.allpro.bean.Account;
import personal.pyz.allpro.bean.GeoBean;

import java.util.Date;

import static org.junit.Assert.assertEquals;

/**
 * Created by piyongze on 2016/5/7.
 */
public class TestJsonTool {

    @Test
    public void testToJson(){
        JsonHandler handle=new GsonJsonHandler();
        JsonTool tool=new JsonTool(handle);
        Account account=new Account();
        account.setId(1);
        account.setAddress("shanghai pudong");
        account.setAge(10);
        GeoBean geoBean=new GeoBean();
        geoBean.setLat(112);
        geoBean.setLon(100);
        account.setbGeo(geoBean);
        account.setBirthday(new Date());
        account.setCardPwd("feeedkdikfieeeeeee");
        account.setChineseScore(20);
        account.setCityMan(true);
        account.setEnglishScore(50);
        account.setFirstname("lily");
        account.setFullname(new String[]{"lily","lala"});
        account.setHealthData(new int[]{1,2,333});
        account.setIaGeo(new int[]{112,110});
        account.setIntrests(new String[]{"football","basketball","pinpangball"});
        account.setIp("127.0.0.1");
        account.setGeoshape("");
        account.setShGeo("feeeeeeeeee");
        account.setsGeo("ddddddddddd");
        account.setSfullname("lily lala");
        account.setMathScore(80);
        String expected=tool.toJson(account);
        System.out.println(expected);
    }
}
