package com.demo.feign;

import com.demo.pojo.Student;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @ClassName: FeignError
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/8 - 10:56
 * @Vesion: 1.0
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "服务器维护中";
    }

    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public Student findById(long id) {
        return null;
    }

    @Override
    public void save(Student student) {

    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void deleteById(long id) {

    }
}
