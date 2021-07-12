package com.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: Student
 * @Description:
 * @Author: 颜景昌
 * @Date: 2021/7/7 - 13:40
 * @Vesion: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private long id;
    private String name;
    private char gender;
}
