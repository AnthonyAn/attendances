package cn.ibilidi.controller;


import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.KcInfo;
import cn.ibilidi.service.KcInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;

@Controller
@RequestMapping("/kcinfo")
public class KcInfoController {
    @Autowired
    KcInfoService kcInfoService;

    @RequestMapping("/getKcinfoBykch/{kch}")
    @ResponseBody
    public HashMap<String,Object> getKcinfoBykch(@PathVariable String kch){
        HashMap<String,Object> map=new HashMap<String, Object>();
        KcInfo kcinfo= kcInfoService.getKcInfoByKch(kch);
        map.put(GlobalConstants.DATA,kcinfo);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }
}
