package com.company.trainer.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.company.trainer.beans.Trainer;

@Repository
public interface TrainerRepository extends MongoRepository<Trainer, Integer> {

	public List<Trainer> findByName(String name);

}
