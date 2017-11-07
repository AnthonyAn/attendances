package cn.ibilidi.service;

import cn.ibilidi.model.KcInfo;

import java.util.ArrayList;

public interface KcInfoService {
    KcInfo getKcInfoByKch(String kch);
    ArrayList<KcInfo> getKcInfosByJsh(String jsh);
}
