package com.example.journallistfinaljavaweb.repository;

import com.example.journallistfinaljavaweb.entity.Image;
import jakarta.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends CrudRepository<Image,Long> {


    public List<Image> findAllById(long image_id);


}

