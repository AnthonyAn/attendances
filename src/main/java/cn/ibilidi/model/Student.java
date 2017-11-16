package cn.ibilidi.model;

import java.util.List;

public class Student extends User{
    private String bj;
    private String nj;
    private String zy;
    private List<KcInfo> glkcInfos;
    private List<KcInfo> kcInfos;

    @Override
    public String toString() {
        return "Student{" +
                "bj='" + bj + '\'' +
                ", nj='" + nj + '\'' +
                ", zy='" + zy + '\'' +
                ", kcInfos=" + kcInfos +
                ", glkcInfos=" + glkcInfos +
                '}';
    }


    public List<KcInfo> getGlkcInfos() {
        return glkcInfos;
    }

    public void setGlkcInfos(List<KcInfo> glkcInfos) {
        this.glkcInfos = glkcInfos;
    }



    public List<KcInfo> getKcInfos() {
        return kcInfos;
    }

    public void setKcInfos(List<KcInfo> kcInfos) {
        this.kcInfos = kcInfos;
    }

    public String getBj() {
        return bj;
    }

    public void setBj(String bj) {
        this.bj = bj;
    }

    public String getNj() {
        return nj;
    }

    public void setNj(String nj) {
        this.nj = nj;
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy;
    }
}
