package com.aluracursos.Foro_Hub.Service;
import com.aluracursos.Foro_Hub.Model.topic;
import java.util.List;

public interface CRUD {
    List<topic> findAll();
    topic findByID(Integer id);

    topic save(topic topic);

    topic update(Integer id, topic topic);

    void deleteById(Integer id);
}
