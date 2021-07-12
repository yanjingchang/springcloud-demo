package com.demo.repositoy;

import com.demo.pojo.Student;

import java.util.Collection;

/**
 * @ClassName: StudentRepositoy
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 13:43
 * @Vesion: 1.0
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveorupdate(Student student);
    public void deleteById(long id);
}
