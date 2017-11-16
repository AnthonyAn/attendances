package cn.ibilidi.model;


public class KcglInfo {
    private String xh;
    private KcInfo kcInfo;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public KcInfo getKcInfo() {
        return kcInfo;
    }

    public void setKcInfo(KcInfo kcInfo) {
        this.kcInfo = kcInfo;
    }

    @Override
    public String toString() {
        return "KcglInfo{" +
                "xh='" + xh + '\'' +
                ", kcInfo=" + kcInfo +
                '}';
    }
}
