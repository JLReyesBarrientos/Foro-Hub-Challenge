package com.aluracursos.Foro_Hub.Service;

import com.aluracursos.Foro_Hub.Model.topic;
import com.aluracursos.Foro_Hub.Repository.ITopicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TopicService implements CRUD {
    private final ITopicRepository repository;
    private Integer id;

    @Override
    public List<topic> findAll(){
        return repository.findAll();
    }

    @Override
    public topic findByID(Integer id){
        return null;
    }

    @Override
    public topic save(topic topic) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public topic update(Integer id, topic topic) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }
}
