package cn.ibilidi.model;

public class Student extends User{
    private String bj;
    private String nj;
    private String zy;

    @Override
    public String toString() {
        return "Student{" +
                "bj='" + bj + '\'' +
                ", nj='" + nj + '\'' +
                ", zy='" + zy + '\'' +
                '}';
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
