package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.Qddd;
import cn.ibilidi.service.QdddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/qddd")
public class QdddController {
    @Autowired
    QdddService qdddService;

    @ResponseBody
    @RequestMapping("/getQdddByKch/{kch}")
    public Map<String,Object> getQdddByKhc(@PathVariable String kch){
        Map<String,Object> map=new HashMap<String, Object>();
        Qddd qddd= qdddService.getQdddByKch(kch);
        map.put(GlobalConstants.DATA,qddd);
        map.put(GlobalConstants.STATE,200);
        map.put(GlobalConstants.MESSAGE,"success");
        return map;
    }

    @ResponseBody
    @RequestMapping(value = "/addQddd",method = RequestMethod.POST)
    public Map<String,Object> addQddd(@RequestBody Qddd qddd){
        qddd.setSj(new Date());
        qddd.setDis(150);
        qdddService.addQddd(qddd);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }
}
