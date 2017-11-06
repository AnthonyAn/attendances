package cn.ibilidi.model;

public class QdInfo {
    private String kch;
    private String kcmc;
    private String xh;
    private String xm;
    private String bj;
    private String zy;
    private String nj;
    private String qddd;
    private String qdsj;
    private String lsxm;
    private String openid;
    private String headurl;
    private int gender;

    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) { 
        this.xh = xh;
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    public String getQddd() {
        return qddd;
    }

    public void setQddd(String qddd) {
        this.qddd = qddd;
    }

    public String getQdsj() {
        return qdsj;
    }

    public void setQdsj(String qdsj) {
        this.qdsj = qdsj;
    }

    public String getLsxm() {
        return lsxm;
    }

    public void setLsxm(String lsxm) {
        this.lsxm = lsxm;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "QdInfo{" +
                "kch='" + kch + '\'' +
                ", kcmc='" + kcmc + '\'' +
                ", xh='" + xh + '\'' +
                ", xm='" + xm + '\'' +
                ", bj='" + bj + '\'' +
                ", zy='" + zy + '\'' +
                ", nj='" + nj + '\'' +
                ", qddd='" + qddd + '\'' +
                ", qdsj='" + qdsj + '\'' +
                ", lsxm='" + lsxm + '\'' +
                ", openid='" + openid + '\'' +
                ", headurl='" + headurl + '\'' +
                ", gender=" + gender +
                '}';
    }
}
