package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.QdddDao;
import cn.ibilidi.model.Qddd;
import cn.ibilidi.service.QdddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QdddServiceImp implements QdddService {

    @Autowired
    QdddDao qdddDao;
    public Qddd getQdddByKch(String kch) {
        return qdddDao.getQdddByKch(kch);
    }
    
    public int addQddd(Qddd qddd) {
        return qdddDao.addQddd(qddd);
    }
}
