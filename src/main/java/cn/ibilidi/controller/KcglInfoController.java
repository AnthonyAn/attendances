package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.KcglInfo;
import cn.ibilidi.service.KcglInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/kcgl")
public class KcglInfoController {
    @Autowired
    KcglInfoService kcglInfoService;

    @RequestMapping("/getKcglInfoByxh/{xh}")
    @ResponseBody
    public Map<String,Object>getKcglInfoByxh(@PathVariable String xh){
        Map<String,Object> map=new HashMap<String,Object>() ;
        KcglInfo kcglInfo=kcglInfoService.getKcglInfoByXh(xh);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        map.put(GlobalConstants.DATA,kcglInfo);
        return  map;
    }
}
