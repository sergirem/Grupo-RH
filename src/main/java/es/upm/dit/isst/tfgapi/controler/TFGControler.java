package es.upm.dit.isst.tfgapi.controler;


import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.upm.dit.isst.tfgapi.model.TFGmodel;
import es.upm.dit.isst.tfgapi.repository.TFGRepository;
import org.springframework.data.repository.CrudRepository;

 @RestController
public class TFGControler {
    private final TFGRepository tfgRepository;
    public static final Logger log = LoggerFactory.getLogger(TFGControler.class);
    public TFGControler(TFGRepository t) {
        this.tfgRepository = t;
    }
    @GetMapping("/tfgs")
    List<TFGmodel> readAll() {
      return (List<TFGmodel>) tfgRepository.findAll();
    }
 
    @PostMapping("/tfgs")
    ResponseEntity<TFGmodel> create(@RequestBody TFGmodel newTFG) throws URISyntaxException {
      TFGmodel result = tfgRepository.save(newTFG);
      return ResponseEntity.created(new URI("/tfgs/" + result.getEmail())).body(result);
    }
 
    @GetMapping("/tfgs/{id}")
    ResponseEntity<TFGmodel> read(@PathVariable String id) {
      return tfgRepository.findById(id).map( tfg ->
            ResponseEntity.ok().body(tfg) 
      ).orElse(new ResponseEntity<TFGmodel>(HttpStatus.NOT_FOUND));
    }
    @PutMapping("/tfgs/{id}")
    ResponseEntity<TFGmodel> update(@RequestBody TFGmodel newTFG, @PathVariable String id) {
      return tfgRepository.findById(id).map(tfg -> {
        tfg.setNombre(newTFG.getNombre());
        tfg.setTitulo(newTFG.getTitulo());
        tfg.setTutor(newTFG.getTutor());
        tfg.setStatus(newTFG.getStatus());
        tfg.setNota(newTFG.getNota());
        tfg.setMemoria(newTFG.getMemoria());
        tfgRepository.save(tfg);
        return ResponseEntity.ok().body(tfg);
      }).orElse(new ResponseEntity<TFGmodel>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("tfgs/{id}")
    ResponseEntity<TFGmodel> delete(@PathVariable String id) {
      tfgRepository.deleteById(id);
      return ResponseEntity.ok().body(null);
    }
    @GetMapping("/tfgs/profesor/{id}")
    List<TFGmodel> readTutor(@PathVariable String id) {
      return (List<TFGmodel>) tfgRepository.findByTutor(id);
    }
    @PostMapping("/tfgs/{id}/incrementa")
    ResponseEntity<TFGmodel> incrementa(@PathVariable String id) {
      return tfgRepository.findById(id).map(tfg -> {
        tfg.setStatus(tfg.getStatus() + 1);
        tfgRepository.save(tfg);
        return ResponseEntity.ok().body(tfg);
      }).orElse(new ResponseEntity<TFGmodel>(HttpStatus.NOT_FOUND));  
    }
}

