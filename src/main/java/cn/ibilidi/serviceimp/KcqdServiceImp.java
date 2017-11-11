package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.KcqdInfoDao;
import cn.ibilidi.exception.IllegalSignInException;
import cn.ibilidi.model.KcInfo;
import cn.ibilidi.model.KcqdInfo;
import cn.ibilidi.service.KcInfoService;
import cn.ibilidi.service.KcqdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class KcqdServiceImp implements KcqdService{
    @Autowired
    KcInfoService kcInfoService;
    @Autowired
    KcqdInfoDao kcqdInfoDao;

    public int insertQdInfo(KcqdInfo kcqdInfo) throws IllegalSignInException {
        KcInfo kcInfo=kcInfoService.getKcInfoByKch(kcqdInfo.getKch());
        if(kcInfo.getAllowornot()!=1){
            throw new IllegalSignInException("该课程入口未开启，签到失败");
        }
        if(this.hasSignIn(kcqdInfo.getKch(),kcqdInfo.getXh())){
            throw new IllegalSignInException("你今天已经签过到了，签到失败");
        }
        return kcqdInfoDao.insertQdInfo(kcqdInfo);
    }

    public ArrayList<KcqdInfo> getKcqdInfos(String kch) {
        return kcqdInfoDao.getKcqdInfos(kch);
    }

    public boolean hasSignIn(String kch, String xh) {
        return   kcqdInfoDao.getIsSignOrNot(kch,xh)!=0;
    }


}
