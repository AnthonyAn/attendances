package cn.ibilidi.controller;

import cn.ibilidi.exception.IllegalSignInException;
import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.KcqdInfo;
import cn.ibilidi.service.KcqdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping("/kcqd")
public class KcqdController {
    @Autowired
    KcqdService kcqdService;

    @RequestMapping(value="/signIn",method = RequestMethod.POST)
    @ResponseBody
    public HashMap<String,Object> signIn(@RequestBody KcqdInfo kcqdInfo){
        kcqdInfo.setQdsj(new Date());
        HashMap<String,Object> map=new HashMap<String, Object>();

        try {
            kcqdService.insertQdInfo(kcqdInfo);
            map.put(GlobalConstants.MESSAGE,"签到成功");
            map.put(GlobalConstants.STATE,200);
        } catch (IllegalSignInException e) {
            map.put(GlobalConstants.MESSAGE,e.getMessage());
            map.put(GlobalConstants.STATE,201);
        }

        return map;
    }

    @RequestMapping("/getKcqdInfosByKch/{kch}")
    @ResponseBody
    public HashMap<String,Object>  getKcqdInfosByKch(@PathVariable String kch) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        ArrayList<KcqdInfo> kcqdInfos = kcqdService.getKcqdInfos(kch);
        map.put(GlobalConstants.DATA, kcqdInfos);
        map.put(GlobalConstants.MESSAGE, "获得签到数据成功");
        map.put(GlobalConstants.STATE, 200);
        return map;
    }
}
