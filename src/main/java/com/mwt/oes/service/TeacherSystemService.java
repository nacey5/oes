package com.mwt.oes.service;

import com.mwt.oes.domain.Teacher;

import java.util.List;

/**
 * @author DAHUANG
 * @date 2022/9/03
 */
public interface TeacherSystemService {
    public List<Teacher> teacherLogin(String tno, String psw);
    public boolean updateTeacher(Teacher teacher);
    public String getTeaHuPsw(String tno);
}
