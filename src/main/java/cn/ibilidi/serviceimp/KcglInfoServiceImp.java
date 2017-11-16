package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.KcglInfoDao;
import cn.ibilidi.model.KcglInfo;
import cn.ibilidi.service.KcglInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class KcglInfoServiceImp implements KcglInfoService{

    @Autowired
    KcglInfoDao kcglInfoDao;

    public KcglInfo getKcglInfoByXh(String xh) {
        return kcglInfoDao.getKcglInfoByXh(xh);
    }
}
