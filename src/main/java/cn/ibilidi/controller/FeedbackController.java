package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.Feedback;
import cn.ibilidi.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @ResponseBody
    @RequestMapping(value="/addFeedback",method = RequestMethod.POST)
    public HashMap<String,Object> addFeedback(@RequestBody Feedback feedback){
        feedbackService.addFeedback(feedback);
        HashMap<String,Object> map=new HashMap<String, Object>();

        map.put(GlobalConstants.MESSAGE,"反馈成功！");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @ResponseBody
    @RequestMapping(value="/getFeedback")
    public HashMap<String,Object> getFeedback(){
        ArrayList<Feedback> feedbacks=feedbackService.getFeedbacks();
        HashMap<String,Object> map=new HashMap<String, Object>();
        map.put(GlobalConstants.DATA,feedbacks);
        map.put(GlobalConstants.MESSAGE,"success！");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

}
