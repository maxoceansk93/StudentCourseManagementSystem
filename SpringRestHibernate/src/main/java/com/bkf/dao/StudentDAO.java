package com.bkf.dao;

import java.util.List;

import com.bkf.persistence.Student;

public interface StudentDAO
{
    public void createStudent(Student student);
    
    public Student getStudentById(long id);
    public List<Student> getAllStudents();
    
    public void updateStudent(Student student);
    
    public void deleteStudent(long id);
}
