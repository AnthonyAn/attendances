package cn.ibilidi.service;

import cn.ibilidi.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

public interface StudentService {
    Student getStudentById(String id);
    Student getStudentByOpenid(String openid);
    ArrayList<Student> getStudentsByBj(String bj);
    ArrayList<Student> getStudentsByZy(String zy);
    ArrayList<Student> getStudentsByNj(String nj);
    ArrayList<Student> getAllStudents();
    ArrayList<Student> getStudentsByKch(String kch);
}
