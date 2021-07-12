package com.demo.repositoy;

import com.demo.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: StudentRepositoryImpl
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 13:44
 * @Vesion: 1.0
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private Map<Long,Student> studentMap;

    public StudentRepositoryImpl() {
       studentMap = new HashMap<>();
       studentMap.put(1L,new Student(1L,"张三",'男'));
       studentMap.put(2L,new Student(2L,"李四",'男'));
       studentMap.put(3L,new Student(3L,"小红",'女'));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveorupdate(Student student) {
        studentMap.put(student.getId(),student);
    }

    @Override
    public void deleteById(long id) {
        studentMap.remove(id);
    }
}
