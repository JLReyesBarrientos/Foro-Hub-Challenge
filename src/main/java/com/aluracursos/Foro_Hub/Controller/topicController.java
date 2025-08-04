package com.aluracursos.Foro_Hub.Controller;

import com.aluracursos.Foro_Hub.Model.topic;
import com.aluracursos.Foro_Hub.Service.TopicService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topicos")
@RequiredArgsConstructor
public class topicController {
    private final TopicService service;

    @GetMapping
    public ResponseEntity<List<topic>>findAll(){
        List <topic> respuestaHttp = service.findAll();
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<topic> findById(@PathVariable Integer id){
        topic respuestaHttp = service.findByID(id);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<topic> save(@RequestBody topic topic){
        topic respuestaHttp = service.save(topic);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<topic> update(@PathVariable Integer id, @RequestBody topic topic){
        topic.setId(id);
        topic respuestaHttp = service.save(topic);
        return new ResponseEntity<>(respuestaHttp, HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Integer id){
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
