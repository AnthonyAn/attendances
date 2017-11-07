package cn.ibilidi.model;

import java.util.ArrayList;
import java.util.List;

public class KcInfo {
    private String kch;
    private String kcmc;
    private String jsh;
    private String jsxm;
    private String sksj;
    private String skdd;
    private List<Student> students;


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

    public String getJsh() {
        return jsh;
    }

    public void setJsh(String jsh) {
        this.jsh = jsh;
    }

    public String getJsxm() {
        return jsxm;
    }

    public void setJsxm(String jsxm) {
        this.jsxm = jsxm;
    }

    public String getSksj() {
        return sksj;
    }

    public void setSksj(String sksj) {
        this.sksj = sksj;
    }

    public String getSkdd() {
        return skdd;
    }

    public void setSkdd(String skdd) {
        this.skdd = skdd;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "KcInfo{" +
                "kch='" + kch + '\'' +
                ", kcmc='" + kcmc + '\'' +
                ", jsh='" + jsh + '\'' +
                ", jsxm='" + jsxm + '\'' +
                ", sksj='" + sksj + '\'' +
                ", skdd='" + skdd + '\'' +
                ", students=" + students +
                '}';
    }
}
