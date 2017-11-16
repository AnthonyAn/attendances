package cn.ibilidi.dao;

import cn.ibilidi.model.KcglInfo;
import org.apache.ibatis.annotations.Param;

public interface KcglInfoDao {
    KcglInfo getKcglInfoByXh(@Param("xh") String xh);
}
