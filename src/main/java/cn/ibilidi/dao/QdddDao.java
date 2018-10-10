package cn.ibilidi.dao;

import cn.ibilidi.model.Qddd;

public interface QdddDao {
    Qddd getQdddByKch(String kch);
    int addQddd(Qddd qddd);
}
