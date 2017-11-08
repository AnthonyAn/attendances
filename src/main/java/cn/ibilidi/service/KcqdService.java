package cn.ibilidi.service;

import cn.ibilidi.exception.IllegalSignInException;
import cn.ibilidi.model.KcqdInfo;

import java.util.ArrayList;

public interface KcqdService {
    int insertQdInfo(KcqdInfo kcqdInfo) throws IllegalSignInException;
    ArrayList<KcqdInfo> getKcqdInfos(String kch);
}
