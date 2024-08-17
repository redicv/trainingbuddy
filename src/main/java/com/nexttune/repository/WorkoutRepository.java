package com.nexttune.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nexttune.model.Workout;


@Repository
public interface WorkoutRepository extends JpaRepository<Workout,Long>{
    
}
