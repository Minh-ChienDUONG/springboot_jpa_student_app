package com.minhchienduong.demo.service;

import com.minhchienduong.demo.entity.Student;
import com.minhchienduong.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student>  getAllStudents() {
        return studentRepository.findAll();
    }
}
