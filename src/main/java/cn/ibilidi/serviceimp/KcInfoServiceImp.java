package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.KcInfoDao;
import cn.ibilidi.dao.KcqdInfoDao;
import cn.ibilidi.model.KcInfo;
import cn.ibilidi.model.KcqdInfo;
import cn.ibilidi.service.KcInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class KcInfoServiceImp implements KcInfoService {

    @Autowired
    KcInfoDao kcInfoDao;

    @Autowired
    KcqdInfoDao kcqdInfoDao;

    public KcInfo getKcInfoByKch(String kch) {
        return kcInfoDao.getKcInfoByKch(kch);
    }

    public ArrayList<KcInfo> getKcInfosByJsh(String jsh,String kcmc,String jxdd) {
        return kcInfoDao.getKcInfosByJsh(jsh,kcmc,jxdd);
    }

    public ArrayList<KcInfo> getKcInfosByXh(String xh) {
        return kcInfoDao.getKcInfosByXh(xh);
    }

    public int updataAllowOrNot(String kch, int allowornot) {
        return kcInfoDao.updateAllowOrNot(kch,allowornot);
    }

    public int changeAllowOrNot(String kch){
        KcInfo kcInfo=this.getKcInfoByKch(kch);
        if(kcInfo.getAllowornot()==0){
            return this.updataAllowOrNot(kch,1);
        }else {
            return this.updataAllowOrNot(kch,0);

        }
    }

}
