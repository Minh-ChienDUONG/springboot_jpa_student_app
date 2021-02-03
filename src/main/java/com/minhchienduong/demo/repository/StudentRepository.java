package com.minhchienduong.demo.repository;

import com.minhchienduong.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByFirstName(String firstName);
    Student findByFirstNameAndLastName (String firstName, String lastName);
    List<Student> findByFirstNameOrLastName (String firstName, String lastName);
    List<Student> findByFirstNameIn (List<String> firstNames);

    @Query("From Student where firstName = :firstname and lastName = :lastName")
    Student getByFirstNameAndLastName ( @Param("firstname") String firstName, String lastName);

    @Modifying
    @Transactional
    @Query("Update Student set firstName = :firstName where id = :id")
    Integer updateFirstName (Long id, String firstName);

    @Modifying
    @Transactional
    @Query("Delete From Student where firstName = :firstName")
    Integer deleteByFirstName (String firstName);

    List<Student> findByAddressCity (String city);

    @Query("From Student where address.city = :city")
    List<Student> getByAddressCity (String city);



}
