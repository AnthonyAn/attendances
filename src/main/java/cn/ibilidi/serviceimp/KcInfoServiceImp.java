package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.KcInfoDao;
import cn.ibilidi.model.KcInfo;
import cn.ibilidi.service.KcInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KcInfoServiceImp implements KcInfoService {

    @Autowired
    KcInfoDao kcInfoDao;

    public KcInfo getKcInfoByKch(String kch) {
        return kcInfoDao.getKcInfoByKch(kch);
    }
}
