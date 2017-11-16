package cn.ibilidi.service;

import cn.ibilidi.dao.KcglInfoDao;
import cn.ibilidi.model.KcglInfo;
import org.springframework.stereotype.Service;

public interface KcglInfoService {
    KcglInfo getKcglInfoByXh(String xh);
}
