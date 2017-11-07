package cn.ibilidi.dao;

import cn.ibilidi.model.KcInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface KcInfoDao {
    KcInfo getKcInfoByKch(@Param("kch") String kch);
    ArrayList<KcInfo> getKcInfosByJsh(@Param("jsh") String jsh);
    ArrayList<KcInfo> getKcInfosByXh(@Param("xh") String xh);
}
