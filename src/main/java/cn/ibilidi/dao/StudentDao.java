package cn.ibilidi.dao;

import cn.ibilidi.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;

public interface StudentDao {
    Student getStudent(int flag,String id_or_openid);
    ArrayList<Student> getStudents(@Param("flag") int flag,@Param("bj_or_zy_or_nj") String bj_or_zy_or_nj);
    ArrayList<Student> getAllStudents();
    ArrayList<Student> getStudentsByKch(@Param("kch") String kch);

}
