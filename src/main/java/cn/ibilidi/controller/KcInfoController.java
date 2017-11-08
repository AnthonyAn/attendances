package cn.ibilidi.controller;


import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.KcInfo;
import cn.ibilidi.model.KcqdInfo;
import cn.ibilidi.service.KcInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping("/kcinfo")
public class KcInfoController {
    @Autowired
    KcInfoService kcInfoService;

    @RequestMapping("/getKcinfoByKch/{kch}")
    @ResponseBody
    public HashMap<String,Object> getKcinfoByKch(@PathVariable String kch){
        HashMap<String,Object> map=new HashMap<String, Object>();
        KcInfo kcinfo= kcInfoService.getKcInfoByKch(kch);
        map.put(GlobalConstants.DATA,kcinfo);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getKcinfosByJsh/{jsh}")
    @ResponseBody
    public HashMap<String,Object> getKcinfosByJsh(@PathVariable String jsh,String kcmc,String jxdd){
        System.out.print(jsh+kcmc+jxdd);
        HashMap<String,Object> map=new HashMap<String, Object>();
        ArrayList<KcInfo> kcinfos= kcInfoService.getKcInfosByJsh(jsh,kcmc,jxdd);
        map.put(GlobalConstants.DATA,kcinfos);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }


    @RequestMapping("/getKcinfosByXh/{xh}")
    @ResponseBody
    public HashMap<String,Object> getKcinfosByXh(@PathVariable String xh){
        HashMap<String,Object> map=new HashMap<String, Object>();
        ArrayList<KcInfo> kcinfos= kcInfoService.getKcInfosByXh(xh);
        map.put(GlobalConstants.DATA,kcinfos);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/updataKcqdAllow/{kch}")
    @ResponseBody
    public HashMap<String,Object> updataKcqdAllow(@PathVariable String kch){
        HashMap<String,Object> map=new HashMap<String, Object>();
        kcInfoService.updataAllowOrNot(kch,1);
        map.put(GlobalConstants.MESSAGE,"课程签到入口已打开");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/updataKcqdNotAllow/{kch}")
    @ResponseBody
    public HashMap<String,Object> updataKcqdNotAllow(@PathVariable String kch){
        HashMap<String,Object> map=new HashMap<String, Object>();
        kcInfoService.updataAllowOrNot(kch,0);
        map.put(GlobalConstants.MESSAGE,"课程签到入口已关闭");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

}
