package com.minhchienduong.demo.repository;

import com.minhchienduong.demo.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
