package cn.ibilidi.model;

import java.util.Date;

public class KcqdInfo {
    private String kch;
    private String xh;
    private Date qdsj;
    private String qddd;
    private String kcmc;
    private Student student;

    @Override
    public String toString() {
        return "KcqdInfo{" +
                "kch='" + kch + '\'' +
                ", xh='" + xh + '\'' +
                ", qdsj=" + qdsj +
                ", qddd='" + qddd + '\'' +
                ", kcmc='" + kcmc + '\'' +
                ", student=" + student +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public Date getQdsj() {
        return qdsj;
    }

    public void setQdsj(Date qdsj) {
        this.qdsj = qdsj;
    }

    public String getQddd() {
        return qddd;
    }

    public void setQddd(String qddd) {
        this.qddd = qddd;
    }

    public String getKcmc() {
        return kcmc;
    }

    public void setKcmc(String kcmc) {
        this.kcmc = kcmc;
    }

    public String getKch() {

        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }
}
