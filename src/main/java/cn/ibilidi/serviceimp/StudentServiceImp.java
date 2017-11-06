package cn.ibilidi.serviceimp;

import cn.ibilidi.dao.StudentDao;
import cn.ibilidi.model.Student;
import cn.ibilidi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class StudentServiceImp implements StudentService {

    @Autowired
    StudentDao studentDao;

    public Student getStudentById(String id) {
        return studentDao.getStudent(1,id);
    }

    public Student getStudentByOpenid(String openid) {
        return studentDao.getStudent(0,openid);
    }

    public ArrayList<Student> getStudentsByBj(String bj) {
        return studentDao.getStudents(0,bj);
    }

    public ArrayList<Student> getStudentsByZy(String zy) {
        return studentDao.getStudents(1,zy);
    }

    public ArrayList<Student> getStudentsByNj(String nj) {
        return studentDao.getStudents(2,nj);
    }

    public ArrayList<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public ArrayList<Student> getStudentsByKch(String kch) {
        return studentDao.getStudentsByKch(kch);
    }
}
