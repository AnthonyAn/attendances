package cn.ibilidi.model;

import java.util.Date;

public class Qddd {
    private String kch;
    private Date sj;
    private double lat;
    private double lng;
    private int dis;

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public String getKch() {
        return kch;
    }

    public void setKch(String kch) {
        this.kch = kch;
    }

    public Date getSj() {
        return sj;
    }

    public void setSj(Date sj) {
        this.sj = sj;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    @Override
    public String toString() {
        return "Qddd{" +
                "kch='" + kch + '\'' +
                ", sj=" + sj +
                ", lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
