package cn.ibilidi.dao;

import cn.ibilidi.model.KcqdInfo;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface KcqdInfoDao {
    int insertQdInfo(KcqdInfo kcqdInfo);
    ArrayList<KcqdInfo> getKcqdInfos(@Param("kch") String kch);
    int getIsSignOrNot(@Param("kch") String kch,@Param("xh") String xh);
}
