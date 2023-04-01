package es.upm.dit.isst.tfgapi.repository;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository; 
import es.upm.dit.isst.tfgapi.model.TFGmodel;


public interface TFGRepository extends CrudRepository<TFGmodel, String>{
    List<TFGmodel> findByTutor(String tutor); 
}
