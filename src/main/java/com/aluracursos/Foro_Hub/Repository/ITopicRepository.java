package com.aluracursos.Foro_Hub.Repository;

import com.aluracursos.Foro_Hub.Model.topic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITopicRepository extends JpaRepository<topic, Integer> {

}
