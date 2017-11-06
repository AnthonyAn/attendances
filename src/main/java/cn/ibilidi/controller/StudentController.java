package cn.ibilidi.controller;

import cn.ibilidi.global.GlobalConstants;
import cn.ibilidi.model.Student;
import cn.ibilidi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/getStudentByOpenid/{openid}")
    @ResponseBody
    public HashMap<String ,Object> getStudentByOpenid(@PathVariable String openid){
        HashMap<String,Object> map=new HashMap<String, Object>();

        Student student= studentService.getStudentByOpenid(openid);
        map.put(GlobalConstants.DATA,student);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getStudentById/{id}")
    @ResponseBody
    public HashMap<String ,Object> getStudentById(@PathVariable String id){
        HashMap<String,Object> map=new HashMap<String, Object>();

        Student student= studentService.getStudentById(id);
        map.put(GlobalConstants.DATA,student);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getStudentsByBj/{bj}")
    @ResponseBody
    public HashMap<String ,Object> getStudentsByBj(@PathVariable String bj){
        HashMap<String,Object> map=new HashMap<String, Object>();

        ArrayList<Student> students= studentService.getStudentsByBj(bj);
        map.put(GlobalConstants.DATA,students);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getStudentsByZy/{zy}")
    @ResponseBody
    public HashMap<String ,Object> getStudentsByZy(@PathVariable String zy){
        HashMap<String,Object> map=new HashMap<String, Object>();

        ArrayList<Student> students= studentService.getStudentsByZy(zy);
        map.put(GlobalConstants.DATA,students);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getStudentsByNj/{nj}")
    @ResponseBody
    public HashMap<String ,Object> getStudentsByNj(@PathVariable String nj){
        HashMap<String,Object> map=new HashMap<String, Object>();

        ArrayList<Student> students= studentService.getStudentsByNj(nj);
        map.put(GlobalConstants.DATA,students);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }


    @RequestMapping("/getStudentsByKch/{kch}")
    @ResponseBody
    public HashMap<String ,Object> getStudentsByKch(@PathVariable String kch){
        HashMap<String,Object> map=new HashMap<String, Object>();

        ArrayList<Student> students= studentService.getStudentsByKch(kch);
        map.put(GlobalConstants.DATA,students);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }

    @RequestMapping("/getAllStudents")
    @ResponseBody
    public HashMap<String ,Object> getAllStudents(){
        HashMap<String,Object> map=new HashMap<String, Object>();

        ArrayList<Student> students= studentService.getAllStudents();
        map.put(GlobalConstants.DATA,students);
        map.put(GlobalConstants.MESSAGE,"success");
        map.put(GlobalConstants.STATE,200);
        return map;
    }
}
