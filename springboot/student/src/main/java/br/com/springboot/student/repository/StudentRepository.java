package br.com.springboot.student.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.springboot.student.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{
}

