package cn.ibilidi.service;

import cn.ibilidi.model.Qddd;

public interface QdddService {
    Qddd getQdddByKch(String kch);
    int addQddd(Qddd qddd);
}
