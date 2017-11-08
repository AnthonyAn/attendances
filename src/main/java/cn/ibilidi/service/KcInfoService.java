package cn.ibilidi.service;

import cn.ibilidi.model.KcInfo;
import cn.ibilidi.model.KcqdInfo;

import java.util.ArrayList;

public interface KcInfoService {
    KcInfo getKcInfoByKch(String kch);
    ArrayList<KcInfo> getKcInfosByJsh(String jsh,String kcmc,String jxdd);
    ArrayList<KcInfo> getKcInfosByXh(String xh);
    int updataAllowOrNot(String kch,int allowornot);
}
