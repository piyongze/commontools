package personal.pyz.allpro.bean;

import java.util.Date;

/**
 * Created by piyongze on 2016/5/7.
 */
public class Account {

    private int id;
    private String firstname;
    private String lastname;
    private String address;
    private int chineseScore;
    private int mathScore;
    private int englishScore;
    private String[] intrests;      //兴趣爱好 for Array datatype String
    private int[] healthData;      //健康指标  for Array datatype Int
    private String cardPwd;        //银行卡密码 for binary datatype
    private boolean isCityMan;     //是否城里人   for boolean
    private Date birthday;         //出生日期 for date
    private GeoBean bGeo;
    private String sGeo;         //"41.12,-71.34"
    private String shGeo;        //geohash
    private int[] iaGeo;         //int array geo
    private String geoshape;      //con't do
    private String ip;            //ip
    private String[] fullname;    //fullname
    private int age;              //integer
    private String sfullname;     //全名

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getChineseScore() {
        return chineseScore;
    }

    public void setChineseScore(int chineseScore) {
        this.chineseScore = chineseScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public String[] getIntrests() {
        return intrests;
    }

    public void setIntrests(String[] intrests) {
        this.intrests = intrests;
    }

    public int[] getHealthData() {
        return healthData;
    }

    public void setHealthData(int[] healthData) {
        this.healthData = healthData;
    }

    public String getCardPwd() {
        return cardPwd;
    }

    public void setCardPwd(String cardPwd) {
        this.cardPwd = cardPwd;
    }

    public boolean isCityMan() {
        return isCityMan;
    }

    public void setCityMan(boolean cityMan) {
        isCityMan = cityMan;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public GeoBean getbGeo() {
        return bGeo;
    }

    public void setbGeo(GeoBean bGeo) {
        this.bGeo = bGeo;
    }

    public String getsGeo() {
        return sGeo;
    }

    public void setsGeo(String sGeo) {
        this.sGeo = sGeo;
    }

    public String getShGeo() {
        return shGeo;
    }

    public void setShGeo(String shGeo) {
        this.shGeo = shGeo;
    }

    public int[] getIaGeo() {
        return iaGeo;
    }

    public void setIaGeo(int[] iaGeo) {
        this.iaGeo = iaGeo;
    }

    public String getGeoshape() {
        return geoshape;
    }

    public void setGeoshape(String geoshape) {
        this.geoshape = geoshape;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String[] getFullname() {
        return fullname;
    }

    public void setFullname(String[] fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSfullname() {
        return sfullname;
    }

    public void setSfullname(String sfullname) {
        this.sfullname = sfullname;
    }
}
